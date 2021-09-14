/*
UCF COP3330 FALL 2021 ASSIGNMENT 3 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args)
    {
        String quote, author;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the quote?");
        quote = scan.nextLine();
        System.out.println("Who said it?");
        author = scan.nextLine();
        System.out.println(author +" says, \"" + quote + ".\"");



    }
}
