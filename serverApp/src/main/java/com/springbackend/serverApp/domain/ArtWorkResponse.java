package com.springbackend.serverApp.domain;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


/* 
{
    "data": {
        
        
        "color": {
            "h": 45,
            "l": 49,
            "s": 94,
            "percentage": 0.0035946655163737015,
            "population": 29
        },
        
        "alt_artist_ids": [],
        "artist_ids": [
            44708
        ],
        "artist_titles": [
            "Alma Thomas"
        ],
        "category_ids": [
            "PC-8",
            "PC-142",
            "PC-825",
            "PC-830"
        ],
        "category_titles": [
            "Contemporary Art",
            "African American artists",
            "Women artists",
            "African Diaspora"
        ],
        "term_titles": [
            "painting",
            "painting (image making)",
            "acrylic paint",
            "patterns",
            "contemporary",
            "canvas",
            "blue (color)",
            "red (color)",
            "orange (color)",
            "yellow (color)",
            "modern and contemporary art"
        ],
        "style_id": "TM-12062",
        "style_title": "contemporary",
        "alt_style_ids": [],
        "style_ids": [
            "TM-12062"
        ],
        "style_titles": [
            "contemporary"
        ],
        "classification_id": "TM-9",
        "classification_title": "painting",
        "alt_classification_ids": [
            "TM-155"
        ],
        "classification_ids": [
            "TM-9",
            "TM-155"
        ],
        "classification_titles": [
            "painting",
            "modern and contemporary art"
        ],
        "subject_id": "TM-12793",
        "alt_subject_ids": [
            "TM-11843",
            "TM-11851",
            "TM-11905",
            "TM-11842"
        ],
        "subject_ids": [
            "TM-12793",
            "TM-11843",
            "TM-11851",
            "TM-11905",
            "TM-11842"
        ],
        "subject_titles": [
            "patterns",
            "blue (color)",
            "red (color)",
            "orange (color)",
            "yellow (color)"
        ],
        "material_id": "TM-2407",
        "alt_material_ids": [
            "TM-3124"
        ],
        "material_ids": [
            "TM-2407",
            "TM-3124"
        ],
        "material_titles": [
            "acrylic paint",
            "canvas"
        ],
        "technique_id": "TM-3891",
        "alt_technique_ids": [],
        "technique_ids": [
            "TM-3891"
        ],
        "technique_titles": [
            "painting (image making)"
        ],
        "theme_titles": [
            "African American artists",
            "Women artists",
            "African Diaspora"
        ],
        "image_id": "e966799b-97ee-1cc6-bd2f-a94b4b8bb8f9",
        "alt_image_ids": [],
        "document_ids": [
            "0779b4bd-296f-671f-215e-129f2101ad07"
        ],
        "sound_ids": [],
        "video_ids": [],
        "text_ids": [
            "0779b4bd-296f-671f-215e-129f2101ad07"
        ],
        "section_ids": [],
        "section_titles": [],
        "site_ids": [],
        "suggest_autocomplete_boosted": "Starry Night and the Astronauts",
        "suggest_autocomplete_all": [
            {
                "input": [
                    "1994.36"
                ],
                "contexts": {
                    "groupings": [
                        "accession"
                    ]
                }
            },
            {
                "input": [
                    "Starry Night and the Astronauts"
                ],
                "weight": 35074,
                "contexts": {
                    "groupings": [
                        "title"
                    ]
                }
            }
        ],
        "source_updated_at": "2024-02-07T13:46:24-06:00",
        "updated_at": "2024-05-02T23:20:03-05:00",
        "timestamp": "2024-05-03T11:02:21-05:00"
    },
}
 */


@Getter
@Setter
class ArtWorkResponseData {

    
    public static class Dimensions {
        @JsonProperty("depth")
        private Object depth;
        @JsonProperty("width")
        private int width;
        @JsonProperty("height")
        private int height;
        @JsonProperty("diameter")
        private Object diameter;
        @JsonProperty("clarification")
        private Object clarification;
    }

    @JsonProperty("id")
    private int id;
    @JsonProperty("api_model")
    private String apiModel;
    @JsonProperty("api_link")
    private String apiLink;
    @JsonProperty("is_boosted")
    private boolean isBoosted;
    @JsonProperty("title")
    private String title;
    @JsonProperty("alt_titles")
    private String altTitles;
    // @JsonProperty("thumbnail")
    // private Thumbnail thumbnail;
    @JsonProperty("main_reference_number")
    private String mainReferenceNumber;
    @JsonProperty("has_not_been_viewed_much")
    private boolean hasNotBeenViewedMuch;
    @JsonProperty("boost_rank")
    private int boostRank;
    @JsonProperty("date_start")
    private int dateStart;
    @JsonProperty("date_end")
    private int dateEnd;
    @JsonProperty("date_display")
    private String dateDisplay;
    @JsonProperty("date_qualifier_title")
    private String dateQualifierTitle;
    @JsonProperty("date_qualifier_id")
    private String dateQualifierId;
    @JsonProperty("artist_display")
    private String artistDisplay;
    @JsonProperty("place_of_origin")
    private String placeOfOrigin;
    @JsonProperty("description")
    private String description;
    @JsonProperty("short_description")
    private String shortDescription;
    @JsonProperty("dimensions")
    private String mediumDisplay;
    @JsonProperty("inscriptions")
    private String inscriptions;
    @JsonProperty("credit_line")
    private String creditLine;
    @JsonProperty("catalogue_display")
    private String catalogueDisplay;
    @JsonProperty("publication_history")
    private String publicationHistory;
    @JsonProperty("exhibition_history")
    private String exhibitionHistory;
    @JsonProperty("provenance_text")
    private String provenanceText;
    @JsonProperty("edition")
    private String edition;
    @JsonProperty("publishing_verification_level")
    private String publishingVerificationLevel;
    @JsonProperty("internal_department_id")
    private int internalDepartmentId;
    @JsonProperty("fiscal_year")
    private int fiscalYear;
    @JsonProperty("fiscal_year_deaccession")
    private String fiscalYearDeaccession;
    @JsonProperty("is_public_domain")
    private boolean isPublicDomain;
    @JsonProperty("is_zoomable")
    private boolean isZoomable;
    @JsonProperty("max_zoom_window_size")
    private int maxZoomWindowSize;
    @JsonProperty("copyright_notice")
    private String copyrightNotice;
    @JsonProperty("has_multimedia_resources")
    private boolean hasMultimediaResources;
    @JsonProperty("has_educational_resources")
    private boolean hasEducationalResources;
    @JsonProperty("has_advanced_imaging")
    private boolean hasAdvancedImaging;
    @JsonProperty("colorfulness")
    private double colorfulness;


    public static class Color {
        @JsonProperty("h")
        private int h;
        @JsonProperty("s")
        private int s;
        @JsonProperty("l")
        private int l;
        @JsonProperty("percentage")
        private int percentage;
        @JsonProperty("population")
        private int population;
    }
    @JsonProperty("color")
    private Color color;
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("latlon")
    private String latlon;
    @JsonProperty("is_on_view")
    private boolean isOnView;
    @JsonProperty("on_loan_display")
    private String onLoanDisplay;
    @JsonProperty("gallery_title")
    private String galleryTitle;
    @JsonProperty("gallery_id")
    private int galleryId;
    @JsonProperty("nomisma_id")
    private String nomismaId;
    @JsonProperty("artwork_type_title")
    private String artworkTypeTitle;
    @JsonProperty("artwork_type_id")
    private int artworkTypeId;
    @JsonProperty("department_title")
    private String departmentTitle;
    @JsonProperty("department_id")
    private String departmentId;
    @JsonProperty("artist_id")
    private int artistId;
    @JsonProperty("artist_title")
    private String artistTitle;

    @JsonProperty("artist_titles")
    private List<String> artistTitles;
    @JsonProperty("category_ids")
    private List<String> categoryIds;
    @JsonProperty("category_titles")
    private List<String> categoryTitles;
    @JsonProperty("term_titles")
    private List<String> termTitles;
    @JsonProperty("style_id")
    private String styleId;
    @JsonProperty("style_title")
    private String styleTitle;
    @JsonProperty("alt_style_ids")
    private List<String> altStyleIds;
    @JsonProperty("style_ids")
    private List<String> styleIds;
    @JsonProperty("style_titles")
    private List<String> styleTitles;
    
    @JsonProperty("image_id")
    private String imageId;
    @JsonProperty("alt_image_ids")
    private List<String> altImageIds;
    @JsonProperty("document_ids")
    private List<String> documentIds;

}

@Getter
@Setter
class ArtworksResponse {
    @JsonProperty("data")
    private List<ArtWorkResponseData> data;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("config")
    private Config config;
}



class Config {
    @JsonProperty("iiif_url")
    private String iiifUrl;
    @JsonProperty("website_url")
    private String websiteUrl;
}



class Info {
    @JsonProperty("license_text")
    private String licenseText;
    @JsonProperty("license_links")
    private List<String> licenseLinks;
    @JsonProperty("version")
    private String version;
}