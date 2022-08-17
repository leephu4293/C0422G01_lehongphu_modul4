package web.repository.impl;

import org.springframework.stereotype.Repository;
import web.model.Medical;
import web.repository.IMedicalRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MedicalRepository implements IMedicalRepository {
    private static List<String> listYear = new ArrayList<>();
    private static List<String> listGender = new ArrayList<>();
    private static List<String> listNation = new ArrayList<>();
    private static List<String> listDay = new ArrayList<>();
    private static List<String> listMonth = new ArrayList<>();
    private static List<String> listTravel = new ArrayList<>();
    private static Map<String, Medical> medicalMap = new HashMap<>();

    static {
        listTravel.add("May bay");
        listTravel.add("Tau Thuyen");
        listTravel.add("Oto");
        listTravel.add("Khac");

        listGender.add("Nam");
        listGender.add("Nu");
        listNation.add("Viet Nam");
        listNation.add("Not Viet Nam");
        int index = 1;
        for (int i = 1; i <= 30; i++) {
            listDay.add(String.valueOf(index));
            index++;
        }

        int indexYear = 1900;
        for (int i = 1900; i <= 2022; i++) {
            listYear.add(String.valueOf(indexYear));
            indexYear++;
        }

        int indexMonth = 1;
        for (int i = 1; i <= 12; i++) {
            listMonth.add(String.valueOf(indexMonth));
            indexMonth++;
        }
    }

    @Override
    public void save(Medical medical) {
        medicalMap.put(medical.getId(), medical);
    }

    @Override
    public Medical find(String id) {
        Medical medical = null;
        if (medicalMap.containsKey(id)) {
            medical = medicalMap.get(id);
        }
        return medical;
    }

    @Override
    public void update(Medical medical) {
        medicalMap.put(medical.getId(), medical);
    }

    @Override
    public List<Medical> display() {
        return new ArrayList<>(medicalMap.values());
    }

    @Override
    public List<String> day() {
        return listDay;
    }

    @Override
    public List<String> month() {
        return listMonth;
    }

    @Override
    public List<String> gender() {
        return listGender;
    }

    @Override
    public List<String> nation() {
        return listNation;
    }

    @Override
    public List<String> year() {
        return listYear;
    }

    @Override
    public List<String> travel() {
        return listTravel;
    }
}
