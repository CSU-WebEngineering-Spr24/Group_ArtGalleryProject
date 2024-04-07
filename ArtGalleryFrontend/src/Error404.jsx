// Error404.jsx
import React from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import { Typography, Button } from '@mui/material';
import { Link } from 'react-router-dom'; 

const Error404 = () => {
  return (
    <Container className="text-center my-4">
      <Row>
        <Col>
          <Typography variant="h1" component="div" gutterBottom>
            404
          </Typography>
          <Typography variant="h6" gutterBottom>
            Oops! The page you're looking for isn't here.
          </Typography>
          <Typography variant="subtitle1" gutterBottom>
            Maybe it was a masterpiece that has been moved to a new gallery?
            Don't worry, we can help you get back to the main exhibit.
          </Typography>
          <Button variant="contained" color="primary" component={Link} to="/home">
            Return Home
          </Button>
        </Col>
      </Row>
    </Container>
  );
};

export default Error404;
