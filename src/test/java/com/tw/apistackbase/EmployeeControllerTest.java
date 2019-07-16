package com.tw.apistackbase;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class EmployeeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void should_return_most_employees_when_call_updateEmployee() throws Exception {
        mockMvc.perform(put("/employees").contentType("application/json;charset=UTF-8").content("{\n" +
                "\t\"id\": 1,\n" +
                "\t\"name\":\"TYG\",\n" +
                "\t\"age\":10,\n" +
                "\t\"gender\":\"Male\"\n" +
                "}"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json("[\n" +
                        "    {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"Xiaoming\",\n" +
                        "        \"age\": 20,\n" +
                        "        \"gender\": \"Male\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 1,\n" +
                        "        \"name\": \"TYG\",\n" +
                        "        \"age\": 10,\n" +
                        "        \"gender\": \"Male\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 2,\n" +
                        "        \"name\": \"Xiaozhi\",\n" +
                        "        \"age\": 15,\n" +
                        "        \"gender\": \"Male\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 3,\n" +
                        "        \"name\": \"Xiaogang\",\n" +
                        "        \"age\": 16,\n" +
                        "        \"gender\": \"Male\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 4,\n" +
                        "        \"name\": \"Xiaoxia\",\n" +
                        "        \"age\": 15,\n" +
                        "        \"gender\": \"Female\"\n" +
                        "    }\n" +
                        "]"));
    }
}
