class Student:
    def __init__(self, school, name):
        self.school = school
        self.name = name

    def changeSchool(self, school):
        self.school = school


student1 = Student("Amiedu", "Jaska Jokunen")
print(student1.name)
student1.changeSchool("Joku")
print(student1.school)
print(student1.name)
print(Student)