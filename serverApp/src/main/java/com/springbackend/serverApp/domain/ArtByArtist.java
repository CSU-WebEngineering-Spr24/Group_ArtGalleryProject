package com.springbackend.serverApp.domain;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
// override



/*  
{
    "preference": null,
    "pagination": {
        "total": 28,
        "limit": 10,
        "offset": 0,
        "total_pages": 3,
        "current_page": 1
    },
    "data": [
        {
            "_score": 38.913326,
            "artist_display": "Ed Paschke\nAmerican, 1939-2004",
            "date_display": "1974",
            "id": 97402,
            "image_id": "b4adaaf1-81ec-755d-a5df-15c85b63a86c",
            "title": "Minnie",
            "main_reference_number": "1982.397"
        },]
    "info": {
        "license_text": "The `description` field in this response is licensed under a Creative Commons Attribution 4.0 Generic License (CC-By) and the Terms and Conditions of artic.edu. All other data in this response is licensed under a Creative Commons Zero (CC0) 1.0 designation and the Terms and Conditions of artic.edu.",
        "license_links": [
            "https:\/\/creativecommons.org\/publicdomain\/zero\/1.0\/",
            "https:\/\/www.artic.edu\/terms"
        ],
        "version": "1.10"
    },
    "config": {
        "iiif_url": "https:\/\/www.artic.edu\/iiif\/2",
        "website_url": "http:\/\/www.artic.edu"
    }  
        
*/
@Getter
@Setter
public class ArtByArtist {
    @JsonProperty("data")
    private List<ArtByArtistData> data;
    public static class ArtByArtistData {
        @JsonProperty("_score")
        private double _score;
        @JsonProperty("artist_display")
        private String artist_display;
        @JsonProperty("date_display")
        private String date_display;
        @JsonProperty("id")
        private int id;
        @JsonProperty("image_id")
        private String image_id;
        @JsonProperty("title")
        private String title;
        @JsonProperty("main_reference_number")
        private String main_reference_number;
    }
}