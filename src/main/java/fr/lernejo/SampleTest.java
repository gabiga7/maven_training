package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void op_add_basic() {
        Sample sample = new Sample();
        Assertions.assertEquals(sample.op(Sample.Operation.ADD, 10, 10), 20);
    }
    @Test
    void op_add_neg() {
        Sample sample = new Sample();
        Assertions.assertEquals(sample.op(Sample.Operation.ADD, 10, -10), 0);
    }
    @Test
    void op_mult_basic() {
        Sample sample = new Sample();
        Assertions.assertEquals(sample.op(Sample.Operation.MULT, 10, 10), 100);
    }
    @Test
    void op_mult_neg() {
        Sample sample = new Sample();
        Assertions.assertEquals(sample.op(Sample.Operation.MULT, 10, -10), -100);
    }
    @Test
    void op_mult_zero() {
        Sample sample = new Sample();
        Assertions.assertEquals(sample.op(Sample.Operation.MULT, 10, 0), 0);
    }
    @Test
    void fact_basic() {
        Sample sample = new Sample();
        Assertions.assertEquals(sample.fact(5), 120);
    }
    @Test
    void fact_one() {
        Sample sample = new Sample();
        Assertions.assertEquals(sample.fact(1), 1);
    }
    @Test
    void fact_zero() {
        Sample sample = new Sample();
        Assertions.assertEquals(sample.fact(0), 1);
    }
    @Test
    void fact_neg() {
        Sample sample = new Sample();
        Assertions.assertThrows(IllegalArgumentException.class, () -> sample.fact(-5));
    }
}
