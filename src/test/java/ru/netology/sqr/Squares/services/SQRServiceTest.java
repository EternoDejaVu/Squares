package ru.netology.sqr.Squares.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {

    @Test
    public void accountCalc16() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQRT(10, 99);

        Assertions.assertEquals(expected, actual);
    }


}
