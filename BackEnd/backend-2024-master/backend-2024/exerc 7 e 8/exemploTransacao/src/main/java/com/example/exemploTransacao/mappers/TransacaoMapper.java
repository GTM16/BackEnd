package com.example.exemploTransacao.mappers;

import com.example.exemploTransacao.dtos.TransacaoDto;
import com.example.exemploTransacao.models.TransacaoModel;
import org.springframework.stereotype.Component;

@Component
public class TransacaoMapper {
    public TransacaoDto toDto(TransacaoModel transacao) {
        TransacaoDto transacaoDto = new TransacaoDto(
                transacao.getRecebedor(),
                transacao.getPagador(),
                transacao.getQuantidade()
        );
        return transacaoDto;
    }
}

