```java
import java.util.Random;
import java.util.Scanner;

public class SlotMachineSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] slots = {"Cherry", "Lemon", "Orange", "Plum", "Bell", "Bar", "Seven"};
        int balance = 1000;
        int bet;

        while (true) {
            System.out.println("Balance: $" + balance);
            System.out.print("Enter bet (0 to quit): ");
            bet = scanner.nextInt();

            if (bet == 0) {
                break;
            }

            if (bet > balance) {
                System.out.println("You cannot bet more than your balance.");
                continue;
            }

            balance -= bet;

            String slot1 = slots[random.nextInt(slots.length)];
            String slot2 = slots[random.nextInt(slots.length)];
            String slot3 = slots[random.nextInt(slots.length)];

            System.out.println(slot1 + " " + slot2 + " " + slot3);

            if (slot1.equals(slot2) && slot2.equals(slot3)) {
                int winnings = bet * 10;
                System.out.println("You won $" + winnings + "!");
                balance += winnings;
            } else {
                System.out.println("You lost.");
            }
        }

        System.out.println("You leave with $" + balance + ".");
    }
}
```