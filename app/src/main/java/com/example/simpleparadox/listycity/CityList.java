package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Return the total number of cities
     * @return
     * It will return the size of city list
     */

    public void countCities(){
        // code for count cities
    }

    /**
     * Delete a specified city from the list
     * @param city
     * A city to delete
     */

    public void delete(City city){
        //city thakle city delete korbe... na thakle exception throw korbe
        //also add the exception if the city does not in the list


    }

}
