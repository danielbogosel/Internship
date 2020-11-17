package ro.nexttech.intership.week1.monday.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringGenerator {
    public String generateString() {
        String randomString = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0; i < 5; i++) {
            randomString = randomString + (list.get(i));
        }
        return randomString;
    }
}