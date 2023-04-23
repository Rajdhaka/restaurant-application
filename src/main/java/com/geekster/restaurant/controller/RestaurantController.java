package com.geekster.restaurant.controller;

import ch.qos.logback.core.boolex.EvaluationException;
import com.geekster.restaurant.model.Restaurant;
import com.geekster.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value="/restaurants")
    public List<Restaurant> getAllRestaurant(){
        return  restaurantService.getAllRestaurant();
    }
    @GetMapping(value="/restaurant/{restaurantId}")
    public Restaurant getRestaurantById(@PathVariable String restaurantId){
        return  restaurantService.getRestaurantById(restaurantId);
    }

    @PostMapping(value = "/restaurant/add")
    public String addRestaurant(@RequestBody Restaurant res){
        return restaurantService.addRestaurant(res);
    }

    @DeleteMapping(value = "/restaurant/delete/{restaurantId}")
    public String deleteRestaurant(@PathVariable String restaurantId){
        return restaurantService.deleteRestaurant(restaurantId);
    }
    @PutMapping(value = "/restaurant/update/{restaurantId}/{specialty}")
    public String updateRestaurant(@PathVariable String restaurantId,@PathVariable String specialty){
        return restaurantService.updateRestaurant(restaurantId,specialty);
    }
}
