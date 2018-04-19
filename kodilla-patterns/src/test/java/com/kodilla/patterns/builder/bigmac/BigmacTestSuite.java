package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BigmacTestSuite {

    @Test
    public void shouldBuildNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(true)
                .burgers(2)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("cucumber")
                .build();


        //When
        int burgers = bigmac.getBurgers();
        List<String> bigmacIngredients = bigmac.getIngredients();
        String sauce = bigmac.getSauce();
        boolean bun = bigmac.isBun();

        //Then
        assertTrue(bun);
        assertEquals(2, burgers);
        assertEquals("standard", sauce);
        assertEquals(Arrays.asList("onion", "cucumber"), bigmacIngredients);

    }
}
