package com.contextadvertising.demo.campaign.Add;

import com.contextadvertising.demo.YandexToken;
import com.contextadvertising.demo.campaign.Example;
import com.contextadvertising.demo.campaign.Add.Post;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class campaignAddController {

    @GetMapping("/campaigns/add")
    public String campaignsAdd(Model model){

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api-sandbox.direct.yandex.com/json/v5/campaigns";

        // create headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", YandexToken.token);
        // create a post object
        ArrayList<CampaignAdd> arr = new ArrayList<CampaignAdd>();
        Post post = new Post("add",new Params(arr));
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

        return "campaignAdd";
    }
}
