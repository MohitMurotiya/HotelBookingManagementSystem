# HotelBookingManagementSystem
Sprint 2

--MICROSERVICES--

HOTEL MANAGEMENT SYSTEM: This micro-service will communicate with the hotel management database which has two different tables of Hotels and Rooms.
This service will basically act as a mediator between Hotel Database and the Hotel Update Service, Hotel View Service, Room Update Service, Room View Service. This service will provide data only specific to services related to Hotel Management System.

HOTELS UPDATE SERVICE: This service is use to perform CRUD operations related to Hotel by an Admin.
This service will communicate to Hotel Management Service to perform these operations. Following is a list of functionalities of the system:
a)	Add Hotel details
b)	Modify/Update Hotel details
c)	Delete Hotel

HOTEL VIEW SERVICE: This micro-service is used for only view specific functionalities related to Hotels used by customers and admin and it’ll fetch the data from Hotel table with the help of Hotel Management Service
a)	Display all Hotels
b)	Search Hotels based on their cities and ratings

ROOM UPDATE SERVICE: This service is use to perform CRUD operations related to Rooms by an Admin. This service will communicate to Hotel Management Service to perform these operations. Following is a list of functionalities of the system:
a)	Add Room details
b)	Modify/Update Room details
c)	Delete Room

ROOM VIEW SERVICE: This micro-service is used for only view specific functionalities related to Rooms used by customers, employees and admin and it’ll fetch the data from Room table with the help of Hotel Management Service. Following is a list of functionalities of the system:
a)	Display all Rooms of a particular Hotel
b)	Search different types of rooms

BOOKING MANAGEMENT SERVICE: The functionality of this service is to integrate the different micro-services, i.e. Hotel Management and User Management service. The portal is created through which a customer and employee both can book rooms and admin can see all the booking details.

BOOKING UPDATE SERVICE: This micro-service is used to book rooms
a)	Customer & Employee can book rooms.

BOOKING VIEW SERVICE: This micro-service used to generate various reports like: 
a)	Status of booking
b)	Bookings related to specific customer
c)	View All Bookings of a specific Hotels
d)	Booking on a specific date

USER MANAGEMENT SERVICE: This micro-service will communicate with the User management database and the Database contains the information about customers, employees. This service will basically act as a mediator between User Database and the User Update Service, User View Service. This service will provide data only specific to services related to User Management System.

USER UPDATE SERVICE: This micro-service is used to register a new user and perform operations like update, delete by customer and employee only. This service will communicate User Management Service to perform these operations.
a)	Register a user
b)	Modify/Update user details
c)	Delete user

USER VIEW SERVICE: The functionality of this service is to check whether the logged in user is an admin or an employee or a customer and redirect them to their respective portals where they will be able to perform the operations mentioned in the above micro-services and also provide registered customers and employees details to admin.
a)	Display all the customers
b)	Display all the employees
c)	Return role of different users
