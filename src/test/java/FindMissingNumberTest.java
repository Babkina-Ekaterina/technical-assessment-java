import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingNumberTest {
    @Test
    @DisplayName("Missing one element")
    public void testGeneralMissingCase() {
        //given
        int[] numbers = {1, 2, 3, 5, 6};

        //when
        int result = Main.findMissingNumber(numbers);

        //then
        assertEquals(4, result);
    }

    @Test
    @DisplayName("Missing one element")
    public void testGeneralMissingCase2() {
        //given
        int[] numbers = {20, 21, 23};

        //when
        int result = Main.findMissingNumber(numbers);

        //then
        assertEquals(22, result);
    }

    @Test
    @DisplayName("Array has one element")
    public void testSingleElementArray() {
        //given
        int[] numbers = {10};

        //when
        int result = Main.findMissingNumber(numbers);

        //then
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("There are too many missing numbers")
    public void testTooManyMissingNumbers() {
        //given
        int[] numbers = {2, 5, 6, 7};

        //when
        int result = Main.findMissingNumber(numbers);

        //then
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("There is no missing number")
    public void testNoMissingNumber() {
        //given
        int[] numbers = {1, 2, 3, 4, 5};

        //when
        int result = Main.findMissingNumber(numbers);

        //then
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Array is null")
    public void testNullArray() {
        //given
        int[] numbers = null;

        //when
        int result = Main.findMissingNumber(numbers);

        //then
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Array is empty")
    public void testEmptyArray() {
        //given
        int[] numbers = {};

        //when
        int result = Main.findMissingNumber(numbers);

        //then
        assertEquals(-1, result);
    }
}

