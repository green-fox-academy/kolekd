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

}
