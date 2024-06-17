package br.com.ada.designpattern.factorymethods;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Produto {
    private String descricao;
    private BigDecimal preco;
    private Boolean possuiDimensoesFisicas;
}
