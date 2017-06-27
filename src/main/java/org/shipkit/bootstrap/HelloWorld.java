package org.shipkit.bootstrap;

import java.util.Optional;

public interface HelloWorld {

    public static void main(String[] args) {
        System.out.println("Ship it!");
        Optional.of("Shipkit is the best").ifPresent(System.out::println);
    }
}
