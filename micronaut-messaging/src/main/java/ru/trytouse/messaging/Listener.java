package ru.trytouse.messaging;

import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;
import ru.trytouse.api.facade.HelloWorldFacade;

import javax.inject.Inject;

@RabbitListener
public class Listener {

    @Inject
    private Producer producer;

    @Inject
    private HelloWorldFacade helloWorldFacade;

    @Queue("world")
    void getData() {
        producer.send(helloWorldFacade.getHelloWorld().toString().getBytes());
    }
}
