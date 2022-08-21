def swapList(sl,pos1,pos2):      
    sl[pos1], sl[pos2] = sl[pos2], sl[pos1]  
    return sl
      
list_item = []
n = int(input("Enter number of elements : "))
for i in range(0, n):
    ele = int(input("Enter {}th of elements: ".format(i)))
    list_item.append(ele)

pos1=int(input('Enter the 1st position: '))
pos2=int(input('Enter the 2nd position: '))
print('Given List is: ',list_item)
print("Swapped List: ",swapList(list_item,pos1-1,pos2-1))
