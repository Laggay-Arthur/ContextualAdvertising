package com.contextadvertising.demo.campaign;

import com.contextadvertising.demo.YandexToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;

@Controller
public class campaignsController {
    @GetMapping("/campaigns")
    public String campaigns(Model model){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api-sandbox.direct.yandex.com/json/v5/campaigns";

        // create headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("Authorization", YandexToken.token);
        // create a post object
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Id");
        arr.add("Name");
        arr.add("Type");
        arr.add("Status");
        arr.add("Statistics");
        arr.add("ClientInfo");
        arr.add("StartDate");
        arr.add("EndDate");
        arr.add("TimeTargeting");
        arr.add("TimeZone");
        arr.add("NegativeKeywords");
        arr.add("DailyBudget");
        arr.add("Currency");
        arr.add("Funds");
        //arr.add("TextCampaign");
        //arr.add("MobileAppCampaign");
        //arr.add("DynamicTextCampaign");
        //arr.add("CpmBannerCampaign");
        //arr.add("SmartCampaign");
        Post post = new Post("get",new Params(arr));
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(post);
        System.out.println(json);
        // build the request
        HttpEntity<String> entity = new HttpEntity<>(json, headers);

        final String stringPosts = restTemplate.postForObject(url, entity, String.class);
        //String stringPosts = "{\"Campaigns\":[{\"Id\":\"12313\",\"Type\":\"gsodigs\",\"Name\":\"fdgnsdigas\"}]}";
        Example example = gson.fromJson(stringPosts, Example.class);
        if(example != null && example.getResult()!= null && example.getResult().getCampaigns()!=null){
            model.addAttribute("campaigns",example.getResult().getCampaigns());
        }

        return "campaigns";
    }
    @PostMapping("/campaigns")
    public String getcampaigns(Model model){
        return "campaigns";
    }
}
