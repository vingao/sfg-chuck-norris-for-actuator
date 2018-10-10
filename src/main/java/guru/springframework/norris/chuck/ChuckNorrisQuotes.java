package guru.springframework.norris.chuck;

import java.util.Random;

public class ChuckNorrisQuotes {
    public static String getRandomQuote() {
        return "joke " + getRandomNumberInRange(1, 100);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
