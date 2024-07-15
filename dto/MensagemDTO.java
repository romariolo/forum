package desafio_forum.demo.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class MensagemDTO {
    private Long id;
    private String conteudo;
    private LocalDateTime dataPostagem;
    private Long autorId;
    private Long topicoId;

}
