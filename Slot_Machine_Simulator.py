def pull_lever(self):
        if self.balance >= 10:
            self.balance -= 10
            return self.spin()
        else:
            return "Insufficient balance. Please deposit more."