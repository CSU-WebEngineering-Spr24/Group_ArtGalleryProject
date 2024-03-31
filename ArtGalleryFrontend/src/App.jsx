import React, { useState, useEffect } from 'react';
import axios from 'axios';
import {
  Container,
  Typography,
  Grid,
  Card,
  CardContent,
  TextField,
  Button,
} from '@mui/material';

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
    <Container style={{ backgroundColor: "gray", padding: "10px", minHeight: "100vh",minWidth:"100%" }}>

      <Typography variant="h4" gutterBottom>
        Artworks
      </Typography>
      <TextField
        label="Limit"
        type="number"
        value={limit}
        onChange={handleLimitChange}
        variant="outlined"
        style={{ marginBottom: 16 }}
      />
      <Button variant="contained" onClick={handleFetchClick}>
        Fetch Artworks
      </Button>
      <Grid container spacing={3}>
        {artworks.map((artwork) => (
          <Grid key={artwork.id} item xs={12} sm={6} md={4}>
            <Card>
              <CardContent>
                <Typography variant="h6" component="h2" gutterBottom>
                  {artwork.title}
                </Typography>
                <Typography variant="subtitle1" gutterBottom>
                  Artist: {artwork.artist_display}
                </Typography>
                <Typography variant="body2">
                  Department: {artwork.department_title}
                </Typography>
              </CardContent>
            </Card>
          </Grid>
        ))}
      </Grid>
    </Container>
  );
}

export default App;
