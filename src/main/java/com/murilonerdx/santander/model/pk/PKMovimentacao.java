package com.murilonerdx.santander.model.pk;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class PKMovimentacao implements Serializable {
    private Long id;
    private Long idUsuario;
}
