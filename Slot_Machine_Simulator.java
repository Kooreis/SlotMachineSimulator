import java.util.Random;
import java.util.Scanner;

public class SlotMachineSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] slots = {"Cherry", "Lemon", "Orange", "Plum", "Bell", "Bar", "Seven"};
        int balance = 1000;
        int bet;