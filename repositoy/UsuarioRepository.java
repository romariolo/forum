package desafio_forum.demo.repositoy;

import desafio_forum.demo.entidade.Usuario;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    DynamicType.Builder.FieldDefinition.Optional<Usuario> findByEmail(String email);
}
