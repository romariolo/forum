package desafio_forum.demo.repositoy;

import desafio_forum.demo.entidade.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensagemService {
    @Autowired
    private MensagemRepository mensagemRepository;

    public List<Mensagem> findByTopico(Long topicoId) {
        return mensagemRepository.findByTopicoId(topicoId);
    }

    public Mensagem save(Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }
}

