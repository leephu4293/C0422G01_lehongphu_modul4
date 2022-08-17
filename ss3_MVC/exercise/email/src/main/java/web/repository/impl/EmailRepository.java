package web.repository.impl;

import org.springframework.stereotype.Repository;

import web.repository.IEmailRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepository implements IEmailRepository {
    private static List<String> listLanguage = new ArrayList<>();
    private static List<String> listSize = new ArrayList<>();

    static {
        listLanguage.add("English");
        listLanguage.add("Vietnamese");
        listLanguage.add("Japanese");
        listLanguage.add("Chinese");

        listSize.add("5");
        listSize.add("10");
        listSize.add("15");
        listSize.add("25");
        listSize.add("50");
        listSize.add("100");
    }

    @Override
    public List<String> language() {
        return listLanguage;
    }

    @Override
    public List<String> pageSize() {
        return listSize;
    }
}
