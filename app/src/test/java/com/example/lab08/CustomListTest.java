package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    void testDelete() {
        CityList list = mockCityList();
        City beaumont = new City("Beaumont", "Alberta");
        assertThrows(IllegalArgumentException.class, () -> list.delete(beaumont));
    }
    @Test
    void testCountCities() {
        CityList list = new CityList();
        assertEquals(0,list.countCities());
        list.add(new City ("calgary","alberta"));
        list.add(new City("edmonton", "alberta"));
        assertEquals(2,list.countCities());
    }
}
