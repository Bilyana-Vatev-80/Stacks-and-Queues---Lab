import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!task.equals("printer")) {
            if (task.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            } else {
                printerQueue.offer(task);
            }
            task = scanner.nextLine();
        }
        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
