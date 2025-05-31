# 💸 Payment Scheduler

A full-stack application that allows users to schedule future payments by providing payer name, amount, and scheduled date/time. Built using React (frontend) and Spring Boot (backend), this project is designed to demonstrate form handling, RESTful APIs, and data persistence in a clean and simple UI.

---

## 🚀 Features

- 🔐 Add new scheduled payments with payer name, amount, and time
- 📋 View list of all scheduled payments
- 🟢 Status indicator: "Pending" or "Done" (based on backend logic)
- 🔄 React frontend with Axios calling backend REST API
- 💡 Clean architecture for frontend–backend communication

---

## 🧠 Tech Stack

| Layer       | Technology         |
|-------------|--------------------|
| Frontend    | ReactJS, Axios     |
| Backend     | Spring Boot (Java) |
| Build Tool  | Maven              |
| Database    | MySQL / H2         |
| Tools Used  | NetBeans, VS Code  |

---

## 📁 Project Structure

payment-scheduler/
├── backend/ # Spring Boot application
│ ├── src/
│ ├── pom.xml
│ └── .gitignore
├── frontend/ # React application
│ ├── src/
│ ├── package.json
│ └── .gitignore
├── .gitignore
└── README.md

# How to run the Project
Step 1: Clone the Repository


git clone https://github.com/Rahul-4103/Scheduler-Payment-Project.git
cd payment-scheduler

Step 2: Run the Backedn(Spring Boot)

1. Open the backend/ folder in your Java IDE (like NetBeans, IntelliJ, or Eclipse)

2. Modify application.properties (if needed) for your database settings:
# src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/paymentdb
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

3. 
    Build and run the Spring Boot app:

If you're using NetBeans or IntelliJ → click Run button.
Or via terminal:

cd backend
./mvnw spring-boot:run

the backend will start on: http://localhost:9090

APIs available:

    GET /api/payments

    POST /api/payments

Step 3: Open the frontend(React)
1. Navigate to frontend folder:
   cd ../frontend
2. Install dependencies:
   npm install
3. Start the React app:
   npm start

The frontend will open at: http://localhost:3000


## Video Demo
Link: https://youtu.be/ZnDNw0JVvTc
