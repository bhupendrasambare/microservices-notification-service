# Microservices Notification Service

This repository contains the source code for a Notification Service built using Java Spring Boot. The service is part of a microservices architecture and is responsible for managing and sending notifications.This application utilise apache kafka to accept notifications and print it on console for confirmation. 

## Features

- **Microservices Architecture**: Designed to work within a microservices ecosystem.
- **Apache Kafka**: Uses Kafka for message brokering and event-driven communication.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Cloud 2022.0.5**
- **Apache Kafka**
- **Docker**
- **Jenkins**

## Getting Started

### Prerequisites

- Java 17
- Apache kafka PORT:9092
- Microservices registry [Github Porject](https://github.com/bhupendrasambare/microservices-registry)
- Docker
- Maven

### Running the Application

1. **Clone the repository**:
    ```bash
    git clone https://github.com/bhupendrasambare/microservices-notification-service.git
    cd microservices-notification-service
    ```

2. **Setup Apache Kafka configuration**:
    ```yaml
    custom:
        server-ip: 192.168.29.226
    
    spring:
        kafka:
            bootstrap-servers: ${custom.server-ip}:9092
            consumer:
                group-id: ms-notification
    ```

3. **Build the project**:
    ```bash
    mvn clean install
    ```

4. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

## Configuration

The service can be configured using environment variables or by editing the `application.yml` file located in the `src/main/resources` directory. Key configuration properties include:

- **Kafka Configuration**:
    ```yaml
    spring:
      kafka:
        bootstrap-servers: localhost:9092
    ```

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure that your code adheres to the project's coding standards and includes appropriate tests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or issues, please open an issue in this repository or contact the repository owner.

---

Happy coding!
