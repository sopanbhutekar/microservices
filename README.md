# Implementing Movie Catalog Service
To Practice Microservice Communication and Service Discovery using Spring Boot and Eureka.

# Sample Services:
1. Movie-Catalog-Service - This is Orchestration Layer which get details by making REST calls to others services and return Result.
2. Movie-Info-Service - This service have Movie Details which can be get using movieId. 
3. Rating-Data-Service - This service have List of movieId and ratings for userIds.
4. Discovery Service - This Service is Eureka Server, Which is used as Service Discovery to loose coupling on Host Endpoint in above Services.

# Spring Dependancy needed:
1. Spring web
2. Spring Cloud

# Annotations Used:
1. @SpringBootApplication
2. @RequestMapping
3. @PathVariable
4. @RestController
5. @Bean
6. @Autowired
7. @LoadBalanced
8. @EnableEurekaServer
9. @EnableEurekaClient

#Concept can be Study Further:
1. RestTemplate
2. WebClient
3. Service Discovery
4. Spring Cloud
5. Spring Security

#Discovery Service(Eureka Server) application.properties:
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false

#Other Services sample (Eureka Client) application.properties:
server.port=8280
spring.application.name=movie-info-service


# Eureka Server Dependancy:
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>

# Eureka Client Dependancy:
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    <version>2.2.0.RELEASE</version>
</dependency>
