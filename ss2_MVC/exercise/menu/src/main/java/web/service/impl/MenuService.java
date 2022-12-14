package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.repository.IMenuRepository;
import web.service.IMenuService;

import java.util.List;

@Service
public class MenuService implements IMenuService {
    @Autowired
    private IMenuRepository iMenuRepository;

    @Override
    public List<String> displayMenu() {
        return this.iMenuRepository.displayMenu();
    }
}
