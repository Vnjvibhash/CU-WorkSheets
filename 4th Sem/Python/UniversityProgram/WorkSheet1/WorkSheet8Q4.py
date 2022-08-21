def selectionSort(array):
  n = len(array)
  for i in range(n):
    minimum = i
    for j in range(i+1, n):
      if (array[j] < array[minimum]):
        minimum = j
    temp = array[i]
    array[i] = array[minimum]
    array[minimum] = temp
  return array


list1 = []
n = int(input('Enter the Size of the List: '))
for i in range(0, n):
    ele = int(input())
    list1.append(ele)
print("The Given Unsorted list is: ", list1)
print("The Sorted list is: ", selectionSort(list1))
