package ru.trytouse.core.service.impl;

import ru.trytouse.core.service.WorldService;

public class WorldServiceImpl implements WorldService {
    @Override
    public String getWorld() {
        return "World!";
    }
}
