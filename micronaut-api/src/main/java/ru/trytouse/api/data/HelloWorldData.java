package ru.trytouse.api.data;

public class HelloWorldData {

    private String hello;
    private String world;

    public HelloWorldData(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }

    public String getHello() {
        return hello;
    }

    public String getWorld() {
        return world;
    }

    @Override
    public String toString() {
        return "HelloWorldData{" +
                "hello='" + hello + '\'' +
                ", world='" + world + '\'' +
                '}';
    }
}
