package ro.nexttech.intership.week1.tuseday.exercise1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class LambdaWordsService {
    public List<String> words;


    public LambdaWordsService(List<String> list) {
        this.words = list;
    }


    public List<String> setWordsToUppercase() {
        return words.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }

    public List<String> filterByLengthAndChar() {
        return words.stream()
                .filter(name -> name.length() == 5 && name.contains("n"))
                .collect(toList());
    }

    public List<String> sortUppercaseWordsStartsWithN() {
        return words.stream()
                .filter(word -> word.startsWith("N"))
                .map(String::toUpperCase)
                .sorted()
                .collect(toList());
    }

    public List<String> formatEvenOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(number ->
                        number % 2 == 0 ? "e" + number : "o" + number
                )
                .collect(toList());
    }
}
