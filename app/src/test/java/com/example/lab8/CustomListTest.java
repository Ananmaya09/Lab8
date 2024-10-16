package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity() {
        list = MockCityList();
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    void testDelete() {
        list = MockCityList();
        City city = new City("Leduc", "Alberta");
        list.addCity(city);
        list.delete(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    void testCountCities() {
        list = MockCityList();
        assertEquals(0, list.countCities());
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        assertEquals(1, list.countCities());
    }




}
