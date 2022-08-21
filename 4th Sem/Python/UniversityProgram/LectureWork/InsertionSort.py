def insertion_sort(list):
    for index in range(1, len(list)):
        a = list[index]
        i = index
        while i > 0 and list[i - 1] > a:
            list[i] = list[i - 1]
            i = i - 1

        list[i] = a
    return list


list1 = []
n = int(input('Enter the Size of the List: '))
for i in range(0, n):
    ele = int(input())
    list1.append(ele)
print("The Given Unsorted list is: ", list1)
print("The Sorted list is: ", insertion_sort(list1))
