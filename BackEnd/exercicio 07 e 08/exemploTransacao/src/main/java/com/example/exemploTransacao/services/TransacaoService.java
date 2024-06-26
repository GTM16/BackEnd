package com.example.exemploTransacao.services;

import com.example.exemploTransacao.dtos.TransacaoDto;
import com.example.exemploTransacao.mappers.TransacaoMapper;
import com.example.exemploTransacao.models.TransacaoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService{
    @Autowired
    TransacaoMapper transacaoMapper;

    public TransacaoDto getTransacao() {
        TransacaoModel transacao = new TransacaoModel("Gabriel","Maria Eduarda", 20.0);
        return transacaoMapper.toDto(transacao);
    }
}
