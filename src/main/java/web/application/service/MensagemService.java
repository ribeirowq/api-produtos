package web.application.service;

import org.springframework.stereotype.Service;
import web.application.repository.MensagemRepository;

@Service
public class MensagemService {
    private final MensagemRepository msgRepository;

    public MensagemService(MensagemRepository repository) {
        this.msgRepository = repository;
    }

    public String obterMensagem(){
        return msgRepository.obterMensagem();
    }
}
