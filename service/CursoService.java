package desafio_forum.demo.service;

import desafio_forum.demo.CursoRepository;
import desafio_forum.demo.entidade.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }
}

