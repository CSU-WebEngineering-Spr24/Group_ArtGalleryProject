import React, { useState, useEffect } from 'react';
import { Container, Row, Col, ListGroup, Button, Spinner } from 'react-bootstrap';
import DeleteIcon from '@mui/icons-material/Delete';
import axios from 'axios';

function FavouritesPage() {
  const [favourites, setFavourites] = useState([]);
  const [isLoading, setIsLoading] = useState(false);

  useEffect(() => {
    const fetchArtworks = async () => {
      setIsLoading(true);
      try {
        // { params: { limit: 4 , page: }  page random number
        const response = await axios.get('https://api.artic.edu/api/v1/artworks', { params: { limit: 7 , page : Math.floor(Math.random() * 10) } });
        setFavourites(response.data.data); // Assuming the data is in response.data.data
      } catch (error) {
        console.error('Error fetching artworks:', error);
      } finally {
        setIsLoading(false);
      }
    };

    fetchArtworks();
  }, []);

  const handleDelete = (itemId) => {
    setFavourites(favourites.filter(item => item.id !== itemId));
  };

  

  return (
    <Container>
      <Row className="justify-content-center">
        <Col md={8}>
          <h1>Favourites</h1>
          <p>{`${favourites.length} items`}</p>
          {/* isLoading spinner from react bootstrap */}
          {isLoading && <Spinner animation="border" variant="primary" />}
          <ListGroup>
            {favourites.map(item => (
              <ListGroup.Item key={item.id} className="d-flex justify-content-between align-items-center">
                <img src={`https://www.artic.edu/iiif/2/${item.image_id}/full/843,/0/default.jpg`} alt={item.title} style={{ width: '100px', marginRight: '20px' }} />
                <div className="flex-grow-1">
                  <h5>{item.title}</h5>
                  {/* Additional item details here */}
                </div>
                <Button variant="outline-danger" onClick={() => handleDelete(item.id)}>
                  <DeleteIcon /> Delete
                </Button>
              </ListGroup.Item>
            ))}
          </ListGroup>
        </Col>
      </Row>
    </Container>
  );
}

export default FavouritesPage;
