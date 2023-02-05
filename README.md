# Python Documentation

# Slot Machine Python Script

This Python script simulates a simple slot machine game. The user can deposit money, pull the lever to spin the slot machine, check their balance, and quit the game. If the user spins and gets three of the same result, they win 50 coins. If not, they lose the 10 coins it costs to spin.

## Libraries Used

- `random`: This library is used to generate random choices for the slot machine spin. It is a built-in Python library for generating pseudo-random numbers. It is used in this script to randomly select a result for each spin of the slot machine.

## Class Description

- `SlotMachine`: This class represents the slot machine. It has methods to deposit money, pull the lever (spin), and check the balance.

## Method Description

- `__init__`: This method initializes the slot machine with a balance of 0.
- `deposit`: This method takes an amount as an argument and adds it to the balance.
- `pull_lever`: This method simulates pulling the lever on the slot machine. It checks if the balance is sufficient to spin. If it is, it deducts the cost of a spin and returns the result of the spin. If not, it returns a message asking the user to deposit more.
- `spin`: This method simulates spinning the slot machine. It generates three random results and checks if they are all the same. If they are, it adds the winnings to the balance and returns a winning message. If not, it returns a losing message.
- `get_balance`: This method returns the current balance.

## Main Function

The main function creates a slot machine and presents the user with a menu of options. The user can choose to deposit money, pull the lever, check their balance, or quit the game. The game continues until the user chooses to quit.

## Running the Script

To run the script, simply execute the Python file in your terminal. You will be prompted to choose an option from the menu. Follow the prompts to play the game.

---

# C# Documentation

# Slot Machine Simulator in C#

This repository contains a simple console-based Slot Machine Simulator written in C#. The script simulates a slot machine game where the user can place bets and win or lose money based on the outcome of each spin.

## Script Description

The script starts by welcoming the user and informing them of their starting balance, which is $1000. The user is then prompted to enter their bet. If the bet is more than the user's current balance, they are informed that they cannot bet more than their current balance, and they are prompted to enter their bet again.

The script then simulates a spin of the slot machine by randomly selecting three symbols from a list of seven possible symbols. The selected symbols are displayed to the user.

If all three symbols are the same, the user wins ten times their bet, and this amount is added to their balance. If the symbols are not all the same, the user loses their bet, and this amount is subtracted from their balance.

The user's current balance is then displayed, and the process repeats until the user's balance is zero, at which point the game ends.

## Imported Libraries

The script uses the following libraries:

- `System`: This is a built-in C# library that provides fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions. In this script, it is used for console input/output and for handling exceptions when converting the bet amount from a string to an integer.

- `Random`: This is a class in the `System` library that represents a pseudo-random number generator, a device that produces a sequence of numbers that meet certain statistical requirements for randomness. In this script, it is used to randomly select symbols for the slot machine spin.

## Usage

To run the script, you need a C# compiler. You can use the `csc` command-line compiler that comes with the .NET framework, or you can use an Integrated Development Environment (IDE) like Visual Studio. Compile the script with the command `csc Program.cs`, and then run the resulting executable with the command `Program.exe`.

---

# Java Documentation

# Slot Machine Simulator

This is a simple Java program that simulates a slot machine. The user starts with a balance of $1000 and can place bets. The slot machine has seven possible outcomes: Cherry, Lemon, Orange, Plum, Bell, Bar, and Seven. If all three slots match, the user wins ten times their bet. The game continues until the user decides to quit.

## Code Explanation

The script begins by importing two Java libraries:

- `java.util.Random`: This library is used to generate random numbers, which are used to randomly select the slot outcomes.
- `java.util.Scanner`: This library is used to read the user's input from the console.

The `main` function starts by initializing a `Scanner` object to read the user's input and a `Random` object to generate random numbers. It also initializes an array of strings to represent the possible slot outcomes and an integer to represent the user's balance.

The game runs in an infinite loop, which only breaks when the user enters a bet of 0. At the start of each loop, the user's balance is displayed and they are prompted to enter their bet. If the bet is greater than the user's balance, an error message is displayed and the loop continues to the next iteration.

If the bet is valid, it is subtracted from the user's balance. Three random slots are then selected and displayed. If all three slots match, the user wins ten times their bet, which is added to their balance. If the slots do not match, the user loses their bet.

When the user decides to quit, the loop breaks and the user's final balance is displayed.

## Usage

To run the script, you need to have Java installed on your computer. You can then compile the script using the Java compiler (`javac`), and run it using the Java interpreter (`java`):

```bash
javac SlotMachineSimulator.java
java SlotMachineSimulator
```

You will then be prompted to enter your bet. Enter a positive integer to place a bet, or 0 to quit the game.

---
