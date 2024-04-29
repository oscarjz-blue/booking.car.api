# booking.car.api
  booking.car.api

# Start Spring io:
https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.2.5&packaging=jar&jvmVersion=17&groupId=com.copilot&artifactId=booking.car.api&name=booking.car.api&description=Project%20of%20Booking%20Car&packageName=com.copilot.booking.car.api&dependencies=web,data-jpa,security,h2,lombok

# Prompt to create entity, service and controller with Copilot:

## create User Entity
// create entity with following aspects userName String Required, Unique
userEmail String Required, Unique
userPassword String Required, Unique
proofId String Required, Unique

## create Car Entity
// create entity with following characteristic Car
Name Type Condition
carID String Required, Unique
carModel String Required
registrationNumber String Required, Unique
carAvailability String Required
brand String Required
pricePerHour Number Required
thumbnail String Required

## create Reservation Entity
// create entity following this characteristic ReservationName Type Condition
bookingId String Required, Unique
userEmail String Required, Unique
carID String Required, Unique
reservationDate Date Required
pickupDate Date Required
returnDate Date RequirednumOfTravellers Number Required
status String Required
car String Required
img String Required
total Number Required

## create Controller and Service
// create Controller and Service with following Features:
As a user role following functionalities need to be implemented:
a. User needs to register and login
b. User can search for the Car
c. Users can book the car as per the availability.
d. Users can cancel the booking.

// create UserRepository

// create CarRepository

// create ReservationRepository

// add swagger to this project (not working properly)

// create CRUD for Car with controller and service

// create CRUD for Reservation with controller and service

// create login with spring boot security (not working properly)

// crear userLogin Controller and Service by DTO communication

# Link to test H2 database:
- http://localhost:8080/h2-console/

# Link to test service by swagger:
- http://localhost:8080/swagger-ui/index.html

# Info about Spring Boot 3 + Swagger:
- https://stackoverflow.com/questions/77196323/spring-boot-3-configure-spring-security-to-allow-swagger-ui
