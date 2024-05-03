// import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.springbackend.serverApp.domain.ArtistResponse;
// import com.springbackend.serverApp.domain.ArtworksResponse;

// @Service
// public class ArtServiceImp implements ArtService {

//     private static final String ARTIST_API_URL = "https://api.artic.edu/api/v1/agents/";
//     private static final String ARTWORKS_API_URL = "https://api.artic.edu/api/v1/artworks";
//     // search query 
//     private final String ARTWORKS_API_URL = "https://api.artic.edu/api/v1/artworks/search?params={\"limit\":10,\"page\":1,\"fields\":\"id,title,artist_display,date_display,main_reference_number,image_id,department_title\",\"q\":\"%s\",\"query\":{\"bool\":{\"must\":[{\"exists\":{\"field\":\"image_id\"}}]}}}";

//     private final RestTemplate restTemplate;
//     private final ObjectMapper objectMapper;

//     public ArtServiceImpl(RestTemplate restTemplate, ObjectMapper objectMapper) {
//         this.restTemplate = restTemplate;
//         this.objectMapper = objectMapper;
//     }

//     @Override
//     public ArtistResponse getArtist(String artistId) {
//         String url = ARTIST_API_URL + artistId;
//         return restTemplate.getForObject(url, ArtistResponse.class);
//     }

//     @Override
//     public ArtistResponse[] getArtists() {
//         RestTemplate restTemplate = new RestTemplate();
//         String apiUrl = ARTIST_API_URL;
//         ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
//         return objectMapper.readValue(responseEntity.getBody(), ArtistResponse[].class);
//     }

// /* ArtistResponse getArtist(String artistid);
//     ArtistResponse[] getArtists(int pagenum);

//     ArtworksResponse[] getArtworks(String artname, int pagenum);
//     ArtworksResponse getArtworks(int artid);

//     ArtByArtist getArtByArtist(String artistName, String title); */
//     @Override
//     public ArtworksResponse[] getArtworks(String artname, int pagenum, int limit){
//         STring url = ARTWORKS_API_URL + "?limit=" + limit + "&page=" + pagenum + "&q=" + artname + "&fields=id,title,artist_display,date_display,main_reference_number,image_id,department_title";

//         return restTemplate.getForObject(url, ArtworksResponse[].class);
        
//     }

//     @Override
//     public ArtworksResponse[] getArtworks() {
//         return restTemplate.getForObject(ARTWORKS_API_URL, ArtworksResponse[].class);
//     }

//     @Override
//     public Art
//     }
// }
