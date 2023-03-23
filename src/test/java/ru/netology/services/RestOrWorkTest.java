package ru.netology.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestOrWorkTest {

    @Test

    public void test1() {
        RestOrWork service = new RestOrWork();


        int actual = service.calculate(10000, 3000, 20000);
        int expended = 3;

        Assertions.assertEquals(expended, actual);
    }

    @Test

    public void test2() {
        RestOrWork service = new RestOrWork();


        int actual = service.calculate(100000, 60000, 150000);
        int expended = 2;

        Assertions.assertEquals(expended, actual);
    }


}