package web.repository.impl;

import org.springframework.stereotype.Repository;
import web.repository.IMenuRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MenuRepository implements IMenuRepository {
    private static List<String> list = new ArrayList<>();

    static {
        list.add("Letture");
        list.add("Tomato");
        list.add("Mustard");
        list.add("Sprouts");
    }

    @Override
    public List<String> displayMenu() {
        return list;
    }
}
