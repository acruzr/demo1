package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void hello_ShouldReturnHelloWorld() {
        HelloController controller = new HelloController();
        String result = controller.hello();
        assertEquals("Hello, World!", result);
    }

    @Test
    void greet_ShouldReturnGreeting() {
        HelloController controller = new HelloController();
        String result = controller.greet();
        assertEquals("Greetings from Spring Boot!", result);
    }
}