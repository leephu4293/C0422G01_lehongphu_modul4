package web.repository.impl;

import org.springframework.stereotype.Repository;
import web.repository.IMedicalRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepository implements IMedicalRepository {
    private static List<String> listYear= new ArrayList<>();
    private static List<String> listGender= new ArrayList<>();
    private static List<String> listNation= new ArrayList<>();
    private static List<String> listDay= new ArrayList<>();
    private static List<String> listMonth= new ArrayList<>();
    private static List<String> listTravel=new ArrayList<>();

    static {
        listTravel.add("May bay");
        listTravel.add("Tau Thuyen");
        listTravel.add("Oto");
        listTravel.add("Khac");

        listGender.add("Nam");
        listGender.add("Nu");
        listNation.add("Viet Nam");
        listNation.add("Not Viet Nam");
        int index= 1;
        for (int i = 1; i <= 30; i++) {
            listDay.add(String.valueOf(index));
            index++;
        }

        int indexYear= 1900;
        for (int i = 1900; i <= 2022; i++) {
            listYear.add(String.valueOf(indexYear));
            indexYear++;
        }

        int indexMonth= 1;
        for (int i = 1; i <= 12; i++) {
            listMonth.add(String.valueOf(indexMonth));
            indexMonth++;
        }
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
