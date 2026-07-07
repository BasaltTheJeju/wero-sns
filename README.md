# We-Ro SNS

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![React](https://img.shields.io/badge/React-Frontend-blue)
![AWS](https://img.shields.io/badge/AWS-Cloud-yellow)
![Docker](https://img.shields.io/badge/Docker-Container-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-lightblue)

## Overview

**We-Ro** is an emotional social networking service (SNS) designed to provide a space for people living in today's fast-paced and demanding society to share their thoughts and connect with others.

The project consists of a React-based frontend and a Spring Boot-based REST API backend.

---

## Project Resources

| Resource | Link |
|-----------|--------|
| Project Presentation | [View PPT](https://hyeonmooam.my.canva.site/dagi2irk2ok) |
| Documentation | Notion |

## Architecture

- Implemented CI/CD pipelines using GitHub Actions.
- All services are deployed on Amazon Web Services (AWS).
- Running infrastructure:
  - Main We-Ro API Server
  - React Frontend Server
  - MySQL Database Server

---

## Key Focus Areas

### Code Quality & Collaboration

- Followed the Google Java Style Guide.
- Established and documented coding conventions to ensure consistency across the team.
- Shared coding standards through Notion to maintain code quality and improve collaboration.

### Performance & Development Efficiency

- Automated build and test processes using GitHub Actions.
- Encouraged regular code reviews and knowledge sharing among team members to improve code maintainability and team productivity.

### Performance Testing

- Conducted API testing and validation using Postman.

---

## Technology Stack

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Gradle

### Frontend
- React

### Infrastructure & DevOps
- Amazon Web Services (AWS)
- Docker
- GitHub Actions
- Jenkins

### Database & Cache
- MySQL (AWS RDS)
- Redis (Docker Container)

---

## Project Documentation

Comprehensive project documentation is maintained in Notion, including:

- System Architecture
- Database ERD
- API Specifications
- Development Guidelines
- Technical Decisions

---

## Continuous Integration (CI)

- Automated build and test execution for every pull request.
- Continuous validation of code quality before merging changes.
- Hosted on AWS infrastructure.

---

## Continuous Deployment (CD)

- Docker images are automatically generated and deployed.
- After a successful CI build, deployment scripts push Docker images to Docker Hub.
- Automated deployment pipeline reduces manual release overhead and improves deployment consistency.

---

## Database Design

### MySQL
- Utilized AWS RDS for managed relational database services.

### Redis
- Deployed using Docker containers for caching and performance optimization.

---

## UI/UX Design

The user interface was designed using Kakao Oven during the planning and prototyping phase.

---

## Screenshots

### Main Feed

Application interface showcasing the social feed and user interactions.

### User Experience

Example screens demonstrating core SNS functionality and user engagement features.

---

## ERD (Entity Relationship Diagram)

The database schema was designed to support:

- User management
- Posts and content management
- Comments and interactions
- Authentication and authorization
- Social networking features

The ERD was continuously updated throughout development to accommodate evolving business requirements.
