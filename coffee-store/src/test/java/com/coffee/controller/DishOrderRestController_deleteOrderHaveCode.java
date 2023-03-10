package com.coffee.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DishOrderRestController_deleteOrderHaveCode {
    @Autowired
    private MockMvc mockMvc;

    /**
     *  Author: BinhPX
     *  Date: 12/08/2022
     *  This function run check, and check fail when param is null
     * @throws Exception
     */
    @Test
    public void deleteOrderHaveCode_code_25() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders.get("/dish-order/delete-code/null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  Author: BinhPX
     *  Date: 12/08/2022
     *  This function delete when param have code order is ...
     * @throws Exception
     */
    @Test
    public void deleteOrderHaveCode_code_28() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders.get("/dish-order/delete-code/OD-1645"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
}
