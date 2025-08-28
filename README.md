📦 Product Management REST API

A Spring Boot RESTful API for managing products with full CRUD operations, database integration, and Swagger documentation.

🚀 Features

Create, Read, Update, and Delete (CRUD) operations for Products

RESTful API endpoints with JSON responses

Integrated with Spring Data JPA & H2/MySQL database

Swagger UI for interactive API documentation

Centralized Exception Handling

Configured CORS for frontend integration

🛠️ Tech Stack

Java 17+

Spring Boot 3.x

Spring Data JPA

Hibernate

Maven

H2 / MySQL (configurable)

Swagger (Springfox/OpenAPI)

📂 Project Structure
productapi/
 ┣ src/main/java/com/example/productapi/
 ┃ ┣ controller/        # REST Controllers
 ┃ ┣ entity/            # JPA Entities
 ┃ ┣ repository/        # Data Access Layer
 ┃ ┣ service/           # Business Logic Layer
 ┃ ┣ exception/         # Exception Handling
 ┃ ┗ ProductApiApplication.java  # Main Entry Point
 ┣ src/main/resources/
 ┃ ┣ application.properties  # Configurations
 ┃ ┣ data.sql                # Initial Data
 ┃ ┗ static/index.html       # Landing Page
 ┣ pom.xml                   # Maven Dependencies

⚡ Getting Started
Prerequisites

Install Java 17+

Install Maven 3.8+

IDE: Eclipse / IntelliJ IDEA / VS Code

Run the Project
# Clone repository
git clone https://github.com/maheshmegs/springboot-product-api.git

# Navigate into project
cd springboot-product-api

# Build & run
mvn spring-boot:run


API will start at 👉 http://localhost:8085

📖 API Endpoints
Method	Endpoint	Description
GET	/api/products	Get all products
GET	/api/products/{id}	Get product by ID
POST	/api/products	Create new product
PUT	/api/products/{id}	Update product
DELETE	/api/products/{id}	Delete product
📊 Swagger Documentation

Once the app is running, access Swagger UI at:
👉 http://localhost:8085/swagger-ui/index.html

🧪 Testing

Run tests with:

mvn test



🤝 Contributing

Contributions are welcome! Feel free to fork this repo and create pull requests.

👤 Author

Mahesh
📧 maheshmegs05@gmail.com

https://github.com/Maheshmegs
🔗 GitHub Profile
