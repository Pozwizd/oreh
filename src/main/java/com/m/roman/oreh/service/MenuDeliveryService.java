package com.m.roman.oreh.service;

import com.m.roman.oreh.model.MenuDelivery;

import java.util.List;

public interface MenuDeliveryService {

    public void deleteMenuDelivery(long id);

    public void updateMenuDelivery(MenuDelivery menuDelivery);

    public MenuDelivery getMenuDelivery(long id);

    public List<MenuDelivery> getAllMenuDeliveries();

    public void saveMenuDelivery(MenuDelivery menuDelivery);

}
