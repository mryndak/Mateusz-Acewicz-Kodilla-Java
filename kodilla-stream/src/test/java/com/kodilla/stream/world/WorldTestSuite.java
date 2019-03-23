package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testWorldPopulation() {
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent northAmerica = new Continent();

        europe.addCountry(new Country("Poland", new BigDecimal("32123321")));
        europe.addCountry(new Country("Germany", new BigDecimal("65421354")));
        europe.addCountry(new Country("France", new BigDecimal("40402987")));
        europe.addCountry(new Country("United Kingdom", new BigDecimal("22312312")));
        asia.addCountry(new Country("China", new BigDecimal("132745646")));
        asia.addCountry(new Country("India", new BigDecimal("1256321123")));
        asia.addCountry(new Country("Japan", new BigDecimal("35312312")));
        northAmerica.addCountry(new Country("USA", new BigDecimal("335312312")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("235312312")));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("2155263679");
        Assert.assertEquals(expected, totalPopulation);
    }
}
