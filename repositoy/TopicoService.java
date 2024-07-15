package desafio_forum.demo.repositoy;

import desafio_forum.demo.entidade.Topico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> findAll() {
        return topicoRepository.findAll();
    }

    public Topico save(Topico topico) {
        return topicoRepository.save(topico);
    }

    public Topico update(Topico topico) {
        return topicoRepository.save(topico);
    }

    public void delete(Long id) {
        topicoRepository.deleteById(id);
    }
}

