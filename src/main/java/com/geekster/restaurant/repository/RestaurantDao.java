package com.geekster.restaurant.repository;

import com.geekster.restaurant.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {
    private List<Restaurant>resList;
    public RestaurantDao(){
        resList=new ArrayList<>();
        resList.add(new Restaurant("0","Restaurant1","Good Service","Rajasthan","9587******",15));
    }

    public List<Restaurant> getAll(){
        return resList;
    }
    public boolean save(Restaurant res){
        resList.add(res);
        return true;
    }
    public boolean remove(Restaurant res){
        resList.remove(res);
        return true;
    }
    public boolean update(String restaurantId,String specialty){
        for(Restaurant restaurant : resList){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                resList.remove(restaurant);
                restaurant.setSpecialty(specialty);
                save(restaurant);
                return true;
            }
        }
        return  false;
    }
}
