package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.MenuDelivery;

import java.util.List;

public interface MenuDeliveryService {

    public void deleteMenuDelivery(int id);

    public void updateMenuDelivery(MenuDelivery menuDelivery);

    public MenuDelivery getMenuDelivery(int id);

    public List<MenuDelivery> getAllMenuDeliveries();

    public void saveMenuDelivery(MenuDelivery menuDelivery);

}
