package com.springbackend.serverApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
// RequestMapping
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbackend.serverApp.domain.Models;

@RestController
@RequestMapping("/api")
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




/* 
https://api.artic.edu/api/v1/agents/${artistId}`




                


`https://api.artic.edu/api/v1/artists?page=${page}&limit=10`

(`https://api.artic.edu/api/v1/artworks/${artworkId}`);






const query = {
                    query: {
                        bool: {
                            must: [
                                { match: { artist_ids: artistId } } // Assuming 'artist_ids' is the correct field
                            ]
                        }
                    }
                };
        
                const artworksResponse = await axios.post('https://api.artic.edu/api/v1/artworks/search?fields=id,title,artist_display,date_display,main_reference_number,image_id', query);



https://api.artic.edu/api/v1/artworks/search?params=%7B%22limit%22%3A10%2C%22page%22%3A1%2C%22fields%22%3A%22id%2Ctitle%2Cartist_display%2Cdate_display%2Cmain_reference_number%2Cimage_id%2Cdepartment_title%22%2C%22query%22%3A%7B%22bool%22%3A%7B%22must%22%3A%5B%7B%22exists%22%3A%7B%22field%22%3A%22image_id%22%7D%7D%5D%7D%7D%7D



 */