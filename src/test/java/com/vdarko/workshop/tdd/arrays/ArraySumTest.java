package com.vdarko.workshop.tdd.arrays;

import org.junit.jupiter.api.Test;

public class ArraySumTest {

  /**
   * <b>GIVEN</b> array of integer values {1, 2, 3, 4, 5}</br>
   * <b>WHEN</b> sum is calculated</br>
   * <b>THEN</b> sum value is 15</br>
   */
  @Test
  public void testSum() {

    // GIVEN
    Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5 };
    Integer expectedValue = 15;

    // WHEN
    ArraySum arraySum = new ArraySum();
    Integer result = arraySum.sum(numbers);

    // THEN


  }
}
