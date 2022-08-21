# Pi value initialization globally
pi=22/7
def areacir(n):
    ar = pi*(n**2)
    return ar
# Simple Function
def area7():
    a = float(input('Enter Radious 7: '))
    ar7 = pi*(a**2)
    print("Area 7 = ",ar7,"cm^2")
# Return Type with function
def area8():
    b = float(input('Enter Radious 8: '))
    ar8 = pi*(b**2)
    return ar8
# Parameterized Function
def area9(c):
    ar9 = pi*(c**2)
    print("Area 9 = ",ar9,"cm^2")
# Return type with parameterized Functions
def area10(d):
    ar10 = pi*(d**2)
    return ar10
#main function
def circle():
    print('Area of 10 circle is as follows: ')
    for i in range(1,7):
        n = float(input('Enter Radious {}: '.format(i)))
        area = areacir(n)
        print("Area {0} = {1} cm^2".format(i,area))
    # Simple Function call
    area7()
    # Return Type with function call
    ar8 = area8()
    print("Area 8 = ",ar8,"cm^2")
    # Parameterized Function call
    c = float(input('Enter Radious 9: '))
    area9(c)
    # Return type with parameterized Functions call
    d = float(input('Enter Radious 10: '))
    ar10 = area10(d)
    print("Area 10 = ",ar10,"cm^2")
#main function call
circle()

