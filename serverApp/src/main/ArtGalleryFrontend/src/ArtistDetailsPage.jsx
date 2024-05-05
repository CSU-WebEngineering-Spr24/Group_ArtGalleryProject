import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';
import { Container, Row, Col, Card, Alert } from 'react-bootstrap';
// Link
import { Link } from "react-router-dom";

function ArtistDetailsPage() {
    const [artist, setArtist] = useState(null);
    const [artworks, setArtworks] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(false);
    const { artistId } = useParams();

    useEffect(() => {
        const fetchArtist = async () => {
            try {
                // const artistResponse = await axios.get(`https://api.artic.edu/api/v1/agents/${artistId}`);
                const artistResponse = await axios.get(`https://api.artic.edu/api/v1/agents/${artistId}`);

                console.log(artistResponse.config.url);
                console.log(artistResponse.data.data);
                setArtist(artistResponse.data.data);
        
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
                console.log(artworksResponse.config.url);
                console.log(artworksResponse.data.data);
                setArtworks(artworksResponse.data.data);
                setError(false);
            } catch (error) {
                console.error('Failed to fetch artist details:', error);
                setError(true);
            } finally {
                setLoading(false);
            }
        };

        fetchArtist();
    }, [artistId]);

    if (loading) return <Container><Alert variant="info">Loading...</Alert></Container>;
    if (error) return <Container><Alert variant="danger">Error fetching artist details.</Alert></Container>;
    if (!artist) return <Container><Alert variant="warning">No artist found.</Alert></Container>;

    return (
        <Container className="my-3">
            <Row>
                <Col>
                    <Card>
                        <Card.Body>
                            <Card.Title>{artist.title}</Card.Title>
                            <Card.Text>
                                {artist.alt_titles && artist.alt_titles.length > 0 && (
                                    <div><strong>Also known as:</strong> {artist.alt_titles.join(', ')}</div>
                                )}
                                <div><strong>Birth Year:</strong> {artist.birth_date || 'Unknown'}</div>
                                <div><strong>Death Year:</strong> {artist.death_date || 'Unknown'}</div>
                                <div><strong>Description:</strong> {artist.description || 'No description available.'}</div>
                            </Card.Text>
                        </Card.Body>
                    </Card>
                </Col>
            </Row>
            {artworks.length > 0 ? (
                <Row className="mt-4">
                    {artworks.map(artwork => (
                        <Col key={artwork.id} xs={12} sm={6} md={4} lg={3} className="mb-3">
                            <Card>
                                <Link to={`/artworks/${artwork.id}`}>
                                    <Card.Img variant="top" src={`https://www.artic.edu/iiif/2/${artwork.image_id}/full/843,/0/default.jpg`} alt={artwork.title} />
                                    <Card.Body>
                                        <Card.Title>{artwork.title}</Card.Title>
                                    </Card.Body>
                                </Link>
                            </Card>
                        </Col>
                    ))}
                </Row>
            ) : (
                <Row>
                    <Col>
                        <Alert variant="info">No works found for this artist.</Alert>
                    </Col>
                </Row>
            )}
        </Container>
    );
}

export default ArtistDetailsPage;
