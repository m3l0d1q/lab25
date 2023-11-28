package ru.mirea.task4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input1 = "user@example.com";
        String input2 = "myhost@@@com.ru";

        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher1 = pattern.matcher(input1);
        boolean isMatch1 = matcher1.matches();
        System.out.println("String 1 is a match: " + isMatch1);

        Matcher matcher2 = pattern.matcher(input2);
        boolean isMatch2 = matcher2.matches();
        System.out.println("String 2 is a match: " + isMatch2);
    }
}
