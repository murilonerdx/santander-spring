package com.murilonerdx.santander.model.pk;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class PKBancoHoras implements Serializable {
    private Long idBancoHoras;
    private Long idMovimentacao;
    private Long idUsuario;
}
