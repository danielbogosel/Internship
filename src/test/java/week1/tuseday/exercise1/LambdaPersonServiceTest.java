package week1.tuseday.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambdaPersonServiceTest {
    public static final Person MINOR = new Person("Andreea", 12, "hu");
    public static final Person MAJOR = new Person("Andrew", 23, "ro");
    private LambdaPersonService classUnderTest;

    @BeforeEach
    void init() {
        List<Person> list = new ArrayList<>();
        list.add(MAJOR);
        list.add(MINOR);
        classUnderTest = new LambdaPersonService(list);
    }

    @Test
    void findTheOldestPerson() {
        Person person = classUnderTest.findTheOldestPerson();
        assertNotNull(person);
        assertEquals(MAJOR, person);
    }

    @Test
    void findMinorPersons() {
        List<Person> result = classUnderTest.findMinorPersons();
        assertNotNull(result);
        assertEquals(MINOR, result.get(0));
    }

    @Test
    void findMajorRomanianPersonWithA() {
        List<Person> result = classUnderTest.findMajorRomanianPersonWithA();
        assertNotNull(result);
        assertEquals(MAJOR, result.get(0));

    }
}