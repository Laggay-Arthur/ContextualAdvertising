package com.contextadvertising.demo.Controller;

import com.contextadvertising.demo.Dao.AccountDAO;
import com.contextadvertising.demo.Dao.ConnectionDB;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@Controller
public class homeController {
    @GetMapping("/")
    public String home() throws SQLException {

        return "home";
    }
}


