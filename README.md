# AWS Image Upload Project

This project allows users to upload and manage images on Amazon S3 using Spring Boot and React.

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Frontend](#frontend)
- [Backend](#backend)
- [Contributing](#contributing)
- [License](#license)

## Overview

The AWS Image Upload Project enables users to upload images to Amazon S3 and view them through a React frontend. The project is built with Spring Boot for the backend and React for the frontend.

## Prerequisites

Before you begin, ensure you have the following prerequisites:

- Java 11
- Node.js
- npm
- Amazon S3 credentials

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository:

    ```bash
    git clone https://github.com/Abdoul-Hakim101/Upload-image-API
    ```

2. Set up your Amazon S3 credentials in the backend.

3. Install dependencies:

    ```bash
    # Install backend dependencies
    cd java
    ./mvnw install

    # Install frontend dependencies
    cd frontend
    npm install
    ```

4. Run the project:

    ```bash
    # Run the backend
    cd java
    ./mvnw spring-boot:run

    # Run the frontend
    cd frontend
    npm start
    ```

## Frontend

The frontend is built with React and uses Axios for HTTP requests. The `App.js` file contains the main application logic. Images are displayed, and users can upload new images through the dropzone component.

## Backend

The backend, built with Spring Boot, handles image upload, storage, and retrieval from Amazon S3. The `UserProfileController` manages user profiles, and the `FileStore` class is responsible for interacting with Amazon S3.
## Screenshots

## License

This project is licensed under the [MIT License](LICENSE).
