class Car():
    def __init__(self, name = "BMW", kind = "830i", color = "Blue", value = 4000000):
        self.name = name
        self.kind = kind
        self.color = color
        self.value = value
    
    def printModel(self):
        print(f"Model: {self.name} {self.kind}\nColor: {self.color}\nPrice: {self.value}\n")

def main():
    car1 = Car()
    print(vars(car1))

    car2 = Car("Audi", "RS", "Red", 40000)
    print(vars(car2))

    car3 = Car(color = "Red")
 
    car1.printModel()
    car2.printModel()
    car3.printModel()

    print(car3.__dict__)
    car3.kind = "M5"
    car3.printModel()

if __name__ == "__main__": 
    main()
