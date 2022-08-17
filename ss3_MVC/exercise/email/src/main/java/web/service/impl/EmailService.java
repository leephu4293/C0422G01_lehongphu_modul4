package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.repository.IEmailRepository;
import web.service.IEmailService;

import java.util.List;
@Service
public class EmailService implements IEmailService {
    @Autowired
    private IEmailRepository iEmailRepository;

    @Override
    public List<String> language() {
        return this.iEmailRepository.language();
    }

    @Override
    public List<String> pageSize() {
        return this.iEmailRepository.pageSize();
    }
}
