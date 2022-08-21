# class Rectangle():
#     length = 10
#     breadth = 8

# R1 = Rectangle()
# print(R1.length)
# print(R1.breadth)
# print("Area of the Ractangle is: ",R1.length*R1.breadth)


# class MyClass:
#     def __init__(vnj, name, age, dept):
#         vnj.name = name
#         vnj._age = age
#         vnj.__dept = dept

#     def __display(self):
#         print("Name: ", self.name)
#         print("Age: ", self._age)
#         print("Department: ", self.__dept)

#     def _display2(self):
#         self.__display()
#         print("------------------")
#         print("Name: ", self.name)
#         print("Age: ", self._age)
#         print("Department: ", self.__dept)

#     def display3(self):
#         self._display2()
#         print("------------------")
#         print("Name: ", self.name)
#         print("Age: ", self._age)
#         print("Department: ", self.__dept)


# myClass=MyClass("Vivek","22","Computer Science and Engineeringh")
# myClass.display3()
# print("---x---x---x---x---x---")
# myClass._display2()
# print(myClass.name)
# print("---x---x---x---x---x---")
# myClass.__display()


class input_data:
    a=0
    b=0
    c=0
    def __init__(self,x,y,z):
        self.a=x
        self.b=y
        self.c=z
    def display(self):
        print(self.a)
        print(self.b)
        print(self.c)

obj=input_data(3,4,5)
obj.display()