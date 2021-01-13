import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        String navigator = scanner.nextLine();
        String current = "";
        while (!navigator.equals("Home")) {
            if (navigator.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    navigator = scanner.nextLine();
                    continue;
                } else {
                    current = history.pop();
                }
            } else {
                if (!current.isEmpty()) {
                    history.push(current);
                }
                current = navigator;
            }
            navigator = scanner.nextLine();
            System.out.println(current);
        }
    }
}
