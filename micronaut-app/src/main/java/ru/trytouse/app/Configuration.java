package ru.trytouse.app;

import io.micronaut.context.annotation.Factory;
import ru.trytouse.api.facade.HelloWorldFacade;
import ru.trytouse.core.service.HelloService;
import ru.trytouse.core.service.WorldService;
import ru.trytouse.core.facade.impl.HelloWorldFacadeImpl;
import ru.trytouse.core.service.impl.HelloServiceImpl;
import ru.trytouse.core.service.impl.WorldServiceImpl;

import javax.inject.Singleton;

@Factory
public class Configuration {

    @Singleton
    HelloService helloService() {
        return new HelloServiceImpl();
    }

    @Singleton
    WorldService worldService() {
        return new WorldServiceImpl();
    }

    @Singleton
    HelloWorldFacade helloWorldFacade(HelloService helloService, WorldService worldService) {
        return new HelloWorldFacadeImpl(helloService, worldService);
    }

}
