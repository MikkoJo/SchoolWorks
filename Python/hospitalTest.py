class Hospital:
    def __init__(self, name, date_built, number_of_beds, city, university):
        self.name = name
        self.date_built = date_built
        self.number_of_beds = number_of_beds
        self.city = city
        self.university = university

    def about(self):
        print("Normal hospital")

class UniversityHospital(Hospital):
    def __init__(self, name, date_built, number_of_beds, city):
        super(UniversityHospital, self).__init__(name, date_built, number_of_beds, city, True)

    def about(self):
        print("University hospital")

def main():
    hospital1 = Hospital("Meikku", 1956, 567, "Helsinki", True)
    print(vars(hospital1))

    hospital2 = UniversityHospital("Turku", 1956, 567, "Helsinki")
    print(vars(hospital2))

    hospital1.about()
    hospital2.about()

if __name__ == "__main__": 
    main()
