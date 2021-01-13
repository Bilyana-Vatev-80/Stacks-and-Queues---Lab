import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchPotato_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] child = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());
        int cycle = 1;

        ArrayDeque<String> kids = new ArrayDeque<>();

        for (String kid : child) {
            kids.offer(kid);
        }
        while (kids.size() > 1) {
            for (int i = 1; i < number; i++) {
                kids.offer(kids.poll());
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + kids.peek());
            } else {
                System.out.println("Removed " + kids.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + kids.poll());
    }

    private static boolean isPrime(int cycle) {
        int factors = 0;
        int j = 1;

        while (j <= cycle) {
            if (cycle % j == 0) {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }

}
