package ru.trytouse.core.facade.impl;

import ru.trytouse.api.data.HelloWorldData;
import ru.trytouse.api.facade.HelloWorldFacade;
import ru.trytouse.core.service.HelloService;
import ru.trytouse.core.service.WorldService;

public class HelloWorldFacadeImpl implements HelloWorldFacade {

    private HelloService helloService;
    private WorldService worldService;

    public HelloWorldFacadeImpl(HelloService helloService, WorldService worldService) {
        this.helloService = helloService;
        this.worldService = worldService;
    }

    @Override
    public HelloWorldData getHelloWorld() {
        return new HelloWorldData(helloService.getHello(), worldService.getWorld());
    }

}
