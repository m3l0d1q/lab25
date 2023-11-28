package ru.mirea.task2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        String regex = "abcdefghijklmnopqrstuv18340";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher1 = pattern.matcher(input1);
        boolean isMatch1 = matcher1.matches();
        System.out.println("String 1 is a match: " + isMatch1);

        Matcher matcher2 = pattern.matcher(input2);
        boolean isMatch2 = matcher2.matches();
        System.out.println("String 2 is a match: " + isMatch2);
    }
}

