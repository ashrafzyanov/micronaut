package ru.trytouse.web.api;

import io.micronaut.http.annotation.Get;
import ru.trytouse.api.data.HelloWorldData;

public interface HelloWorlder {

    @Get("/world")
    HelloWorldData index();
}
