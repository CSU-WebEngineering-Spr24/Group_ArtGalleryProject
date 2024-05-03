package com.springbackend.serverApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import com.springbackend.serverApp.domain.Models;

@RestController
public class ArtWorksController {

    @Value("${artworks.api.url}")
    private String artworksApiUrl;


    @GetMapping("/artworks")
    public ResponseEntity<Models.ArtworksResponse> getArtworksModels(@RequestParam(defaultValue = "10", required = false) int limit) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = artworksApiUrl +"/artworks" + "?limit=" + limit;
        ResponseEntity<Models.ArtworksResponse> responseEntity = restTemplate.getForEntity(apiUrl, Models.ArtworksResponse.class);
        return ResponseEntity.status(responseEntity.getStatusCode()).body(responseEntity.getBody());
    }
}
