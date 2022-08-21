# Parameterized Function
def table(num):
    # For range 2 to 20 according to the question
    for i in range(2,20+1):
        print(num,' x ', i, ' = ',num*i)

num = int(input('Enter the Number: '))
# Parameterized Function call
table(num)