# Restaurant Application

## Frameworks and Languages used:
* `Java 17`
* `Maven 4.0.0`
* `Spring Boot 3.0.5(Framwork)`
* `IntelliJ IDEA 2023.1 (Community Edition)`


## Data Flow:
 1. ### Model: 
    Created Restaurant class along with properties like restaurantId, restaurantName, specialty, address,contactNumber,totalStaff and create a constructor, and getters and setters.
 1. ### Controller: 
    * Created RestaurantController class in which having annotation like @GetMapping,
    @PostMapping,@PutMapping,@DeleteMapping.Created a object of RestaurantService class through dependency injection using @Autowired annotation.

    #### API Reference:
    * Get all restaurants:

      ```http://localhost:8080/restaurants```

    * Get Restaurant By Id:

      ```http://localhost:8080/restaurant/{id}```  

    * Add Restaurant:

      ```http://localhost:8080/restaurant/add```

    * Delete Restaurant By Id:

      `http://localhost:8080/restaurant/delete/{id}`

    * Update Restaurant By Speciality:

      `http://localhost:8080/restaurant/update/{id}/{speciality}` 




 1. ### Service: 
    * It consist RestaurantService class in which having some buisness logic.
    * @Service annotation is used to make the class as a service layer.

 1. ### Repository:
    * Created RestaurantDao class in which used ArrayList to manage the data of restaurants by performing CRUD operations.



## Data Structure
Used ArrayList to store the Restaurant type object.

## Project Summary
In this spring boot application I had created API's mapping for CRUD operations like create(save), read(get), update and delete restaurant and using MVC Architecture, it is way to organise our code.