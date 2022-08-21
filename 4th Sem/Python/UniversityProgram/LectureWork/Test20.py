def binary_search(list1, low, high, key):
   if low <= high:
      mid = (low + high) // 2
      if list1[mid] == key:
         return mid
      elif list1[mid] > key:
         return binary_search(list1, low, mid - 1, key)
      else:
         return binary_search(list1, mid + 1, high, key)
   else:
      return -1


list1 = []
n = int(input('Enter the Size of the List: '))
for i in range(0, n):
    ele = int(input())
    list1.append(ele)

key = int(input('Enter the Key to be Searched: '))
res = binary_search(list1,0, n-1, key)
if(res == -1):
    print("Element {} not found in the list".format(key))
else:
    print("Element {} found at index position {}: ".format(key, res))
