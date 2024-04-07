/* import React from 'react';
import { Container, Row, Col, Card, Button, Form } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import heirloomTomatoImage from "../images/paint1.jpg"; // Replace with your image path
import organicGingerImage from "../images/NarutoHinata.jpg"; // Replace with your image path

const ArtworksPage = () => {
  return (
    <Container>
      <Row className="justify-content-md-center my-5">
        <Col md={12} className="text-center">
          <h2>Artworks</h2>
          <hr />
        </Col>
      </Row>
      
      <Row>
        <Col md={8}>
          <Row>
            <Col md={6}>
              <Card className="mb-4">
                <Card.Img variant="top" src={heirloomTomatoImage} />
                <Card.Body>
                  <Card.Title>Heirloom tomato</Card.Title>
                  <Card.Text>
                    $5.99 / lb<br />
                    Grown in San Juan Capistrano, CA
                  </Card.Text>
                </Card.Body>
              </Card>
            </Col>
            <Col md={6}>
              <Card className="mb-4">
                <Card.Img variant="top" src={organicGingerImage} />
                <Card.Body>
                  <Card.Title>Organic ginger</Card.Title>
                  <Card.Text>
                    $12.99 / lb<br />
                    Grown in Huntington Beach, CA
                  </Card.Text>
                </Card.Body>
              </Card>
            </Col>
          </Row>
        </Col>
        
        <Col md={4}>
          <Form>
            <Form.Group className="mb-3">
              <Form.Label>Label</Form.Label>
              <Form.Control type="text" placeholder="Placeholder" />
            </Form.Group>
            <Form.Group className="mb-3">
              <Form.Label>Label</Form.Label>
              <Form.Control type="text" placeholder="Placeholder" />
            </Form.Group>
            <Form.Group className="mb-3">
              <Form.Label>Label</Form.Label>
              <Form.Control type="text" placeholder="Placeholder" />
            </Form.Group>
            <Button variant="primary" type="submit">
              Submit
            </Button>
          </Form>
        </Col>
      </Row>
    </Container>
  );
};

export default ArtworksPage;
 */


import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Container, Row, Col, Card, Form, Button, ProgressBar, Spinner } from 'react-bootstrap';

function App() {
    const [artworks, setArtworks] = useState([]);
    const [limit, setLimit] = useState(10); // Default limit count
    const [loading, setLoading] = useState(false);
    const [progress, setProgress] = useState(0);

    const fetchArtworks = async () => {
        // if limit 0 then set artworks to empty array
        if (limit == 0) {
            setArtworks([]);
            return;
        }
        else {
            try {
                setLoading(true);
                const response = await axios.get(`https://api.artic.edu/api/v1/artworks?limit=` + limit);
                setArtworks(response.data.data);
                setProgress(100); // Update the progress when the data is fully loaded
            } catch (error) {
                console.error('Error fetching artworks:', error);
            } finally {
                setLoading(false);
            }
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
        <Container style={{ minHeight: '100vh' }}>
            <Row className="justify-content-md-center my-2">
                <Col md={12} >
                    <h2>Artworks</h2>
                    <hr />
                </Col>
            </Row>
            <Row className="my-2">
                <Col md={4}>
                    <Form className="mb-3" >
                        <Form.Group controlId="formLimit">
                            <Form.Label>Limit</Form.Label>
                            <Form.Control
                                type="number"
                                value={limit}
                                onChange={handleLimitChange}
                                placeholder="Enter number of artworks"
                            />
                        </Form.Group>
                        {loading ? (
                            <div className="text-center" style={{ margin: "10px" }}>
                                <Button variant="primary" disabled>
                                    <Spinner
                                        as="span"
                                        animation="grow"
                                        size="sm"
                                        role="status"
                                        aria-hidden="true"
                                    />
                                    Loading...
                                </Button>
                            </div>
                        ) : null}

                    </Form>
                </Col>
            </Row>
            <Row>

                {artworks.map((artwork) => (
                    artworkCard(artwork)
                ))}
            </Row>
        </Container>
    );

    function artworkCard(artwork) {
        const cardStyle = {
            maxHeight: '400px', // Set your desired max-height
            overflow: 'hidden'
        };

        const cardImageStyle = {
            maxHeight: '200px', // Adjust accordingly for the image
            overflow: 'hidden'
        };
        return <Col key={artwork.id} xs={12} sm={6} md={4} lg={3} className="mb-3">
            <Card style={cardStyle}>
                <Card.Img
                    variant="top"
                    src={`https://www.artic.edu/iiif/2/${artwork.image_id}/full/843,/0/default.jpg`}
                    alt={artwork.title}
                    style={cardImageStyle} />
                <Card.Body>
                    <Card.Title>{artwork.title}</Card.Title>
                    {artwork.artist_display && <Card.Text>Artist: {artwork.artist_display}</Card.Text>}
                    {artwork.department_title && <Card.Text>Department: {artwork.department_title}</Card.Text>}
                </Card.Body>
            </Card>
        </Col>;
    }
}

export default App;

