def last(n):
    return n[-1]  
 
def sort(tuples):
    return sorted(tuples, key=last)

list_tup = []
item=[]
n = int(input("Enter number of elements : "))
for i in range(0, n):
    print("Enter {}th of Tuples 2 elements: ".format(i+1))
    for j in range(0,2):
        ele = int(input())
        item.append(ele)
    list_tup.append(tuple(item))
    item=[]
print("Sorted:")
print(sort(list_tup))