package com.springbackend.serverApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/* 
<Route path="/" element={<App />} errorElement={<Error404/>}>
            <Route path="home" element={<HomePage />} />
            <Route path="favourites" element={<FavouritesPage/>} />
            <Route path="artworks" element={<ArtworksPage />} />
            <Route path="/artworks/:artworkId" element={<ArtworkDetailsPage />} />
            <Route path="artists" element={<ArtistsPage />} />
            <Route path="artists/:artistId" element={<ArtistDetailsPage />} />
            <Route path="global" element={<div />} />
            <Route path="*" element={<Error404 />} />

 */
@Controller
public class IndexController {

    @GetMapping( value = {"/", "/home", "/favourites", "/artworks", "/artists", "/global", "/artworks/*", "/artists/*"} )
    public String index(Model model) {
        return "index";
    }
}
