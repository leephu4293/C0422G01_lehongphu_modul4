package web.repository;

import web.model.Medical;

import java.util.List;

public interface IMedicalRepository {
    void save(Medical medical);

    Medical find(String id);

    void update(Medical medical);

    List<Medical> display();

    List<String> day();

    List<String> month();

    List<String> gender();

    List<String> nation();

    List<String> year();

    List<String> travel();
}
