def fibonacci (n):
    if n<= 0:
        return "Incorrect Output"
    data = [0, 1]
    if n > 2:
        for i in range (2, n):
            data.append(data[i-1] + data[i-2])
    return data[n-1]

num = int(input("Enter the Number:"))
n1 = 0
n2 = 1
print("Fibonacci Series:", n1, n2, end=" ")
for i in range(2, num):
    n3 = n1 + n2
    n1 = n2
    n2 = n3
    print(n3, end=" ")

print()