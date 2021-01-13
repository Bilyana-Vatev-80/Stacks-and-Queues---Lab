import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());
        int currentRound = 1;
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String s : children) {
            queue.offer(s);
        }
        while (queue.size() > 1) {
            String currentName = queue.poll();
            if (currentRound % n != 0) {
                queue.offer(currentName);
            } else {
                System.out.println("Removed " + currentName);
            }
            currentRound++;
        }
        System.out.println("Last is " + queue.poll());
    }
}
