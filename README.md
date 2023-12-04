# BookHubX Backend

Welcome to the backend of BookHubX, the personalized bookstore app. This backend is built with Java Spring Boot, utilizing Spring Security for JWT token authentication and a MySQL database named "bookshub" on localhost:8080.

## Features:

### User Roles:

- **User:** Standard readers who can explore books, rate and review, participate in discussions.
- **Author:** Writers who can publish their books, engage with readers through reviews and discussions.
- **Admin:** Extra privileges, including the ability to delete discussions, users, or authors.

### JWT Token Authentication:

BookHubX uses JSON Web Tokens (JWT) for secure authentication. Each request to the backend requires a valid JWT token.

## Getting Started:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/BookHubX-Backend.git

## Set Up MySQL Database:

1. Create a database named "bookshub" on localhost:8080.

## Run the Backend:

1. Open the project in your favorite IDE.
2. Run the backend application.

## Technologies:

- Java
- Spring Boot
- Spring Security with JWT
- JPA Repository
- MySQL

## Admin Privileges:

The admin has additional privileges, including the ability to delete discussions, users, or authors.

## Known Issues and Limitations:

- The application is still under development, so there might be some minor bugs or features not yet implemented.
- Currently, only MySQL is supported as the database backend.


## Contact:

If you have any questions or encounter issues with the backend, feel free to reach out on [LinkedIn](https://www.linkedin.com/in/utkarash-thakur-70439a262/).
