# Wikimedia Real-Time Streaming with Kafka and MySQL

## 📌 Overview
This project demonstrates a real-time data pipeline using **Java Spring Boot**, **Apache Kafka**, and **MySQL**.  

It connects to the official Wikimedia real-time stream API:

👉 [https://stream.wikimedia.org/v2/stream/recentchange](https://stream.wikimedia.org/v2/stream/recentchange)

The pipeline works as follows:
1. **Producer Module (`kafka-producer-wikimedia`)**  
   - Streams real-time change events from Wikimedia API.  
   - Publishes the events into a Kafka topic.  

2. **Consumer Module (`kafka-consumer-database`)**  
   - Listens to the Kafka topic for incoming Wikimedia events.  
   - Persists the events into a **MySQL database**.  

---

## ⚙️ Project Architecture
Wikimedia API  –>  Kafka Producer  –>  Kafka Topic  –>  Kafka Consumer  –>  MySQL DB

---

## 🚀 Tech Stack
- **Java 17+**
- **Spring Boot 3+**
- **Apache Kafka**
- **MySQL**
- **Maven**

---

## 🗂️ Modules
- **kafka-producer-wikimedia**  
  Spring Boot service that connects to Wikimedia API and pushes real-time data to Kafka.

- **kafka-consumer-database**  
  Spring Boot service that consumes the Kafka messages and stores them in a MySQL database.

---

## 🛠️ Setup & Installation

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/<your-username>/<your-repo>.git
cd <your-repo>
```

### 2️⃣ Download, Install & Start Apache Kafka
  It has step to download, install and start Apache Kafka:
  
  👉[Apache Kafka Quickstart](https://kafka.apache.org/quickstart)

### 3️⃣ Start MySQL

  Start your mysql server and create Database
```
CREATE DATABASE wikimedia;
```
### Update username and passwordb of MYSQL accordinging 
