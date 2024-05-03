package com.springbackend.serverApp.domain;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


/*
    {
    "data": {
        "id": 36138,
        "api_model": "agents",
        "api_link": "https:\/\/api.artic.edu\/api\/v1\/agents\/36138",
        "title": "Ed Paschke",
        "sort_title": "Paschke, Ed",
        "alt_titles": [
            "Edward F. Paschke"
        ],
        "is_artist": true,
        "birth_date": 1939,
        "death_date": 2004,
        "description": null,
        "ulan_id": null,
        "suggest_autocomplete_boosted": {
            "input": [
                "Ed Paschke",
                "Paschke, Ed",
                "Edward F. Paschke"
            ],
            "weight": 3
        },
        "suggest_autocomplete_all": {
            "input": [
                "Ed Paschke",
                "Paschke, Ed",
                "Edward F. Paschke"
            ],
            "weight": 3,
            "contexts": {
                "groupings": [
                    "title"
                ]
            }
        },
        "source_updated_at": "1976-09-02T11:20:00-05:00",
        "updated_at": "2024-05-02T23:29:20-05:00",
        "timestamp": "2024-05-03T11:32:43-05:00"
    }
}
*/


@Getter
@Setter
public class ArtistResponse {
    @JsonProperty("data")
    private ArtistResponseData data;

    public static class ArtistResponseData {
        @JsonProperty("id")
        private int id;
        @JsonProperty("api_model")
        private String api_model;
        @JsonProperty("api_link")
        private String api_link;
        @JsonProperty("title")
        private String title;
        @JsonProperty("sort_title")
        private String sort_title;
        @JsonProperty("alt_titles")
        private List<String> alt_titles;
        @JsonProperty("is_artist")
        private boolean is_artist;
        @JsonProperty("birth_date")
        private int birth_date;
        @JsonProperty("death_date")
        private int death_date;
        @JsonProperty("description")
        private String description;
        @JsonProperty("ulan_id")
        private String ulan_id;
        @JsonProperty("suggest_autocomplete_boosted")
        private SuggestAutocompleteBoosted suggest_autocomplete_boosted;
        @JsonProperty("suggest_autocomplete_all")
        private SuggestAutocompleteAll suggest_autocomplete_all;
        @JsonProperty("source_updated_at")
        private String source_updated_at;
        @JsonProperty("updated_at")
        private String updated_at;
        @JsonProperty("timestamp")
        private String timestamp;

        public static class SuggestAutocompleteBoosted {
            @JsonProperty("input")
            private List<String> input;
            @JsonProperty("weight")
            private int weight;
        }
        public static class SuggestAutocompleteAll {
            @JsonProperty("input")
            private List<String> input;
            @JsonProperty("weight")
            private int weight;
            @JsonProperty("contexts")
            private Contexts contexts;
        }
}