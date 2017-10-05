package com.example.chungwei.placetogo.services.foursquare;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

public class FoursquareService {

    private Context context;
    private RequestQueue requestQueue;
    private String client_id = "S0VBO5HFPGFXPEU23HOIOUXNP2IXFAOBRFEU0C0NMGPYNVDO";
    private String client_secret = "ZN0UHF0F234HLLHIHNGZXBS3IPKP2TSTESI24HUOUNQ212JQ";

    public FoursquareService(Context context) {
        this.context = context;
        requestQueue = Volley.newRequestQueue(context);
    }

    public void getVenueRecommendation(String query) {
        StringRequest request = new StringRequest(
                Request.Method.GET,
                setupDeveloperKey("https://api.foursquare.com/v2/venues/explore") +
                        String.format("&ll=40.7243,-74.0018&query=coffee&v=20170801&limit=1"),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Result result = new Gson().fromJson(response, Result.class);
                        Log.i("Result", result.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Error", error.getMessage());
                    }
                });

        requestQueue.add(request);
    }

    private String setupDeveloperKey(String url) {
        return String.format(
                "%s?client_id=%s&client_secret=%s",
                url,
                client_id,
                client_secret);
    }
}
