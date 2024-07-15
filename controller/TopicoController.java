import desafio_forum.demo.dto.TopicoDTO;
import desafio_forum.demo.entidade.Topico;
import desafio_forum.demo.repositoy.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public List<TopicoDTO> listar() {
        List<Topico> topicos = topicoService.findAll();
        return topicos.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @PostMapping
    public TopicoDTO registrar(@RequestBody TopicoDTO topicoDTO) {
        Topico topico = convertToEntity(topicoDTO);
        Topico topicoSalvo = topicoService.save(topico);
        return convertToDTO(topicoSalvo);
    }

    @PutMapping("/{id}")
    public TopicoDTO atualizar(@PathVariable Long id, @RequestBody TopicoDTO topicoDTO) {
        Topico topico = convertToEntity(topicoDTO);
        topico.setId(id);
        Topico topicoAtualizado = topicoService.update(topico);
        return convertToDTO(topicoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        topicoService.delete(id);
    }

    private TopicoDTO convertToDTO(Topico topico) {
        TopicoDTO topicoDTO = new TopicoDTO();
        topicoDTO.setId(topico.getId());
        topicoDTO.setTitulo(topico.getTitulo());
        topicoDTO.setCursoId(topico.getCurso().getId());
        topicoDTO.setAutorId(topico.getAutor().getId());
        topicoDTO.setMensagemIds(topico.getMensagens().stream().map(Mensagem::getId).collect(Collectors.toList()));
        return topicoDTO;
    }

    private Topico convertToEntity(TopicoDTO topicoDTO) {
        Topico topico = new Topico();
        topico.setTitulo(topicoDTO.getTitulo());
        // O mapeamento dos IDs de Curso e Autor para entidades deve ser feito no serviço.
        return topico;
    }
}
