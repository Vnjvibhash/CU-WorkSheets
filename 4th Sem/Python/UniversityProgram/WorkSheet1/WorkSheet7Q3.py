def mutiple_tuple(nums):
    temp = list(nums)
    product = 1 
    for x in temp:
        product *= x
    return product

item=[]
n = int(input("Enter number of elements : "))
for i in range(0, n):
    print("Enter {}th elements of Tuples: ".format(i))
    ele = int(input())
    item.append(ele)
nums=tuple(item)
print ("Original Tuple: ")
print(nums)
print("Product - multiplying all the numbers of the given tuple:",mutiple_tuple(nums))
