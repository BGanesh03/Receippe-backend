# 🍽️ Receippe Backend – Spring Boot REST API

This is a backend REST API built using **Spring Boot** to manage user profiles and food recipes.  
It connects with a React frontend and supports full CRUD operations for both users and recipes.

---
## 🚧 Project Status

⚠️ This backend is **under development**.  
More API features and error handling will be added soon.

## 🚀 Features

- ✅ User Profile Management
- ✅ Recipe Management
- ✅ RESTful API Endpoints
- ✅ CORS Support for frontend connection
- ✅ Clean code structure (Controller → Service → Repository)

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **H2** (or PostgreSQL)
- **Maven**

---

## 📁 Project Structure

src/
├── main/
│ ├── java/com/example/foodie/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ ├── service/
│ │ └── FoodieApplication.java
│ └── resources/
│ ├── application.properties
└── test/

## 📡 API Endpoints

| Method | Endpoint             | Description            |
|--------|----------------------|------------------------|
| GET    | `/api/profiles`      | Get all user profiles  |
| POST   | `/api/profiles`      | Add a user profile     |
| GET    | `/api/recipes`       | Get all recipes        |
| POST   | `/api/recipes`       | Add a new recipe       |

## 🔧 Setup Instructions

1. Clone the repo  
   ```bash
   git clone https://github.com/your-username/Receippe-backend.git
   cd Receippe-backend
2. Import into Spring Tool Suite or IntelliJ
