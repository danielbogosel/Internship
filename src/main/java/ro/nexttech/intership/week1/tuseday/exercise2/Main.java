package ro.nexttech.intership.week1.tuseday.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>(List.of(
                new Author("Christie", "Agatha", 85, Gender.Female),
                new Author("Christie", "Ana", 22, Gender.Female),
                new Author("May", "Karl", 70, Gender.Male),
                new Author("Twain", "Mark", 70, Gender.Male),
                new Author("Twain", "Isabelle", 24, Gender.Female),
                new Author("Cioran", "Emil", 26, Gender.Female),
                new Author("Austen", "Jane", 19, Gender.Female),
                new Author("Austen", "Emily", 68, Gender.Female),
                new Author("Dickens", "Charles", 70, Gender.Male),
                new Author("Dickens", "John", 71, Gender.Male),
                new Author("Jane", "Austen", 67, Gender.Female),
                new Author("Jane", "Bonnet", 71, Gender.Female),
                new Author("Tudoe", "Arghezi", 72, Gender.Male),
                new Author("Atkinson", "Kate", 68, Gender.Female),
                new Author("Atkinson", "Louise", 66, Gender.Female)
        ));
        AuthorService authorService = new AuthorService(authors);
        System.out.println(authorService.getUppercaseNameOfOldAuthors());
        System.out.println(authorService.calculateSumOfFemaleAuthorAges());
    }
}
