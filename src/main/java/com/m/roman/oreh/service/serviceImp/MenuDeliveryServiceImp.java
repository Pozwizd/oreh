package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.entity.MenuDelivery;
import com.m.roman.oreh.repository.MenuDeliveryRepository;
import com.m.roman.oreh.service.MenuDeliveryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuDeliveryServiceImp implements MenuDeliveryService {

    private final MenuDeliveryRepository  menuDeliveryRepository;

    public MenuDeliveryServiceImp(MenuDeliveryRepository menuDeliveryRepository) {
        this.menuDeliveryRepository = menuDeliveryRepository;
    }

    @Override
    public void deleteMenuDelivery(int id) {
        menuDeliveryRepository.deleteById(id);
    }

    @Override
    public void updateMenuDelivery(MenuDelivery menuDelivery) {
        menuDeliveryRepository.save(menuDelivery);
    }

    @Override
    public MenuDelivery getMenuDelivery(int id) {
        return menuDeliveryRepository.findById(id).get();
    }

    @Override
    public List<MenuDelivery> getAllMenuDeliveries() {
        return menuDeliveryRepository.findAll();
    }

    @Override
    public void saveMenuDelivery(MenuDelivery menuDelivery) {
        menuDeliveryRepository.save(menuDelivery);
    }
}
