list_item = []
n = int(input("Enter number of elements : "))
for i in range(0, n):
    ele = int(input("Enter {}th of elements: ".format(i)))
    list_item.append(ele)
print("The Smallest Element in this List is : ", min(list_item))
print("The Largest Element in this List is : ", max(list_item))