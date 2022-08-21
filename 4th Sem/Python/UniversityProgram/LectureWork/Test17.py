list_item = []
list_even = []
list_odd = []
even_Sum = 0
odd_Sum = 0

n = int(input("Enter number of elements : "))
for i in range(1, n + 1):
    ele = int(input("Enter {}th of elements: ".format(i)))
    list_item.append(ele)

for j in range(n):
    if(list_item[j] % 2 == 0):
        list_even.append(list_item[j])
        even_Sum = even_Sum + list_item[j]
    else:
        list_odd.append(list_item[j])
        odd_Sum = odd_Sum + list_item[j]

print("\nThe Even Numbers in this List =  ", list_even)
print("The Sum of Even Numbers in this List =  ", even_Sum)
print("\nThe Odsd Numbers in this List =  ", list_odd)
print("The Sum of Odd Numbers in this List =  ", odd_Sum)