## Name of project: Gratitude Jounal API 

### Description
The Gratitude Journalling API is a RESTful service that allows users to log their daily moments of gratitude and manage their journal entries. 
This document provides an overview of the API endpoints and how to use them.

### The Purpose of the Gratitude Journaling API
The API provides a structured way to interact with the backend database, allowing for the creation, reading, updating, and deletion (CRUD) of the gratitude journal, search for entries and sort the entries by topic and location. 

### Functional Requirements 
 The Gratitude Journaling API allows users to perform the following operations:
  
  1. Create a gratitude entry.
  2. Read gratitude entry
  3. Update a gratitude entry.
  4. Delete a gratitude entry.
  5. Sort gratitude entry by topic/location

## Getting Started
To start using the Gratitude Journaling API, follow the steps below:

### Prerequisites
- Java 11 or higher
- Maven 3.6.0 or higher
- A running instance of a database (e.g., MySQL)


### Api request methods testing in Postman

API endpoints: This is a list of all created endpoints and expected responses.

| Method   | URL                              | Action                   |
| -------- | ---------------------------------| --------------------------------|
| `POST`   | `/api/gratitudeentry`            | Add a GratitudeEntry            |
| `GET`    | `/api/gratitudeentry`            | Get all GratitudeEntry          |
| `GET`    | `/api/gratitudeentry/{id}`       | Get a GratitudeEntry by id      |
| `PUT`    | `/api/gratitudeentry/{id}`       | Update a GratitudeEntry by Id   |
| `DELETE` | `/api/gratitudeentry/{id}`       | Delete a GratitudeEntry by id   |

###  A representative HTTP response will look something like this:
``` JSON 
{  
"userName": "radiance_de_dieu",
"content": "I'm grateful for successfully passed all EndPoints on Postman.",
"created": "2024-05-30T08:30:00Z",
"updated": "2024-05-30T08:30:00Z",
"location": "Birmingham, UK",
"topic": "Achievement"
}
```
### Filter entries by topic
The Gratitude Journaling API will support search capabilities that allow users to query their gratitude entries based on specific criteria such as  topic. The search by topic feature enables users to filter entries based on predefined or user-defined tags or categories, facilitating the organisation and retrieval of entries related to specific themes (e.g., "family", "achievements", "health"). 

### A respresentative of how a saerch algorithm will look like:

| Method   | URL                                                        | Description                       | Key               | value     |
| -------- | -----------------------------------------------------------|-----------------------------------|-------------------|-----------|
| `GET`    | `/api/gratitudeentry/searchbytopic?topic=health`           | Search GratitudeEntry by topic    |Topic              | Health    |



### Technologies Used

- Backend: Java

- Framework:Spring Boot

- Database: MySQL

- Code editor:  VS Code

- Version control: Git, GitHub
