# 📦 Product Management Full-Stack Application  

A **Spring Boot RESTful API + Frontend** for managing products with full CRUD operations, database integration, and a simple UI for interaction.  

---

## 🚀 Features  

- **Backend (Spring Boot REST API)**  
  - Create, Read, Update, and Delete (CRUD) operations for Products  
  - RESTful API endpoints with JSON responses  
  - Integrated with Spring Data JPA & MySQL database  
  - Swagger UI for interactive API documentation  
  - Centralized Exception Handling  
  - Configured CORS for frontend integration  

- **Frontend (HTML + CSS + JavaScript)**  
  - Product Management UI connected to REST API  
  - View all products in a table  
  - Add, Update, Delete products from UI  
  - Search products by name or category  

---

## 🛠️ Tech Stack  

- **Backend**: Java 17+, Spring Boot 3.x, Spring Data JPA, Hibernate, Maven, MySQL  
- **Frontend**: HTML, CSS, JavaScript (Vanilla JS)  
- **Tools**: Eclipse / IntelliJ IDEA / VS Code  
- **API Docs**: Swagger (Springfox/OpenAPI)  

---

## 📂 Project Structure  


springboot-product-api/
┣ backend/ (Spring Boot Application)
┃ ┣ src/main/java/com/example/productapi/
┃ ┃ ┣ controller/ # REST Controllers
┃ ┃ ┣ entity/ # JPA Entities
┃ ┃ ┣ repository/ # Data Access Layer
┃ ┃ ┣ service/ # Business Logic Layer
┃ ┃ ┣ exception/ # Exception Handling
┃ ┃ ┗ ProductApiApplication.java # Main Entry Point
┃ ┣ src/main/resources/
┃ ┃ ┣ application.properties # Configurations
┃ ┃ ┣ data.sql # Initial Data
┃ ┗ pom.xml # Maven Dependencies
┃
┣ frontend/ (Static UI)
┃ ┣ index.html # Product UI
┃ ┣ style.css # Styling
┃ ┗ script.js # API integration (fetch, CRUD ops)





---

## ⚡ Getting Started  

### ✅ Prerequisites  
- Install **Java 17+**  
- Install **Maven 3.8+**  
- Install **MySQL** (or use H2 for testing)  
- IDE: Eclipse / IntelliJ IDEA / VS Code  

---

### ▶️ Run the Backend  

1. Clone repository  
   ```bash
   git clone https://github.com/maheshmegs/springboot-product-api.git
   cd springboot-product-api

2. Update application.properties for MySQL (if using)

spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
server.port=8085


3. Build & run

mvn spring-boot:run


👉 API will start at: http://localhost:8085

▶️ Run the Frontend

Navigate to frontend/ folder.
👉 You can access the **frontend UI** here:  
[http://localhost:8085/products.html](http://localhost:8085/products.html)
or 
Open index.html (http://localhost:8085/products.html )in a browser (or use Live Server in VS Code).

The UI will connect to backend at: http://localhost:8085/api/products

📖 API Endpoints
Method	Endpoint	Description
GET	/api/products	Get all products
GET	/api/products/{id}	Get product by ID
POST	/api/products	Create new product
PUT	/api/products/{id}	Update product
DELETE	/api/products/{id}	Delete product
GET	/api/products/search?q=	Search products
📊 Swagger Documentation

Once the backend is running, access Swagger UI at:
👉 http://localhost:8085/swagger-ui/index.html

🧪 Testing

Run backend tests with:

mvn test

🤝 Contributing

Contributions are welcome!
Feel free to fork this repo and create pull requests.

👤 Author

Mahesh
📧 maheshmegs05@gmail.com

🔗 GitHub Profile
