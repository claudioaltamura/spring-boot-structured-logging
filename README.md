![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/claudioaltamura/spring-boot-structured-logging/ci.yml?branch=main)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# 🌟 Structured Logging with Spring Boot 3.4

Welcome to the **Structured Logging** example with Spring Boot 3.4! 🎉

This project demonstrates how to enable and configure structured logging in a Spring Boot application, making your logs more readable, searchable, and usable in modern observability tools.

## 🚀 Getting Started

With the release of Spring Boot 3.4, enabling structured logging is easier than ever. This repository provides examples and configurations inspired by the official [Spring Blog](https://spring.io/blog/2024/08/23/structured-logging-in-spring-boot-3-4) and the [Baeldung article on Java Structured Logging](https://www.baeldung.com/java-structured-logging).

## ✨ Spring Boot Structured Logging Key Features

- Enable structured logging with simple application properties.
- Choose between different structured logging formats such as ECS (Elastic Common Schema) or Logstash.
- Implement your own formatters for custom log output.

## 🛠️ How to Run
Clone this repository and run the application using:

```bash
 ./gradlew bootRun
```

## 📊 Viewing Logs
Depending on your configuration:

```
Console Logs: View in your terminal or IDE console.
File Logs: Check the output file log.json in your project directory.
```

## ⚙️ Configuration Options

Here are some of the configuration options you can try in your `application.properties` file:

```properties
//logging.structured.format.console=logstash
//logging.structured.format.file=logstash
//logging.file.name=log.json
//logging.structured.format.console=de.claudioaltamura.spring_boot_structured_logging.MyStructuredLoggingFormatter
//logging.structured.format.console=de.claudioaltamura.spring_boot_structured_logging.MyStructuredLoggingFormatterJson
```
1. This configuration will format console logs in the Logstash format, suitable for ingestion by Logstash or other tools that support the Logstash format.
2. This configuration will format file logs in the Logstash format.
3. These settings will format logs in the Logstash format and write them to a file named log.json.
4. Use a custom formatter class for console logging. Replace MyStructuredLoggingFormatter with your own implementation.
5. This configuration uses a custom JSON formatter for console logs, offering full control over the structure and content of your log messages.

## 💡Examples

logstash
```
{"@timestamp":"2024-09-06T10:45:47.566949+02:00","@version":"1","message":"Hello structured logging!","logger_name":"de.claudioaltamura.spring_boot_structured_logging.MyLogger","thread_name":"main","level":"INFO","level_value":20000,"userId":"1"}
```
ecs
```
{"@timestamp":"2024-09-06T10:46:37.390982Z","log.level":"INFO","process.pid":9954,"process.thread.name":"main","service.name":"spring-boot-structured-logging","log.logger":"de.claudioaltamura.spring_boot_structured_logging.MyLogger","message":"Hello structured logging!","userId":"1","ecs.version":"8.11"}
```

## 📚 Resources
[Spring Blog: Structured Logging in Spring Boot 3.4](https://spring.io/blog/2024/08/23/structured-logging-in-spring-boot-3-4)

[Baeldung: Java Structured Logging](https://www.baeldung.com/java-structured-logging)

## 🤝 Contributing
Feel free to submit pull requests or raise issues to improve this example project. Contributions are always welcome!