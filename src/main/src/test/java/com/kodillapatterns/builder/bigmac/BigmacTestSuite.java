package com.kodillapatterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("ordinary")
                .burger("Three")
                .sauce("spicy")
                .ingredient("onion")
                .ingredient("tomatoe")
                .ingredient("cucamber")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
