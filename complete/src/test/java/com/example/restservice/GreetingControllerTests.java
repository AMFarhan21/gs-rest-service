// package com.example.restservice;

// import org.junit.jupiter.api.Test;

// import org.springframework.beans.factory.annotation.Autowired;
// import
// org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.web.servlet.client.RestTestClient;

// @SpringBootTest
// @AutoConfigureRestTestClient
// public class GreetingControllerTests {

// @Autowired
// private RestTestClient restTestClient;

// @Test
// public void noParamGreetingShouldReturnDefaultMessage() throws Exception {

// this.restTestClient.get().uri("/greeting")
// .exchange()
// .expectStatus().isOk()
// .expectBody()
// .jsonPath("$.content").isEqualTo("Hello, World!");
// }

// @Test
// public void paramGreetingShouldReturnTailoredMessage() throws Exception {

// this.restTestClient.get()
// .uri(uri -> uri.path("/greeting").queryParam("name", "Spring
// Community").build())
// .exchange()
// .expectStatus().isOk()
// .expectBody()
// .jsonPath("$.content").isEqualTo("Hello, Spring Community!");
// }

// }
package com.example.restservice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.restservice.controller.GreetingController;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTests {
    @Autowired
    private MockMvc mockMvc;

    // @MockBean
    // private Greet

    @Test
    void shouldReturn200WhenGreeting() throws Exception {
        mockMvc.perform(get("/greeting")).andExpect(status().isOk());
    }
}
