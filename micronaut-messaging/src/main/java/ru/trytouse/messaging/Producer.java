package ru.trytouse.messaging;

import io.micronaut.rabbitmq.annotation.Binding;
import io.micronaut.rabbitmq.annotation.RabbitClient;
import io.micronaut.rabbitmq.annotation.RabbitProperty;
import ru.trytouse.api.data.HelloWorldData;

@RabbitClient("micronaut")
@RabbitProperty(name = "replyTo", value = "amq.rabbitmq.reply-to")
public interface Producer {

    @Binding("hello.world")
    HelloWorldData send(byte[] data);

}
