package com.geekster.restaurant.service;

import com.geekster.restaurant.model.Restaurant;
import com.geekster.restaurant.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantDao restaurantDao;
    public List<Restaurant> getAllRestaurant() {
        return restaurantDao.getAll();
    }

    public Restaurant getRestaurantById(String restaurantId){
        if(restaurantId != null){
            List<Restaurant>allList=restaurantDao.getAll();
            for(Restaurant restaurant:allList){
                if(restaurant.getRestaurantId().equals(restaurantId)){
                    return restaurant;
                }
            }
        }
        return  null;
    }

    public String addRestaurant(Restaurant res) {
        boolean addRes= restaurantDao.save(res);
        if(addRes){
            return "Restaurant is added successfully !!!";
        }
        else{
            return "Failed ,Restaurant not possible, Database Error";
        }
    }

    public String deleteRestaurant(String restaurantId) {
        if(restaurantId != null){
            List<Restaurant>allList=restaurantDao.getAll();
            for(Restaurant restaurant:allList) {
                if (restaurant.getRestaurantId().equals(restaurantId)) {
                    boolean deleteRes = restaurantDao.remove(restaurant);
                    if (deleteRes) {
                        return "Restaurant with id " + restaurantId + " was deleted successfully";
                    } else {
                        return "Restaurant with id " + restaurantId + " was not deleted ";
                    }
                }
            }
            return "Restaurant with Id "+ restaurantId+ " does not exist";
        }
        return  "Invalid Id.... Can not accept Null Id !!!";

    }

    public String updateRestaurant(String restaurantId,String specialty){
        boolean updateRes = restaurantDao.update(restaurantId,specialty);
        if(updateRes){
            return "Restaurant with id " + restaurantId + " was updated successfully !!!";
        }
        else {
            return "Restaurant with id "+ restaurantId+ " was not updated ";
        }
    }
}
