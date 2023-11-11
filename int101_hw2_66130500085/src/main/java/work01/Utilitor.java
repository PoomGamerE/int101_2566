package work01;

public class Utilitor {

    public String testString(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public double testPositive(double value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public long computeIsbn10(long isbn10) {
        int count = 1;
        int sumisbn = 0;
        while (isbn10 > 0) {
            int temp = (int) isbn10 % 10;
            sumisbn = sumisbn + (temp * count);
            isbn10 = isbn10 / 10;
            count++;
        }
        return sumisbn % 11;
    }
}
