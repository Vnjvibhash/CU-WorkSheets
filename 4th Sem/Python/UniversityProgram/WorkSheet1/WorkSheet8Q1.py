def linear_Search(list1, n, key):  
    for i in range(0, n):  
        if (list1[i] == key):  
            return i  
    return -1 
    
list1 = []  
n = int(input('Enter the Size of the List: '))
for i in range(0,n):
    ele=int(input())
    list1.append(ele)

key = int(input('Enter the Key to be Searched: '))
res = linear_Search(list1, n, key)  
if(res == -1):  
    print("Element {} not found in the list".format(key))
else:  
    print("Element {} found at index position {}: ".format(key,res))
    