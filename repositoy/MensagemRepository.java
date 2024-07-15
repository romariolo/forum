package desafio_forum.demo.repositoy;

import desafio_forum.demo.entidade.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}

