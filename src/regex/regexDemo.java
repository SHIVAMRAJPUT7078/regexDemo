package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo {
    public static void main(String[] args) {
        /*String pattern = "[a-z]{4}@[0-9]{4}";
        System.out.println(Pattern.matches(pattern,"shiv@7078"));*/
        // or this can also be writen as
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pattern");
        String pattern = scanner.nextLine().trim();
        Pattern pattern1 = Pattern.compile(pattern);
        System.out.println("enter text");
        String text  = scanner.nextLine().trim();
        Matcher matcher = pattern1.matcher(text);
        while (matcher.find()){
            System.out.println("I found the match string starting at the index " + matcher.start() + "ending with index " + matcher.end());
        }
    }
}
