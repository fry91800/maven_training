package fr.lernejo;

import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void testAddTwoPositiveNumbers() {
        // Arrange
        int a = 2;
        int b = 3;
        int somme = a+b;

        // Assert
        assertEquals(5, somme);
    }
    @Test
    void factDe3Fait6() {
        // Arrange
        Sample sample = new Sample();
        int base = sample.fact(3);

        // Assert
        assertEquals(6, base);
    }
    @Test
    void add1Et2Fait3() {
        // Arrange
        Sample sample = new Sample();
        int base = sample.op(ADD,1,2);

        // Assert
        assertEquals(3, base);
    }
    @Test
    void mult5Et6Fait30() {
        // Arrange
        Sample sample = new Sample();
        int base = sample.op(MULT,5,6);

        // Assert
        assertEquals(30, base);
    }

}
