# WAP to demonstrate how parent constructors are called
class Person:
    def __init__(self, name, idnumber):
        self.name = name
        self.idnumber = idnumber
    def display1(self):
        print(self.name)
        print(self.idnumber)

# Child class
class Employee(Person):
    def __init__(self, name, idnumber, salary, post):
        self.salary = salary
        self.post = post
        # invoking the __init__of the Parent class
        Person.__init__(self, name, idnumber)

    def display(self):
        print(self.salary)
        print(self.post)


P = Employee('Ajay Kumar', 211008,100000,"Manager")  # created an object variable of an instance
P.display1()  # called the function
P.display()  # called the function
