package ro.nexttech.intership.week1.tuseday.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambdaWordsServiceTest {
    public static final String HAPCIU = "haPciu";
    public static final String NANDO = "Nando";
    private LambdaWordsService classUnderTest;

    @BeforeEach
    void init() {
        List<String> list = new ArrayList<>();
        list.add(HAPCIU);
        list.add(NANDO);
        classUnderTest = new LambdaWordsService(list);
    }

    @Test
    void setWordsToUppercase() {
        List<String> result = classUnderTest.setWordsToUppercase();
        assertNotNull(result);
        assertEquals("HAPCIU", result.get(0));
    }

    @Test
    void filterByLengthAndChar() {
        List<String> result = classUnderTest.filterByLengthAndChar();
        assertNotNull(result);
        assertEquals(NANDO, result.get(0));
    }

    @Test
    void sortUppercaseWordsStartsWithN() {
        List<String> result = classUnderTest.sortUppercaseWordsStartsWithN();
        assertNotNull(result);
        assertEquals(NANDO.toUpperCase(), result.get(0));
    }

    @Test
    void formatEvenOddNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(23);
        List<String> result = classUnderTest.formatEvenOddNumbers(list);
        assertNotNull(result);
        assertEquals("e" +list.get(0), result.get(0));
        assertEquals("o" +list.get(1), result.get(1));


    }
}