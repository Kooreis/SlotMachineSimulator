```CSharp
using System;

class Program
{
    static void Main(string[] args)
    {
        Random random = new Random();
        string[] slots = new string[3];
        string[] symbols = { "Cherry", "Lemon", "Orange", "Plum", "Bell", "Bar", "Seven" };
        int balance = 1000;
        int bet;

        Console.WriteLine("Welcome to the Slot Machine Simulator!");
        Console.WriteLine("You start with a balance of $1000.");

        while (balance > 0)
        {
            Console.WriteLine("\nPlease enter your bet:");
            bet = Convert.ToInt32(Console.ReadLine());

            if (bet > balance)
            {
                Console.WriteLine("You cannot bet more than your current balance.");
                continue;
            }

            balance -= bet;

            for (int i = 0; i < 3; i++)
            {
                slots[i] = symbols[random.Next(symbols.Length)];
                Console.Write(slots[i] + " ");
            }

            if (slots[0] == slots[1] && slots[1] == slots[2])
            {
                Console.WriteLine("\nCongratulations! You won $" + bet * 10 + "!");
                balance += bet * 10;
            }
            else
            {
                Console.WriteLine("\nSorry, you lost this round.");
            }

            Console.WriteLine("Your current balance is $" + balance + ".");
        }

        Console.WriteLine("You ran out of money. Game over.");
    }
}
```