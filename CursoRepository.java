package desafio_forum.demo;

import desafio_forum.demo.entidade.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}

