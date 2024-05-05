import React, { useState, useEffect } from "react";
import axios from "axios";
import {
  Container,
  Row,
  Col,
  Card,
  Form,
  Button,
  Spinner,
} from "react-bootstrap";

// Link
import { Link } from "react-router-dom";

function App() {
  const [artworks, setArtworks] = useState([]);
  const [limit, setLimit] = useState(10);
  const [page, setPage] = useState(1);
  const [query, setQuery] = useState("");
  // const [dateStart, setDateStart] = useState("");
  // const [dateEnd, setDateEnd] = useState("");
  const [loading, setLoading] = useState(false);

  const fetchArtworks = async () => {
    setLoading(true);
    try {
        let queryParams = {
            limit: limit,
            page: page,
            fields: 'id,title,artist_display,date_display,main_reference_number,image_id,department_title'
        };

        let queryObj = {
            must: [
                { exists: { field: "image_id" } } // Ensuring image_id is not null
            ]
        };

        // if (dateStart && dateEnd) {
        //     // Adding date range condition
        //     queryObj.must.push({
        //         range: {
        //             date_start: {
        //                 gte: dateStart,
        //                 lte: dateEnd
        //             }
        //         }
        //     });
        // }

        if (query) {
            queryParams.q = query;
        }

        // Adding the query object with all the conditions to queryParams
        queryParams.query = {
            bool: queryObj
        };

        // const url = `https://api.artic.edu/api/v1/artworks/search?params=${encodeURIComponent(JSON.stringify(queryParams))}`;
        let url = `/api/artworks?`;
        if (query){
            url += `artname=${query}&`
        }
        if (limit){
            url += `limit=${limit}&`
        }
        if (page){
            url += `pagenum=${page}&`
        }

        const response = await axios.get(url);
        setArtworks(response.data.data);
    } catch (error) {
        console.error('Error fetching artworks:', error);
    } finally {
        setLoading(false);
    }
};


  useEffect(() => {
    fetchArtworks();
  }, []);

  return (
    <Container style={{ minHeight: "100vh" }}>
      <Row className="justify-content-md-center my-2">
        <Col md={12}>
          <h2>Explore Artworks</h2>
          <hr />
        </Col>
      </Row>
      <Row>
        <Col md={12}>
          <Form>
            <Row>
              <Col sm={6} md={3}>
                <Form.Group controlId="formLimit">
                  <Form.Label>Limit</Form.Label>
                  <Form.Control
                    type="number"
                    value={limit}
                    onChange={(e) => setLimit(e.target.value)}
                    placeholder="Enter number of artworks"
                  />
                </Form.Group>
              </Col>
              <Col sm={6} md={3}>
                <Form.Group controlId="formPage">
                  <Form.Label>Page</Form.Label>
                  <Form.Control
                    type="number"
                    value={page}
                    onChange={(e) => setPage(e.target.value)}
                    placeholder="Enter page number"
                  />
                </Form.Group>
              </Col>
              <Col sm={12} md={6}>
                <Form.Group controlId="formQuery">
                  <Form.Label>Search Query</Form.Label>
                  <Form.Control
                    type="text"
                    value={query}
                    onChange={(e) => setQuery(e.target.value)}
                    placeholder="Search terms"
                  />
                </Form.Group>
              </Col>
            </Row>
            <Row>
              {/* <Col sm={6} md={3}>
                <Form.Group controlId="formDateStart">
                  <Form.Label>Date Start</Form.Label>
                  <Form.Control
                    type="date"
                    value={dateStart}
                    onChange={(e) => setDateStart(e.target.value)}
                  />
                </Form.Group>
              </Col>
              <Col sm={6} md={3}>
                <Form.Group controlId="formDateEnd">
                  <Form.Label>Date End</Form.Label>
                  <Form.Control
                    type="date"
                    value={dateEnd}
                    onChange={(e) => setDateEnd(e.target.value)}
                  />
                </Form.Group>
              </Col> */}
              <Col md={6}>
                <Button
                  variant="primary"
                  onClick={fetchArtworks}
                  disabled={loading}
                  className="mt-4"
                >
                  {loading ? "Loading..." : "Fetch Artworks"}
                </Button>
              </Col>
            </Row>
          </Form>
        </Col>
      </Row>
      <Row>{artworks.map((artwork) => artworkCard(artwork))}</Row>
    </Container>
  );

}

function artworkCard(artwork) {
  console.log(`Artwork ID ${artwork.id} has image ID: ${artwork.image_id}`); // More informative logging

  return (
      <Col key={artwork.id} xs={12} sm={6} md={4} lg={3} className="mb-3">
          <Card>
              <Link to={`/artworks/${artwork.id}`} style={{ textDecoration: 'none', color: 'inherit' }}>
                  <Card.Img
                      variant="top"
                      src={`https://www.artic.edu/iiif/2/${artwork.image_id}/full/843,/0/default.jpg`}
                      alt={artwork.title}
                  />
                  <Card.Body>
                      <Card.Title>{artwork.title}</Card.Title>
                  </Card.Body>
              </Link>
              {artwork.artist_display && (
                  <Card.Text className="px-3">Artist: {artwork.artist_display}</Card.Text>
              )}
              {artwork.department_title && (
                  <Card.Text className="px-3">Department: {artwork.department_title}</Card.Text>
              )}
          </Card>
      </Col>
  );
}

export default App;
