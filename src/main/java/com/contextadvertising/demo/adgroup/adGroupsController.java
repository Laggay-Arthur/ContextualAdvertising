package com.contextadvertising.demo.adgroup;

import com.contextadvertising.demo.YandexToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.ArrayList;
@Controller
public class adGroupsController {
    @GetMapping("/adgroups")
    public String getAdgroups(@RequestParam(value = "campaignId", required = false) Long campaignId, Model model) {

            if(campaignId != null) {
                RestTemplate restTemplate = new RestTemplate();
                String url = "https://api-sandbox.direct.yandex.com/json/v5/adgroups";

                // create headers
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                //headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
                headers.add("Authorization", YandexToken.token);
                // create a post object
                ArrayList<String> arr = new ArrayList<String>();
                arr.add("Id");
                arr.add("Name");
                arr.add("CampaignId");
                arr.add("RegionIds");
                arr.add("RestrictedRegionIds");
                arr.add("NegativeKeywords");
                arr.add("NegativeKeywordSharedSetIds");
                arr.add("TrackingParams");
                arr.add("Status");
                arr.add("ServingStatus");
                arr.add("Type");
                ArrayList<Long> arrCampaignId = new ArrayList<>();
                arrCampaignId.add(campaignId);
                Post post = new Post("get", new Params(new AdGroupsSelectionCriteria(arrCampaignId), arr));
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
                if (example != null && example.getResult() != null && example.getResult().getAdGroups() != null) {
                    model.addAttribute("adgroups", example.getResult().getAdGroups());
                }

                return "adgroups";

            }else return "redirect:/campaigns";


    }
}

