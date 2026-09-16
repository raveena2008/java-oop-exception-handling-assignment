class Rental:
    def __init__(self, customer_name: str, days: int):
        self.customer_name = customer_name
        self.days = days

    def display(self):
        print(f"Customer Name: {self.customer_name}")
        print(f"Rental Duration: {self.days} day(s)")


class LuxuryRental(Rental):
    def __init__(self, customer_name: str, days: int, chauffeur_included: bool):
        # Call the constructor of the base class (Rental)
        super().__init__(customer_name, days)
        self.chauffeur_included = chauffeur_included

    def display(self):
        # Call base class display method to print common attributes
        super().display()
        chauffeur_status = "Yes" if self.chauffeur_included else "No"
        print(f"Chauffeur Included: {chauffeur_status}")


# Example Usage
if __name__ == "__main__":
    print("--- Standard Rental ---")
    standard_car = Rental(customer_name="Alice", days=3)
    standard_car.display()

    print("\n--- Luxury Rental ---")
    luxury_car = LuxuryRental(customer_name="Bob", days=5, chauffeur_included=True)
    luxury_car.display()
