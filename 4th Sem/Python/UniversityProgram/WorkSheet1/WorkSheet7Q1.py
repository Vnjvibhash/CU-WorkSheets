list_tup = []
item=[]
n = int(input("Enter number of Size of List: "))
for i in range(0, n):
    print("Enter {}th tuple in list.".format(i+1))
    tn = int(input('Enter the Tuple Size: '))
    for j in range(0,tn):
        ele = int(input())
        item.append(ele)
    list_tup.append(tuple(item))
    item=[]
print('Given List of Tuples are: ',list_tup)
replacement=int(input('Enter the number for last tuple item: '))
print('Last item Replaced list of Tuples are: ',[t[:-1] + (replacement,) for t in list_tup])