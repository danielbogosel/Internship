package week1.tuseday.exercise2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class AuthorService {
    private final List<Author> authors;

    public AuthorService(List<Author> authors) {
        this.authors = authors;
    }

    public Set<String> getUppercaseNameOfOldAuthors() {
        return authors.stream()
                .filter(author -> author.getAge() >= 66)
                .map(author -> author.getSurName().toUpperCase())
                .limit(7)
                .collect(Collectors.toSet());
    }

    public Integer calculateSumOfFemaleAuthorAges() {
        return authors.stream()
                .filter(author -> author.getAge() < 25 && author.getGender().equals(Gender.Female))
                .mapToInt(Author::getAge)
                .sum();
    }
}
