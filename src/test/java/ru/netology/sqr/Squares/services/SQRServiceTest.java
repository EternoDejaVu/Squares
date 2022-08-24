package ru.netology.sqr.Squares.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {

    @Test
    public void countSquares() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcSQRT(300, 500);

        Assertions.assertEquals(expected, actual);
    }


}
