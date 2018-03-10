package com.codewars.kyu8.TransportationOnVacation;

import org.junit.Test;
import static org.junit.Assert.*;

public class RentalCarExampleTests {
    @Test
    public void under3Tests() {
        assertEquals(40, KataRentalCarCost.rentalCarCost(1));
        assertEquals(80, KataRentalCarCost.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, KataRentalCarCost.rentalCarCost(3));
        assertEquals(140, KataRentalCarCost.rentalCarCost(4));
        assertEquals(180, KataRentalCarCost.rentalCarCost(5));
        assertEquals(220, KataRentalCarCost.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, KataRentalCarCost.rentalCarCost(7));
        assertEquals(270, KataRentalCarCost.rentalCarCost(8));
        assertEquals(310, KataRentalCarCost.rentalCarCost(9));
        assertEquals(350, KataRentalCarCost.rentalCarCost(10));
    }

}