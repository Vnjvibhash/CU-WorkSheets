# WAP to demonstrate the working of multiple inheritance
class GrandFather:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display1(self):
        print("GrandFather's Name: ", self.name)
        print("GrandFather's age: ", self.age)

class GrandMother:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display2(self):
        print("GrandMother's Name: ", self.name)
        print("GrandMother's age: ", self.age)

class Father:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display3(self):
        print("Father's Name: ", self.name)
        print("Father's age: ", self.age)

class Mother:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display4(self):
        print("Mother's Name: ", self.name)
        print("Mother's age: ", self.age)

# Child class


class Child(GrandFather,GrandMother,Father,Mother):
    def __init__(self, gf_name, gf_age, gm_name, gm_age, f_name, f_age, m_name, m_age):
        # invoking the __init__of the Parent class
        GrandFather.__init__(self, gf_name, gf_age)
        GrandMother.__init__(self, gm_name, gm_age)
        Father.__init__(self, f_name, f_age)
        Mother.__init__(self, m_name, m_age)


obj=Child('Abhi',84,'Ruh',80,'Amar',50,'Chandra',45)
obj.display1()
obj.display2()
obj.display3()
obj.display4()
