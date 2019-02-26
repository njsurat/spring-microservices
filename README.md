Spring Microservices
---------------------

The application uses an H2 In Memory database

1.) Application Microservices
-------------------
Runs on port: 8081

H2 Console: http://localhost:8081/console/

The jdbc url should be: jdbc:h2:mem:testdb

The user name is "sa" and there is no password.

Swagger URL: http://localhost:8081/swagger-ui.html


2.)Ticket Microservices
-------------------
Runs on port: 8082

H2 Console: http://localhost:8082/console

The jdbc url should be: jdbc:h2:mem:testdb

The user name is "sa" and there is no password

Swagger URL: http://localhost:8083/swagger-ui.html


3.) User/Person Microservices
-------------------
Runs on port: 8083

H2 Console: http://localhost:8083/console/

The jdbc url should be: jdbc:h2:mem:testdb

The user name is "sa" and there is no password

Swagger URL: http://localhost:8083/swagger-ui.html
