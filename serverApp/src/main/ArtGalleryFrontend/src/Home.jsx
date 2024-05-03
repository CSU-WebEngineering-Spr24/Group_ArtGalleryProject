import React from 'react';
import { Container, Row, Col, Button, Card, Accordion } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import img1url from "../images/paint1.jpg";
import img2url from "../images/NarutoHinata.jpg";

/**
 * This is the HomePage component.
 * It is the home page of the application and displays
 * information about the website and what it does.
 */
const HomePage = () => {
  return (
    <Container fluid>
      {/* Heading */}
      <Row className="my-5" style={{ padding: "20px" }}>
        <Col md={{ span: 8, offset: 2 }} className="text-center">
          <h1>Art is inspired by nature and life within us, Art inspires one to live with nature</h1>
          <Button variant="primary" size="lg" className="mt-3">
            Browse Artworks
          </Button>
        </Col>
      </Row>

      {/* Featured Artworks */}
      <Row className="my-5" style={{ padding: "20px" }}>
        <Col md={4}>
          <Card>
            <Card.Img variant="top" src={img1url} alt="Painting" />
            <Card.Body>
              <Card.Title>Mona Lisa</Card.Title>
              <Card.Text>
                {/* Info about the painting */}
                The sitter in the painting is thought to be Lisa Gherardini, the wife of Florence merchant Francesco del Giocondo, but experts aren’t sure. It represented an innovation in art – the painting is the earliest known Italian portrait to focus so closely on the sitter in a half-length portrait.
              </Card.Text>
            </Card.Body>
          </Card>
        </Col>
        <Col md={8}>
          <Card>
            <Card.Img variant="top" src={img2url} alt="Sculpture" />
            <Card.Body>
              <Card.Title>Central California</Card.Title>
              <Card.Text>
                {/* Info about the sculpture */}
                The person who grew these was located in Central California and, or, hopefully very well-compensated.
              </Card.Text>
            </Card.Body>
          </Card>
        </Col>
      </Row>

      {/* What we believe */}
      <Row className="my-5">
        <Col md={12} className="text-center">
          <Accordion defaultActiveKey="1">
            <Accordion.Item eventKey="1">
              <Accordion.Header>What we believe</Accordion.Header>

              <Accordion.Body>
                {/* What we believe about art */}
                We believe that artwork is an important part of human experience. It helps us
                connect with our emotions, thoughts and experiences. Artworks are a way to
                express ourselves and share our thoughts and feelings with others. They
                help us understand ourselves better and appreciate the beauty in the world
                around us. Artworks can also be a reflection of our society, culture and
                history. They can tell us about our values, beliefs and what's important to
                us. Artworks can also be a source of inspiration, comfort and joy. They
                can give us a sense of belonging and help us feel less alone. 
                We believe that artworks have the power to bring people together and
                create a sense of community. That's why we want to provide a platform for
                artists to share their artworks with the world. We believe that everyone
                should have the opportunity to see and appreciate artworks, regardless
                of their background, financial situation or accessibility. By providing
                a platform for artists to share their artworks, we hope to create a
                community that values and appreciates artworks. 
              </Accordion.Body>
            </Accordion.Item>
          </Accordion>
        </Col>
      </Row>
    </Container>
  );
};

export default HomePage;
