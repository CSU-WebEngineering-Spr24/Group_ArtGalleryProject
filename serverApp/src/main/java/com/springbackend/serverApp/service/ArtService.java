package com.springbackend.serverApp.service;


import com.springbackend.serverApp.domain.ArtworkResponse;
import com.springbackend.serverApp.domain.ArtByArtist;
// ArtistResponse
import com.springbackend.serverApp.domain.ArtistResponse;
import com.springbackend.serverApp.domain.Models;
import com.springbackend.serverApp.domain.AWInd;

public interface ArtService {

    ArtistResponse getArtist(String artistid);
    ArtistResponse getArtists(int pagenum);

    ArtworkResponse getArtworks(String artname, int pagenum,int limit);
    AWInd getArtworks(int artid);

    // ArtByArtist getArtByArtist(String artistName, String title);
}
