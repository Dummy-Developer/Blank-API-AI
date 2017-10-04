package com.example.chungwei.placetogo.services;

import fi.foyt.foursquare.api.FoursquareApi;

public class FoursquareService {
    private FoursquareApi foursquareApi;

    public FoursquareService() {
        foursquareApi = new FoursquareApi(
                "S0VBO5HFPGFXPEU23HOIOUXNP2IXFAOBRFEU0C0NMGPYNVDO",
                "ZN0UHF0F234HLLHIHNGZXBS3IPKP2TSTESI24HUOUNQ212JQ",
                "http://www.placetogo.com");
    }
}
