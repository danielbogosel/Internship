package ro.nexttech.intership.week1.tuseday.exercise1;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class LambdaPersonService {
    private List<Person> persons;

    public LambdaPersonService(List<Person> persons) {
        this.persons = persons;
    }

    public Person findTheOldestPerson() {
        return persons.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .findFirst()
                .orElse(null);
    }

    public List<Person> findMinorPersons() {
        return persons.stream()
                .filter(person -> person.getAge() < 18)
                .collect(toList());
    }

    public List<Person> findMajorRomanianPersonWithA() {
        return persons.stream()
                .filter(person -> person.getAge() > 18 && person.getName().startsWith("A") && person.getNationality().equals("ro"))
                .collect(toList());
    }

}
