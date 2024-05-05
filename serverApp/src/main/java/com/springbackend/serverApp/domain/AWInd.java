package com.springbackend.serverApp.domain;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;




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
public class AWInd {
    @JsonProperty("data")
    private ArtWorkResponseData data;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("config")
    private Config config;
}