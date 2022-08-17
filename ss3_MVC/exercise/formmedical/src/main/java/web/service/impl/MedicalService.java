package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.repository.IMedicalRepository;
import web.service.IMedicalService;

import java.util.List;

@Service
public class MedicalService  implements IMedicalService {
    @Autowired
     private   IMedicalRepository iMedicalRepository;

    @Override
    public List<String> day() {
        return this.iMedicalRepository.day();
    }

    @Override
    public List<String> month() {
        return this.iMedicalRepository.month();
    }

    @Override
    public List<String> gender() {
        return this.iMedicalRepository.gender();
    }

    @Override
    public List<String> nation() {
        return this.iMedicalRepository.nation();
    }

    @Override
    public List<String> year() {
        return this.iMedicalRepository.year();
    }

    @Override
    public List<String> travel() {
        return this.iMedicalRepository.travel();
    }
}
