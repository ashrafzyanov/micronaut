package ru.trytouse.web.api.impl;

import io.micronaut.http.annotation.Controller;
import ru.trytouse.api.data.HelloWorldData;
import ru.trytouse.api.facade.HelloWorldFacade;
import ru.trytouse.web.api.HelloWorlder;

import javax.inject.Inject;

@Controller("/api/hello")
public class HelloWorlderImpl implements HelloWorlder {

    @Inject
    private HelloWorldFacade helloWorldFacade;

    @Override
    public HelloWorldData index() {
        return helloWorldFacade.getHelloWorld();
    }

}
