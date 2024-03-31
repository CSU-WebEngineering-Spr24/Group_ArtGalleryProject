import requests
import random

BASE_URL = "https://api.artic.edu/api/v1"

def print_detailed_response(data):
    if isinstance(data, dict):
        for key, value in data.items():
            # Encoding the string as UTF-8 and then decoding it to print
            print(f"{key}: {value}".encode("utf-8"),end= " * "*5)
    elif isinstance(data, list):
        for item in data:
            print_detailed_response(item)
    else:
        # Handling the simple string case
        print(data.encode('utf-8', 'replace').decode('utf-8'))
    print("-" * 40)


def fetch_homepage_artworks():
    print("\n\n\n\n\n\n\n\n\n\nHomepage: Fetching initial artworks...")
    response = requests.get(f"{BASE_URL}/artworks", params={"limit": 10, "page": 1})
    if response.ok:
        artworks = response.json().get('data', [])
        print(f"Fetched {len(artworks)} initial artworks for the homepage.")
        for artwork in artworks:
            print_detailed_response(artwork)
        return artworks
    else:
        print("Failed to fetch artworks for the homepage.")
        return []

def perform_artwork_search(query):
    print(f"\n\n\n\n\n\n\n\n\n\n\nSearching for artworks with query '{query}'...")
    response = requests.get(f"{BASE_URL}/artworks/search", params={"q": query, "limit": 10, "page": 1})
    if response.ok:
        artworks = response.json().get('data', [])
        print(f"Found {len(artworks)} artworks matching '{query}'.")
        for artwork in artworks:
            print_detailed_response(artwork)
    else:
        print("Failed to perform search.")

def fetch_artwork_details(artwork_id):
    print(f"\n\n\n\n\n\n\n\n\n\nFetching details for artwork ID {artwork_id}...")
    response = requests.get(f"{BASE_URL}/artworks/{artwork_id}")
    if response.ok:
        artwork = response.json().get('data', {})
        print(f"Details for artwork ID {artwork_id}:")
        print_detailed_response(artwork)
    else:
        print(f"Failed to fetch details for artwork ID {artwork_id}.")
import requests

def fetch_artist_details(artist_id):
    print(f"\n\n\n\n\n\n\n\n\n\n\nFetching details for artist ID {artist_id}...")
    
    # Replace 'artist_details_endpoint' with the actual endpoint provided by the API documentation.
    artist_details_endpoint = f"https://api.artic.edu/api/v1/agents/{artist_id}"
    
    response = requests.get(artist_details_endpoint)
    
    if response.ok:
        artist_details = response.json()
        print(f"Details for artist ID {artist_id}:")
        print_detailed_response(artist_details)
    else:
        print(f"Failed to fetch details for artist ID {artist_id}. Error: {response.status_code}")


# Example usage of functions to simulate user interaction
homepage_artworks = fetch_homepage_artworks()
if homepage_artworks:
    selected_artwork = random.choice(homepage_artworks)
    artwork_title = selected_artwork.get('title', '')
    if artwork_title:
        perform_artwork_search(artwork_title)

    fetch_artwork_details(selected_artwork['id'])

    # Hypothetical artist ID for demonstration
    artist_id = selected_artwork.get('artist_id', "123")
    fetch_artist_details(artist_id)
