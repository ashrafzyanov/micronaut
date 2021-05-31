package ru.trytouse.messaging;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import io.micronaut.rabbitmq.connect.ChannelInitializer;

import javax.inject.Singleton;
import java.io.IOException;

@Singleton
public class Configuration extends ChannelInitializer {

    @Override
    public void initialize(Channel channel) throws IOException {
        channel.exchangeDeclare("micronaut", BuiltinExchangeType.DIRECT, true);
        channel.queueDeclare("world", true, false, false, null);
        channel.queueDeclare("worldAnswer", true, false, false, null);
        channel.queueBind("worldAnswer", "micronaut", "hello.world");
    }
}
