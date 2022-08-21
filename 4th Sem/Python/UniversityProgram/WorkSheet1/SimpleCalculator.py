def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    return x / y

def modulus(x, y):
    return x % y

def exponent(x, y):
    return x ** y

while True:
    print("Select operation.")
    print("1.Add")
    print("2.Subtract")
    print("3.Multiply")
    print("4.Divide")
    print("5.Modulus")
    print("4.Exponent")
    choice = input("Enter choice(1/2/3/4/5/6): ")
    if choice in ('1', '2', '3', '4', '5', '6'):
        num1 = int(input("Enter 1st Number: "))
        num2 = int(input("Enter 2nd Number: "))

        if choice == '1':
            print(num1, "+", num2, "=", add(num1, num2))

        elif choice == '2':
            print(num1, "-", num2, "=", subtract(num1, num2))

        elif choice == '3':
            print(num1, "*", num2, "=", multiply(num1, num2))

        elif choice == '4':
            print(num1, "/", num2, "= %.2f" %divide(num1, num2))

        elif choice == '5':
            print(num1, "%", num2, "=", modulus(num1, num2))

        elif choice == '6':
            print(num1, "**", num2, "=", exponent(num1, num2))
        
        next_calculation = input("You want to do next calculation? (yes/no): ")
        if next_calculation == "no":
          break
    
    else:
        print("Invalid Input")
        break