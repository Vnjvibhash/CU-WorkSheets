initial = int(input("Please Enter the Initial Value : "))
final = int(input("Please Enter the Final Value : "))
total = 0

for number in range(initial, final+1):
    total = total + number

print("The Sum of Even Numbers from {0} to {1} = {2}".format(initial, number, total))