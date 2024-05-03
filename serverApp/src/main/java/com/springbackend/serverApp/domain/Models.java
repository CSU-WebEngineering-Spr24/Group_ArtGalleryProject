package com.springbackend.serverApp.domain;


import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;

public class Models {
    @Getter
    @Setter
    public static class Artwork {
        private String id;
        private String title;
        private String artist_display;
        private String artist_title;
        private String artist_id;
        private String image_id;
        private String provenance_text;
        private String department_title;
        // Add other fields as needed
    }

    @Getter
    @Setter
    public static class Pagination {
        private int total;
        private int limit;
        private int offset;
        private int totalPages;
        private int currentPage;
        private String nextUrl;
        // Add other fields as needed
    }

    @Getter
    @Setter
    public static class Info {
        private String licenseText;
        private List<String> licenseLinks;
        private String version;
        // Add other fields as needed
    }

    @Getter
    @Setter
    public static class Config {
        private String iiifUrl;
        private String websiteUrl;
        // Add other fields as needed
    }

    @Getter
    @Setter
    public static class ArtworksResponse {
        private Pagination pagination;
        private List<Artwork> data;
        private Info info;
        private Config config;
        // Add other fields as needed
    }
}
