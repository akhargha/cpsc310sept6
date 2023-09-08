package edu.trinity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckCoPrimeTest {

    @Test
    void coPrime() {
        CheckCoPrime prime = new CheckCoPrime();
        assertEquals(true, prime.coPrime(3, 7));
    }
}