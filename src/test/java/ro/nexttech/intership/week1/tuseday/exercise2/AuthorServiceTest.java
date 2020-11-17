package ro.nexttech.intership.week1.tuseday.exercise2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AuthorServiceTest {
    public static final Author MALE = new Author("Tolstoi", "Lev", 67, Gender.Male);
    public static final Author FEMALE = new Author("Christie", "Agatha", 24, Gender.Female);
    public static final Set<String> expected = new HashSet<>();
    private static final Integer SUM = 24;
    private AuthorService classUnderTest;

    @BeforeEach
    void init() {
        List<Author> list = new ArrayList<>();
        list.add(MALE);
        list.add(FEMALE);
        expected.add("TOLSTOI");
        classUnderTest = new AuthorService(list);
    }

    @Test
    void getUppercaseNameOfOldAuthors() {
        Set<String> result = classUnderTest.getUppercaseNameOfOldAuthors();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(expected, result);
    }

    @Test
    void calculateSumOfFemaleAuthorAges() {
        Integer result = classUnderTest.calculateSumOfFemaleAuthorAges();
        assertNotNull(result);
        assertEquals(SUM, result);


    }
}