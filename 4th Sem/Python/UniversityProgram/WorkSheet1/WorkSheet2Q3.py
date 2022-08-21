num1 = int(input("Enter the 1st Number:"))
num2 = int(input("Enter the 2nd Number:"))
num3 = int(input("Enter the 3rd Number:"))

if (num1 >= num2) and (num1 >= num3):
   largest = num1
elif (num2 >= num1) and (num2 >= num3):
   largest = num2
else:
   largest = num3

print("The largest number is ", largest)
