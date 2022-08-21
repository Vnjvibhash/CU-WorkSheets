class Person:
    def __init__(self, f_name, l_name):
        self.f_name = f_name
        self.l_name = l_name

    def display(self):
        print("Name is {0} {1}".format(self.f_name, self.l_name))

first_name = input("Enter first name: ")
last_name = input("Enter last name: ")
obj = Person(first_name, last_name)
obj.display()
