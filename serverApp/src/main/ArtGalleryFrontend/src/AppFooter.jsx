import React from 'react';
import { Container, Row, Col } from 'react-bootstrap';

const footerStyle = {
  backgroundColor: '#f8f9fa',
  padding: '20px 0',
  // values for footbar to be at bottom but not fixed
  top : 'auto',
  bottom: '0',
  width: '100%',
};

function AppFooter(){
  return (
    <footer style={footerStyle}>
      <Container>
        <Row className="justify-content-between">
          
          <Col xs={24} lg={12}>
            <Row>
              <Col xs={12} md={3}>
                <h6 className='text-uppercase fw-bold mb-4'>Project Description</h6>
                <p>
                  Here you can use this website to explore Art Institute of Chicago API. Please refer the about page.
                </p>
              </Col>
              <Col xs={12} md={3}>
                <h6 className='text-uppercase fw-bold mb-4'>Pages</h6>
                <ul className="list-unstyled">
                  <li><a href="#">Home</a></li>
                  <li><a href="#">Artworks</a></li>
                  <li><a href="#">GlobalArt</a></li>
                  <li><a href="#">About</a></li>
                </ul>
              </Col>
              <Col xs={12} md={3}>
                <h6 className='text-uppercase fw-bold mb-4'>Useful links</h6>
                <ul className="list-unstyled">
                  <li><a href="#">Github Source Code</a></li>
                  <li><a href="#">Linkedin</a></li>
                  <li><a href="#">Other Projects</a></li>
                  <li><a href="#">NA</a></li>
                </ul>
              </Col>
              <Col xs={12} md={3}>
                <h6 className='text-uppercase fw-bold mb-4'>Contact</h6>
                <p>Columbus State University</p>
                <p>info@students.columbusstate.edu</p>
                <p>+ 01 234 567 88</p>
                <p>+ 01 234 567 89</p>
              </Col>
            </Row>
          </Col>
        </Row>

        <div className='text-center p-4' style={{ backgroundColor: 'rgba(0, 0, 0, 0.05)' }}>
          © 2029 Copyright:
          <a className='text-reset fw-bold' href='https://mdbootstrap.com/'>
            github.com
          </a>
        </div>
      </Container>
    </footer>
  );
};

export default AppFooter;
