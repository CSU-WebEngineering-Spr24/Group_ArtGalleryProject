package com.springbackend.serverApp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbackend.serverApp.domain.ArtistResponse;
import com.springbackend.serverApp.domain.ArtworkResponse;
import com.springbackend.serverApp.domain.AWInd;

@Service
public class ArtServiceImp implements ArtService {

    private static final String ARTIST_API_URL = "https://api.artic.edu/api/v1/agents/";
    private static final String ARTWORKS_API_URL = "https://api.artic.edu/api/v1/artworks";
    // search query 
    private final String ARTWORKS_API_UR_Search = "https://api.artic.edu/api/v1/artworks/search?params={\"limit\":10,\"page\":1,\"fields\":\"id,title,artist_display,date_display,main_reference_number,image_id,department_title\",\"q\":\"%s\",\"query\":{\"bool\":{\"must\":[{\"exists\":{\"field\":\"image_id\"}}]}}}";

    

    @Override
    public ArtistResponse getArtist(String artistId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = ARTIST_API_URL + artistId;
        return restTemplate.getForObject(url, ArtistResponse.class);
    }

    @Override
    public ArtistResponse getArtists(int pagenum) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://api.artic.edu/api/v1/artists?page=" + pagenum + "&limit=10";
        return restTemplate.getForObject(apiUrl, ArtistResponse.class);
    }

/* ArtistResponse getArtist(String artistid);
    ArtistResponse[] getArtists(int pagenum);

    ArtworkResponse[] getArtworks(String artname, int pagenum);
    ArtworkResponse getArtworks(int artid);

    ArtByArtist getArtByArtist(String artistName, String title); */
    @Override
    public ArtworkResponse getArtworks(String artname, int pagenum, int limit){
        RestTemplate restTemplate = new RestTemplate();
        String url = ARTWORKS_API_URL;
        if (artname == null) {
            url = ARTWORKS_API_URL + "?limit=" + limit + "&page=" + pagenum ;
        }
        else {
         url = ARTWORKS_API_URL + "?limit=" + limit + "&page=" + pagenum + "&q=" + artname ;
        }
        System.out.println("url = " + url);
        return restTemplate.getForObject(url, ArtworkResponse.class);
        
    }

    @Override
    public AWInd getArtworks(int artid) {
        RestTemplate restTemplate = new RestTemplate();
        //                 const response = await axios.get(`https://api.artic.edu/api/v1/artworks/${artworkId}`);
        String url = ARTWORKS_API_URL + "/" + artid;
        return restTemplate.getForObject(url, AWInd.class);
    }

    // @Override
    // public Art
    // }
}
