import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';
import { Container, Row, Col, Card, Alert, Image, Carousel, Button } from 'react-bootstrap';

function ArtworkDetailsPage() {
    const [artwork, setArtwork] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(false);
    const { artworkId } = useParams();

    useEffect(() => {
        const fetchArtwork = async () => {
            try {
                // https://api.artic.edu/api/v1
                const response = await axios.get(`/api/artworks/${artworkId}`);
                setArtwork(response.data.data);
                setError(false);
            } catch (error) {
                console.error('Failed to fetch artwork details:', error);
                setError(true);
            } finally {
                setLoading(false);
            }
        };

        fetchArtwork();
    }, [artworkId]);

    if (loading) return <Container><Alert variant="info">Loading...</Alert></Container>;
    if (error) return <Container><Alert variant="danger">Error fetching artwork details.</Alert></Container>;
    if (!artwork) return <Container><Alert variant="warning">No artwork found.</Alert></Container>;

    return (
        <Container className="my-3">
            <Row className="mb-3">
                <Col>
                    <Image src={`https://www.artic.edu/iiif/2/${artwork.image_id}/full/843,/0/default.jpg`} alt={artwork.title} fluid />
                </Col>
            </Row>
            {artwork.alt_image_ids && artwork.alt_image_ids.length > 0 && (
                <Row className="mb-3">
                    <Col>
                        <Carousel>
                            {artwork.alt_image_ids.map((id, index) => (
                                <Carousel.Item key={index}>
                                    <Image
                                        className="d-block w-100"
                                        src={`https://www.artic.edu/iiif/2/${id}/full/843,/0/default.jpg`}
                                        alt={`Alternate image ${index + 1}`}
                                    />
                                </Carousel.Item>
                            ))}
                        </Carousel>
                    </Col>
                </Row>
            )}
            <Card className="mb-3">
                <Card.Header as="h5">Basic Information</Card.Header>
                <Card.Body>
                    <strong>Title:</strong> {artwork.title}<br />
                    <strong>Date:</strong> {artwork.date_display}<br />
                    <strong>Artist:</strong> {artwork.artist_display}<br />
                    <strong>Medium:</strong> {artwork.medium_display}<br />
                    <strong>Dimensions:</strong> {artwork.dimensions}
                </Card.Body>
            </Card>
            <Card className="mb-3">
                <Card.Header as="h5">Detailed Description</Card.Header>
                <Card.Body>
                    {artwork.description || 'No description available.'}
                </Card.Body>
            </Card>
            <Card className="mb-3">
                <Card.Header as="h5">Exhibition and Publication History</Card.Header>
                <Card.Body>
                    <strong>Exhibition History:</strong> {artwork.exhibition_history || 'None'}<br />
                    <strong>Publication History:</strong> {artwork.publication_history || 'None'}
                </Card.Body>
            </Card>
            <Card className="mb-3">
                <Card.Header as="h5">Additional Details</Card.Header>
                <Card.Body>
                    <strong>Department:</strong> {artwork.department_title || 'Unknown'}<br />
                    <strong>Classification:</strong> {artwork.classification_title || 'Unknown'}<br />
                    <strong>Provenance:</strong> {artwork.provenance_text || 'Not available'}<br />
                    <strong>Credit Line:</strong> {artwork.credit_line || 'Not specified'}
                </Card.Body>
            </Card>
            <Card className="mb-3">
                <Card.Header as="h5">Links and Resources</Card.Header>
                <Card.Body>
                    {artwork.artist_id ? (
                        <p>
                            <strong>Artist Profile:</strong> <a href={`/artists/${artwork.artist_id}`}>{artwork.artist_display}</a>
                        </p>
                    ) : (
                        <p><strong>Artist Profile:</strong> Not available</p>
                    )}
                    {artwork.has_multimedia_resources && (
                        <p><strong>Multimedia Resources:</strong> Available</p>
                    )}
                </Card.Body>
            </Card>
        </Container>
    );
}

export default ArtworkDetailsPage;
