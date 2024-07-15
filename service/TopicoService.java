package desafio_forum.demo.service;

import desafio_forum.demo.CursoRepository;
import desafio_forum.demo.entidade.Topico;
import desafio_forum.demo.repositoy.TopicoRepository;
import desafio_forum.demo.repositoy.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Topico> findAll() {
        return topicoRepository.findAll();
    }

    public Topico save(Topico topico) {
        // Realizar o mapeamento dos IDs de Curso e Autor para entidades
        topico.setCurso(cursoRepository.findById(topico.getCurso().getId()).orElseThrow(() -> new RuntimeException("Curso não encontrado")));
        topico.setAutor(usuarioRepository.findById(topico.getAutor().getId()).orElseThrow(() -> new RuntimeException("Autor não encontrado")));
        return topicoRepository.save(topico);
    }

    public Topico update(Topico topico) {
        // Realizar o mapeamento dos IDs de Curso e Autor para entidades
        topico.setCurso(cursoRepository.findById(topico.getCurso().getId()).orElseThrow(() -> new RuntimeException("Curso não encontrado")));
        topico.setAutor(usuarioRepository.findById(topico.getAutor().getId()).orElseThrow(() -> new RuntimeException("Autor não encontrado")));
        return topicoRepository.save(topico);
    }

    public void delete(Long id) {
        topicoRepository.deleteById(id);
    }
}

