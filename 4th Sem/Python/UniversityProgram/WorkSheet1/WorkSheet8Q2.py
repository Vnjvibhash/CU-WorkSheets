def bubble_sort(list1,n):
    for i in range(0,n-1):
        for j in range(n-1):  
            if(list1[j]>list1[j+1]):  
                temp = list1[j]  
                list1[j] = list1[j+1]  
                list1[j+1] = temp  
    return list1  
  
list1 = []
n = int(input('Enter the Size of the List: '))
for i in range(0, n):
    ele = int(input())
    list1.append(ele)
print("The Given Unsorted list is: ", list1)
print("The Sorted list is: ", bubble_sort(list1,n))
