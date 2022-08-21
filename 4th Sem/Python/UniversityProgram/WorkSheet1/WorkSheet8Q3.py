def binary_search(list1, key):
    low = 0
    high = len(list1) - 1
    mid = 0
    while low <= high:
        mid = (high + low) // 2
        if list1[mid] < key:
            low = mid + 1
        elif list1[mid] > key:
            high = mid - 1
        else:
            return mid
    return -1

list1 = []
n = int(input('Enter the Size of the List: '))
for i in range(0, n):
    ele = int(input())
    list1.append(ele)

key = int(input('Enter the Key to be Searched: '))
res = binary_search(list1, key)
if(res == -1):
    print("Element {} not found in the list".format(key))
else:
    print("Element {} found at index position {}: ".format(key, res))

