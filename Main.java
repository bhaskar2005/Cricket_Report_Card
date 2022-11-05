import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        int i = 0;
        int match = 0;
        int score = 0;
        int hc = 0;
        int c = 0;
        while (i < 100) {
            System.out.print("\nEnter your match individual score: ");
            int newscore = input.nextInt();
            if (newscore >= 50 && newscore < 100) {
                hc++;
            }
            if (newscore >= 100) {
                c++;
            }
            score = score + newscore;
            float avg = score / (match + 1f);
            match++;

            System.out.println("\n\n\treport card\n");
            System.out.println(name);
            System.out.println("\nMatch: " + match);
            System.out.println("Run: " + score);
            System.out.println("Average: " + avg);
            System.out.println("Half century: " + hc);
            System.out.println("Century: " + c);
            i++;
        }
    }
}
