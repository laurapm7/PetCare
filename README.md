# PetCare API

REST API for managing pets and their veterinary care, built with
Java and Spring Boot.

This is a personal portfolio project focused on learning backend
development through practical, incremental implementation.

## Project status

In development. The initial Spring Boot project has been created.
Business features and database configuration are not implemented yet.

## Technologies

Dependencies currently included in the project:

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- MySQL Connector/J
- Jakarta Validation
- Lombok
- Maven

## Planned features

- [ ] Configure the MySQL database connection
- [ ] Create, retrieve, update and delete pets
- [ ] Use DTOs for API requests and responses
- [ ] Validate incoming data
- [ ] Handle errors consistently
- [ ] Manage veterinary appointments
- [ ] Manage treatments
- [ ] Add automated tests
- [ ] Document the API with OpenAPI / Swagger

## Planned architecture

The application will follow a layered architecture:

Controller → Service → Repository → Database

- Controller: handles HTTP requests and responses.
- Service: implements business logic.
- Repository: provides access to stored data.

DTOs will define the data exchanged through the API.

## Learning goals

- Design REST endpoints and use HTTP methods appropriately.
- Apply separation of responsibilities and dependency injection.
- Model entities and relationships with JPA.
- Work with a relational database.
- Write automated tests.
- Maintain a clear Git history.

## Author

Laura Pérez