package com.example;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class GreetControllerTest {


    @Autowired
    private WebTestClient client;

    @Test
    public void greetApiTest(){

        client.get()
                .uri("/api/greet")
                .exchange()
                .expectStatus().isOk();

    }

}
