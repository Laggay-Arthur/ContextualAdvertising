package com.contextadvertising.demo.keywords;

import com.contextadvertising.demo.YandexToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;

@Controller
public class keyWordsController {
    @GetMapping("/keywords")
    public String getKeyWords(@RequestParam(value = "adGroupId", required = false) Long adGroupId, Model model) {

            if(adGroupId != null) {
                RestTemplate restTemplate = new RestTemplate();
                String url = "https://api-sandbox.direct.yandex.com/json/v5/keywords";

                // create headers
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                //headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
                headers.add("Authorization", YandexToken.token);
                // create a post object
                ArrayList<String> arr = new ArrayList<String>();
                arr.add("Id");
                arr.add("Keyword");
                arr.add("CampaignId");
                arr.add("AdGroupId");
                arr.add("Bid");
                arr.add("ContextBid");
                arr.add("Status");
                ArrayList<Long> arrAdGroupsId = new ArrayList<>();
                arrAdGroupsId.add(adGroupId);
                Post post = new Post("get", new Params(new keyWordsSelectionCriteria(arrAdGroupsId), arr));
                Gson gson = new GsonBuilder()
                        .setPrettyPrinting()
                        .create();
                String json = gson.toJson(post);
                System.out.println(json);
                // build the request
                HttpEntity<String> entity = new HttpEntity<>(json, headers);

                final String stringPosts = restTemplate.postForObject(url, entity, String.class);
                System.out.println(stringPosts);
                Example example = gson.fromJson(stringPosts, Example.class);
                System.out.println(example.getResult().getKeyWords());
                if (example != null && example.getResult() != null && example.getResult().getKeyWords() != null) {
                    model.addAttribute("keywords", example.getResult().getKeyWords());
                }

                return "keywords";

            }else return "redirect:/campaigns";


    }
}

