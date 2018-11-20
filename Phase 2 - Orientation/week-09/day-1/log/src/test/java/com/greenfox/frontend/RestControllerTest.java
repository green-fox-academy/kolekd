package com.greenfox.frontend;

import com.greenfox.frontend.controllers.FrontendRestController;
import com.greenfox.frontend.models.SumMultiplyDouble;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(FrontendRestController.class)
public class RestControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SumMultiplyDouble sumMultiplyDouble;

    @Test
    public void doublingCorrectValue() throws Exception {
        mockMvc.perform(get("/doubling?input=5"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.result", is(10)))
                .andExpect(jsonPath("$.received", is(5)));
    }

    @Test
    public void doublingWrongValue() throws Exception {
        mockMvc.perform(get("/doubling?input=5"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.result", not(12)))
                .andExpect(jsonPath("$.received", is(5)));
    }

    @Test
    public void doublingNoInput() throws Exception {
        mockMvc.perform(get("/doubling?input="))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }

    @Test
    public void greeterCorrect() throws Exception {
        mockMvc.perform(get("/greeter?name=Daniel&title=student"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Daniel, my dear student!")));
    }

    @Test
    public void greeterMissingName() throws Exception {
        mockMvc.perform(get("/greeter?name=&title=student"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }

    @Test
    public void greeterMissingTitle() throws Exception {
        mockMvc.perform(get("/greeter?name=Daniel&title="))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }

    @Test
    public void appendACorrect() throws Exception {
        mockMvc.perform(get("/appenda/banan"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.appended", is("banana")));
    }

    @Test
    public void doUntilSumCorrect() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 7}"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.result", is(28)));
    }

    @Test
    public void doUntilFactorCorrect() throws Exception {
        mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 4}"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.result", is(24)));
    }

    @Test
    public void arraysSumCorrect() throws Exception {
        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\": \"sum\", \"numbers\": [1,2,5,10]}"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.result", is(18)));
    }

    @Test
    public void arraysMultiplyCorrect() throws Exception {
        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\": \"multiply\", \"numbers\": [1,2,5,10]}"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.result", is(100)));
    }

    @Test
    public void arraysDoubleCorrect() throws Exception {
        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\": \"double\", \"numbers\": " + Arrays.asList(1,2,5,10) + "}"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.result", is(Arrays.asList(2,4,10,20))));
    }



}
