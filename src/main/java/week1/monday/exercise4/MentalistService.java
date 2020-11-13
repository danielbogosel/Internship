package week1.monday.exercise4;

import java.util.Random;

public class MentalistService {
    public String generateString() {
        Random random = new Random();
        int n = 100000 + random.nextInt(90000);
        String generatedString = String.valueOf(n);
        return generatedString;
    }
}
