list_item = []
sum=0
n = int(input("Enter number of elements : "))
for i in range(0, n):
    ele = int(input("Enter {}th of elements: ".format(i)))
    list_item.append(ele)

for i in list_item:
    sum+=i
    
average=sum/len(list_item)
print("Average of list =" ,average)
print("Sum of list element = ",sum)