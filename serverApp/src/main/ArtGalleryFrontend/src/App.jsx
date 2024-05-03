import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Outlet} from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import NavBarComp from './NavBar.jsx';
import AppFooter from './AppFooter.jsx';

function App() {
  const [artworks, setArtworks] = useState([]);
  const [limit, setLimit] = useState(10); // Default limit count

  const fetchArtworks = async () => {
    try {
      const response = await axios.get(`/artworks?limit=${limit}`);
      setArtworks(response.data.data);
    } catch (error) {
      console.error('Error fetching artworks:', error);
    }
  };

  useEffect(() => {
    fetchArtworks();
  }, [limit]);

  const handleLimitChange = (event) => {
    setLimit(event.target.value);
  };

  const handleFetchClick = () => {
    fetchArtworks();
  };

  return (
    <>  
    {/* NavBar */}
    <NavBarComp />
    <Outlet />
    <AppFooter/>
    {/* <Footer/> */}
    {/* Footer */}
    </>
  );
}

export default App;
