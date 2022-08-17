package web.service;

import java.util.List;

public interface IMedicalService {
    List<String> day();
    List<String> month();
    List<String> gender();
    List<String> nation();
    List<String> year();
    List<String> travel();
}
