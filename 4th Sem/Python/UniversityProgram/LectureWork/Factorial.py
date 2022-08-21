n = int(input("Please Enter the Number: "))
fact = 1
for i in range(1,n+1):
    fact = fact * i 
print ("The factorial of {0} is : ".format(n))
print (fact)