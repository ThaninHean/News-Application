# News Application

## Overview

The **News Application** is an Android app that allows users to fetch and display news articles from various sources using the News API. Users can search for specific articles, view the latest headlines, and navigate through the app with ease.

## Features

- Fetches news articles from the News API.
- Search functionality to find articles based on keywords.
- Displays a message when no results are found.
- Shows a loading indicator while fetching data.
- User-friendly interface with a clean layout.

## Technologies Used

- **Android**: Native Android development using Java.
- **Retrofit**: For networking and API requests.
- **RecyclerView**: For displaying a list of news articles.
- **Gson**: For parsing JSON data from the API.

## API

The application interacts with the News API to retrieve news articles. 

### API Endpoints

1. **Get Top Headlines**
   - **Method**: `GET`
   - **Endpoint**: `/top-headlines`
   - **Parameters**:
     - `q`: Query string for search terms.
     - `apiKey`: Your API key for authentication.

2. **Get Everything**
   - **Method**: `GET`
   - **Endpoint**: `/everything`
   - **Parameters**:
     - `q`: Query string for search terms.
     - `apiKey`: Your API key for authentication.


