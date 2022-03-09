package fr.lernejo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.lernejo.Sample.Operation;

public class SampleTest {
    private Sample instance;

    @BeforeEach
    public void setUp() {
        instance = new Sample();
    }

    @Test
    public void testAddition() {
        assertEquals(instance.op(Operation.ADD, 5, 133), 138);
        assertEquals(instance.op(Operation.ADD, 1, 1), 2);
    }

    @Test
    public void testMult() {
        assertEquals(instance.op(Operation.MULT, 5, 5), 25);
        assertEquals(instance.op(Operation.MULT, 6, 7), 42);
        assertEquals(instance.op(Operation.MULT, 0, 48978927), 0);
    }

    @Test
    public void testFact() {
        assertEquals(instance.fact(5), 120);
        assertEquals(instance.fact(1), 1);
        assertEquals(instance.fact(0), 1);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> instance.fact(-1));
        assertEquals("N should be positive", e.getMessage());
    }
}

