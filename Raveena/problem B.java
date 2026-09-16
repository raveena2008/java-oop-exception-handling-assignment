from abc import ABC, abstractmethod


# Abstract Base Class acting as the Payable Interface
class Payable(ABC):

  @abstractmethod
  def calculate_charge(self) -> float:
    pass


# Concrete class implementing the Payable interface
class StandardRental(Payable):

  def __init__(self, rental_days: int, daily_rate: float):
    self.rental_days = rental_days
    self.daily_rate = daily_rate

  # Implementation of the abstract method
  def calculate_charge(self) -> float:
    return self.rental_days * self.daily_rate


# Testing the implementation
rental = StandardRental(rental_days=5, daily_rate=45.00)
print(f"Total Charge: ${rental.calculate_charge():.2f}")
