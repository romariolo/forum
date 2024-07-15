package desafio_forum.demo.repositoy;

import desafio_forum.demo.entidade.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}

