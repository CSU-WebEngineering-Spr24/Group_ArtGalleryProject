import React, { useState, useEffect } from "react";
import axios from "axios";
import { Container, Row, Col, Card, Button } from "react-bootstrap";
import sanitizeHtml from 'sanitize-html';
import './index.css';
import { Link } from "react-router-dom";

function ArtistsPage() {
  const [artists, setArtists] = useState([]);
  const [currentPage, setCurrentPage] = useState(1);
  const [totalPages, setTotalPages] = useState(0);
  const [loading, setLoading] = useState(false);

  const fetchArtists = async (page) => {
    setLoading(true);
    try {
      const response = await axios.get(
        `https://api.artic.edu/api/v1/artists?page=${page}&limit=10`
      );
      setArtists(response.data.data);
      setTotalPages(response.data.pagination.total_pages);
      setCurrentPage(response.data.pagination.current_page);
    } catch (error) {
      console.error("Error fetching artists:", error);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchArtists(currentPage);
  }, [currentPage]);

  const handlePrevious = () => {
    setCurrentPage(Math.max(1, currentPage - 1));
  };

  const handleNext = () => {
    setCurrentPage(Math.min(totalPages, currentPage + 1));
  };

  return (
    <Container style={{ marginTop: "20px" }}>
      <Row>
        <Col>
          <h1>Artists</h1>
        </Col>
      </Row>
      <Row>
        {artists.map((artist) => (
          <Col key={artist.id} md={4} className="mb-3">
            <Card>
              <Card.Body>
                <Card.Title><Link to={`/artists/${artist.id}`}>{artist.title}</Link></Card.Title>
                <Card.Text>
                  Born: {artist.birth_date || "Unknown"}
                  Died: {artist.death_date || "Unknown"}
                </Card.Text>
                {artist.description && (
                  <Card.Text className="clamp-text">Description: <div dangerouslySetInnerHTML={{ __html: sanitizeHtml(artist.description) }} /></Card.Text>
                )}
                <a
                  href={artist.api_link}
                  target="_blank"
                  rel="noopener noreferrer"
                >
                  More Details
                </a>
              </Card.Body>
            </Card>
          </Col>
        ))}
      </Row>
      <Row className="justify-content-center">
        <Col md={2} className="text-center">
          <Button onClick={handlePrevious} disabled={currentPage <= 1}>
            Previous
          </Button>
        </Col>
        <Col md={2} className="text-center">
          <Button onClick={handleNext} disabled={currentPage >= totalPages}>
            Next
          </Button>
        </Col>
      </Row>
      <Row>
        <Col className="text-center">
          <p>
            Page {currentPage} of {totalPages}
          </p>
        </Col>
      </Row>
    </Container>
  );
}
export default ArtistsPage;
