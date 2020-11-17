package ro.nexttech.intership.week1.tuseday.exercise1;

import java.util.ArrayList;
import java.util.List;

public class MainLambda {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("DaniL", "fRedi", "AleX", "Andre", "Nati", "Nuca"));
        List<Integer> numbers = new ArrayList<>(List.of(1, 62, 33));
        List<Person> persons = new ArrayList<>(List.of(new Person("Andrei", 29, "ro"),
                new Person("Mark", 44, "hu"),
                new Person("Vasile", 19, "ro"),
                new Person("Tom", 82, "uk"),
                new Person("Ana", 4, "hu"),
                new Person("Armand", 24, "ro"),
                new Person("Ion", 15, "ro")
        ));

        LambdaWordsService wordsService = new LambdaWordsService(words);
        System.out.println(wordsService.setWordsToUppercase());
        System.out.println(wordsService.filterByLengthAndChar());
        System.out.println(wordsService.sortUppercaseWordsStartsWithN());
        System.out.println(wordsService.formatEvenOddNumbers(numbers));

        LambdaPersonService personService = new LambdaPersonService(persons);
        System.out.println(personService.findTheOldestPerson());
        System.out.println(personService.findMinorPersons());
        System.out.println(personService.findMajorRomanianPersonWithA());
    }
}
