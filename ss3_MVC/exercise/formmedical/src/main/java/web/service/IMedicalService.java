package web.service;

import web.model.Medical;

import java.util.List;

public interface IMedicalService {
    void save(Medical medical);

    void update(Medical medical);

    Medical find(String id);

    List<Medical> display();

    List<String> day();

    List<String> month();

    List<String> gender();

    List<String> nation();

    List<String> year();

    List<String> travel();
}
