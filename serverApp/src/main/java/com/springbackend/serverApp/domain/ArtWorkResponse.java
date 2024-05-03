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

    /* "id": 129884,
        "api_model": "artworks",
        "api_link": "https:\/\/api.artic.edu\/api\/v1\/artworks\/129884",
        "is_boosted": true,
        "title": "Starry Night and the Astronauts",
        "alt_titles": null,
        "thumbnail": {
            "lqip": "data:image\/gif;base64,R0lGODlhBAAFAPQAABw\/Zhg\/aBRBaBZBahRCaxxBahxEahNIchZJcR9LdB9OdiZIZSBEbShLbjxRZyBPeipRcSpReUpWaitXgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAAAAAAALAAAAAAEAAUAAAURoMJIDhJAywAcAlEkxhNNTQgAOw==",
            "width": 5376,
            "height": 6112,
            "alt_text": "Abstract painting composed of small vertical dabs of multiple shades of blue with a small area of similar strokes of red, orange, and yellow in the upper right."
        },
        "main_reference_number": "1994.36",
        "has_not_been_viewed_much": false,
        "boost_rank": 1,
        "date_start": 1972,
        "date_end": 1972,
        "date_display": "1972",
        "date_qualifier_title": "",
        "date_qualifier_id": null,
        "artist_display": "Alma Thomas\nAmerican, 1891\u20131978",
        "place_of_origin": "United States",
        "description": "<p>After decades as a representational painter, in her seventies Alma Thomas turned to abstraction, creating shimmering, mosaic-like fields of color with rhythmic dabs of paint that were often inspired by forms from nature. The artist had been fascinated with space exploration since the late 1960s, and her later paintings often referenced America\u2019s manned Apollo missions to the moon. Although she had never flown, Thomas began to paint as if she were in an airplane, capturing what she described as shifting patterns of light and streaks of color. \u201cYou look down on things,\u201d she explained. \u201cYou streak through the clouds so fast. . . . You see only streaks of color.\u201d<\/p>\n<p><em>Starry Night and the Astronauts<\/em> evokes the open expanse and celestial patterns of a night sky, but despite its narrative title, the work could also be read as an aerial view of a watery surface, playing with our sense of immersion within an otherwise flat picture plane. The viewer is immersed not only in the sense of organic expanse that this painting achieves, however, but also in an encounter with Thomas\u2019s process: the surface here is clearly constructed stroke by stroke. Meanwhile, the glimpses of raw canvas between each primary-colored mark seem as vivid as the applied paint itself\u2014almost as if the composition were backlit. Thomas relied on the enlivening properties of color throughout her late-blooming career. \u201cColor is life,\u201d she once proclaimed, \u201cand light is the mother of color.\u201d This painting was created in 1972, when the artist was eighty. In the same year, she became the first African American woman to receive a solo exhibition at a major art museum, the Whitney Museum of American Art in New York City.<\/p>\n",
        "short_description": "Alma Thomas was enthralled by astronauts and outer space. This painting, made when she was 81, showcases that fascination through her signature style of short, rhythmic strokes of paint. \u201cColor is life, and light is the mother of color,\u201d she once proclaimed. In 1972, she became the first African American woman to have a solo exhibition at the Whitney Museum of American Art in New York.",
        "dimensions": "152.4 \u00d7 134.6 cm (60 \u00d7 53 in.)"
    */
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
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;
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

    /* 
    "dimensions_detail": [
            {
                "depth": null,
                "width": 134,
                "height": 152,
                "diameter": null,
                "clarification": null
            }
        ],
        "medium_display": "Acrylic on canvas",
        "inscriptions": null,
        "credit_line": "Purchased with funds provided by Mary P. Hines in memory of her mother, Frances W. Pick",
        "catalogue_display": null,
        "publication_history": null,
        "exhibition_history": null,
        "provenance_text": null,
        "edition": null,
        "publishing_verification_level": "Web Basic",
        "internal_department_id": 246,
        "fiscal_year": 1994,
        "fiscal_year_deaccession": null,
        "is_public_domain": false,
        "is_zoomable": true,
        "max_zoom_window_size": -1,
        "copyright_notice": null,
        "has_multimedia_resources": false,
        "has_educational_resources": true,
        "has_advanced_imaging": false,
        "colorfulness": 53.6375, */
    @JsonProperty("dimensions_detail")
    private List<Dimensions> dimensions;
    @JsonProperty("medium_display")
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
    /* "latitude": 41.8805769576144,
        "longitude": -87.6218733015747,
        "latlon": "41.880576957614,41.880576957614",
        "is_on_view": true,
        "on_loan_display": null,
        "gallery_title": "Gallery 291",
        "gallery_id": 25468,
        "nomisma_id": null,
        "artwork_type_title": "Painting",
        "artwork_type_id": 1,
        "department_title": "Contemporary Art",
        "department_id": "PC-8",
        "artist_id": 44708,
        "artist_title": "Alma Thomas", */
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

    /* "artist_titles": [
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
        ], */

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
    /* 
    "image_id": "e966799b-97ee-1cc6-bd2f-a94b4b8bb8f9",
        "alt_image_ids": [],
        "document_ids": [
            "0779b4bd-296f-671f-215e-129f2101ad07"
        ], */

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

/* "config": {
        "iiif_url": "https:\/\/www.artic.edu\/iiif\/2",
        "website_url": "http:\/\/www.artic.edu"
    } */

class Config {
    @JsonProperty("iiif_url")
    private String iiifUrl;
    @JsonProperty("website_url")
    private String websiteUrl;
}

/* 
"info": {
        "license_text": "The `description` field in this response is licensed under a Creative Commons Attribution 4.0 Generic License (CC-By) and the Terms and Conditions of artic.edu. All other data in this response is licensed under a Creative Commons Zero (CC0) 1.0 designation and the Terms and Conditions of artic.edu.",
        "license_links": [
            "https:\/\/creativecommons.org\/publicdomain\/zero\/1.0\/",
            "https:\/\/www.artic.edu\/terms"
        ],
        "version": "1.10"
    },
 */

class Info {
    @JsonProperty("license_text")
    private String licenseText;
    @JsonProperty("license_links")
    private List<String> licenseLinks;
    @JsonProperty("version")
    private String version;
}