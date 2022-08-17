package web.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService{
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    @Override
    public boolean checkEmail(String str) {
        return str.matches(EMAIL_REGEX);
    }
}
