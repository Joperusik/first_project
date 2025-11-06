package lesson24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    @Test
    void chouldRemoveValueFromArrays() {
        //give
        int[] arr = {3, 2, 2, 3};
        int[] expectedArr = {2, 2};
        //when
        int[] result = Practice.removeEllement(arr, 3);

        //then
        Assertions.assertArrayEquals(expectedArr, result);

    }

    @Test
    void profit() {
        //give
        int[] arr = {7,1,5,3,6,4};
        //when
        int maxProfit = Practice.maxProfit(arr);
        //then
        Assertions.assertEquals(5, maxProfit);
    }
}