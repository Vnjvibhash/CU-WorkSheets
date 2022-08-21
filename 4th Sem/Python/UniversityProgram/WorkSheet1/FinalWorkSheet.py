# Parameterized Function
def tableParameterized(num):
    # For range 2 to 20 according to the question
    for i in range(2,20+1):
        print(num,' x ', i, ' = ',num*i)

#Simple Function
def tableSimple():
    # For range 2 to 20 according to the question
    for i in range(2,20+1):
        print(2,' x ', i, ' = ',2*i)

#return Type Function
def multiply(n,i):
    return n*i

#Simple Function Call
print('Table of 2 Simple Function Call')
tableSimple()

num = int(input('Enter the Number: '))
# Parameterized Function call
print('Parameterized Function call')
tableParameterized(num)

# Return Type Function call
print('Return Type Function call')
for i in range(2,20+1):
        print(num,' x ', i, ' = ',multiply(num,i))
