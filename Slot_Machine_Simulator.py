```python
import random

class SlotMachine:
    def __init__(self):
        self.balance = 0

    def deposit(self, amount):
        self.balance += amount

    def pull_lever(self):
        if self.balance >= 10:
            self.balance -= 10
            return self.spin()
        else:
            return "Insufficient balance. Please deposit more."

    def spin(self):
        results = [random.choice(['Cherry', 'Lemon', 'Orange', 'Plum', 'Bell', 'Bar', '7']) for _ in range(3)]
        if len(set(results)) == 1:
            self.balance += 50
            return results, "Congratulations! You won 50 coins!"
        else:
            return results, "Sorry, you didn't win this time."

    def get_balance(self):
        return self.balance

def main():
    machine = SlotMachine()
    while True:
        print("1. Deposit money")
        print("2. Pull lever")
        print("3. Check balance")
        print("4. Quit")
        choice = input("Choose an option: ")
        if choice == '1':
            amount = int(input("Enter deposit amount: "))
            machine.deposit(amount)
        elif choice == '2':
            print(machine.pull_lever())
        elif choice == '3':
            print("Your balance is", machine.get_balance())
        elif choice == '4':
            break

if __name__ == "__main__":
    main()
```