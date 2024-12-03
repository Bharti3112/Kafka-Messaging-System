# Kafka Messaging System
Kafka Messaging System: DeliveryBoy (Producer) & EndUser (Consumer)
This project demonstrates a simple Kafka messaging system with two components: DeliveryBoy (Producer) and EndUser (Consumer). The DeliveryBoy sends messages (orders) to a Kafka topic, and the EndUser consumes those messages from the topic and processes them.

**Project Structure**
- DeliveryBoy: A Kafka producer that sends messages (representing orders) to a Kafka topic.
- EndUser: A Kafka consumer that listens for messages from the Kafka topic and processes them.

**Technologies Used**
- Kafka: Message broker for asynchronous communication between the producer and consumer.
- Spring Boot: Framework used for building both the producer and consumer services.
- Java 11: Java version used for the project.
- Spring Kafka: For Kafka integration in Spring Boot applications.
- Maven: For building and managing project dependencies.
  
**Prerequisites**

Before you begin, make sure you have the following installed:
- Kafka: Kafka broker up and running. You can download Kafka or use Docker to run it.
- Zookeeper: Kafka requires Zookeeper. If you're not using Docker, make sure it's also installed and running.
- Java 11+: Java Development Kit (JDK) 11 or higher is required.
- Maven: For managing project dependencies and building the project.

