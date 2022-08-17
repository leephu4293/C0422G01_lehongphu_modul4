package web.repository;

import java.util.List;

public interface IMedicalRepository {
  List<String> day();
  List<String> month();
  List<String> gender();
  List<String> nation();
  List<String> year();
  List<String> travel();
}
