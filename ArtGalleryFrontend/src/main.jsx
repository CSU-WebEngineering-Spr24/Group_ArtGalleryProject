import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import App from './App.jsx';
import HomePage from './Home.jsx';
import ArtworksPage from './Artworks.jsx';
import Error404 from './Error404.jsx';
import FavouritesPage from './Favouties.jsx';
import ArtistsPage from './Artists.jsx';
import ArtistDetailsPage from './ArtistDetailsPage.jsx';
import ArtworkDetailsPage from './ArtworkDetailsPage.jsx';

// CSS styles to make the root element occupy 100% width
const rootStyle = {
  width: '100%',
  minHeight: '100vh',
  margin: 0,
  padding: 0,
};

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <div style={rootStyle}> {/* Apply styles to the root element */}
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<App />} errorElement={<Error404/>}>
            <Route path="home" element={<HomePage />} />
            <Route path="favourites" element={<FavouritesPage/>} />
            <Route path="artworks" element={<ArtworksPage />} />
            <Route path="/artworks/:artworkId" element={<ArtworkDetailsPage />} />
            <Route path="artists" element={<ArtistsPage />} />
            <Route path="artists/:artistId" element={<ArtistDetailsPage />} />
            <Route path="global" element={<div />} />
            <Route path="*" element={<Error404 />} />
          </Route>
        </Routes>
      </BrowserRouter>
    </div>
  </React.StrictMode>
);
