import React from 'react'
import Button from 'react-bootstrap/Button';
import Container from 'react-bootstrap/Container';
import Form from 'react-bootstrap/Form';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import Offcanvas from 'react-bootstrap/Offcanvas';
import { Link } from "react-router-dom";

function OffcanvasExample() {
  const expand = "md";
  return (
        <Navbar key={expand} expand={expand}  className="bg-body-tertiary mb-3">
          <Container fluid>
            <Navbar.Brand href="#">Art Affinity Nexus</Navbar.Brand>
            <Navbar.Toggle aria-controls={`offcanvasNavbar-expand-${expand}`} />
            <Navbar.Offcanvas
              id={`offcanvasNavbar-expand-${expand}`}
              aria-labelledby={`offcanvasNavbarLabel-expand-${expand}`}
              placement="end"
            >
              <Offcanvas.Header closeButton>
                <Offcanvas.Title id={`offcanvasNavbarLabel-expand-${expand}`}>
                  Offcanvas
                </Offcanvas.Title>
              </Offcanvas.Header>
              <Offcanvas.Body>
                <Nav className="justify-content-end flex-grow-1 pe-3">
                  {/* link to home page react dom router */}
                  <Nav.Link as={Link} to="/home">Home</Nav.Link>
                  <Nav.Link as={Link} to="/artworks">Artworks</Nav.Link>
                  
                  <Nav.Link as={Link} to="/global">Global</Nav.Link>
                  <NavDropdown
                    title="Dropdown"
                    id={`offcanvasNavbarDropdown-expand-${expand}`}
                  >
                    <NavDropdown.Item href="/places">Places</NavDropdown.Item>
                    <NavDropdown.Item href="/artist">
                      Artist
                    </NavDropdown.Item>
                    <NavDropdown.Divider />
                    <NavDropdown.Item href="/galleries">
                      Galleries
                    </NavDropdown.Item>
                    <NavDropdown.Item href="/exhibitions">
                      Exhibitions
                    </NavDropdown.Item>
                  </NavDropdown>
                </Nav>
                {/* Below button for favourites page redirect */}
                <Button variant="outline-success" as={Link} to="/favourites">Favourites</Button>
              </Offcanvas.Body>
            </Navbar.Offcanvas>
          </Container>
        </Navbar>
  );
}

export default OffcanvasExample;

/* reference : https://react-bootstrap.netlify.app/docs/components/navbar */