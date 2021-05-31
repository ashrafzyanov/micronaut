package ru.trytouse.core.service.impl;

import ru.trytouse.core.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello() {
        return "Hello";
    }
}
