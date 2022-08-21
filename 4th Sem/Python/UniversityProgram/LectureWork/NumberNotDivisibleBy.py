n = 1
max_num = 100
sum = 0
print("Sum of the Numbers between 1 to 100 which is not divisible by 2, 4 and 7 is ",end='')
while n <= max_num:
    if n % 2 != 0 and n % 4 != 0 and n % 7 != 0:
        sum+=n
    n = n+1
print(sum)