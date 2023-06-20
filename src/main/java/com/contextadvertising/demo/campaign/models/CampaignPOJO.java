package com.contextadvertising.demo.campaign.models;

import javax.persistence.*;

@Entity
@Table(name = "CampaignPOJO")
public class CampaignPOJO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public CampaignPOJO() {

    }

    public CampaignPOJO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
