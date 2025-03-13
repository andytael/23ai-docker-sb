# Spring Boot and an Oracle Database 23ai Free Docker container.

1. Run with `mvn clean spring-boot:run`
1. Login with `sql app_user/Welcome-12345@//localhost:1521/freepdb1` and `select * from regions;`. Data is there.
1. Test endpoint with `curl http://localhost:8080/listregions`

App crashes with `ORA-00942: table or view "SYSTEM"."REGIONS" does not exist`.
