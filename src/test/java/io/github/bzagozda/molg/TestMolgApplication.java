package io.github.bzagozda.molg;

import org.springframework.boot.SpringApplication;

public class TestMolgApplication {

    static void main(String[] args) {
        SpringApplication.from(MolgApplication::main).with(TestcontainersConfiguration.class).run(args);
    }
}
