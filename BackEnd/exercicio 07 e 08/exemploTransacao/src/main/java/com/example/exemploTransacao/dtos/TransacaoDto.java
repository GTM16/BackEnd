package com.example.exemploTransacao.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public record TransacaoDto (
        @NotBlank(message = "O nome do recebedor não pode estar em branco")
        String recebedor,
        @NotBlank(message = "O nome do pagador não pode estar em branco")
        String pagador,
        @NotNull(message = "A quantidade não pode ser nula")
        @Positive(message = "A quantidade deve ser positiva")
        Double quantidade
){
}
