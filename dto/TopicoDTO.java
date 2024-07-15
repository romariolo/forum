package desafio_forum.demo.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class TopicoDTO {
    private Long id;
    private String titulo;
    private Long cursoId;
    private Long autorId;
    private List<Long> mensagemIds;

}
