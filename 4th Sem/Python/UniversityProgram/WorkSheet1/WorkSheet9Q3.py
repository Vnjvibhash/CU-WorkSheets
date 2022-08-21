class Rectangle():
    def __init__(self, a, b):
        self.length = a
        self.breadth = b

    def rectangle_area(self):
        return self.length*self.breadth


length = int(input('Enter the Length: '))
breadth=int(input('Enter the Breadth: '))
newRectangle = Rectangle(length,breadth)
area = newRectangle.rectangle_area()
print("Area of Ractangle is: ", area)
