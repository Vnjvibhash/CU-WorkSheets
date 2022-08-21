# class pair:
#     def twoSum(self, nums, target):
#         lookup = {}
#         for i, num in enumerate(nums):
#             if target - num in lookup:
#                 return (lookup[target - num], i)
#             lookup[num] = i


# print("index1=%d, index2=%d" % pair().twoSum((30, 60, 80, 90, 20, 60, 40), 90))

def search(a, b):
    for d in b:
        if a == d:
            m = True
            break
        else:
            m = False
    return m

list1 = []
n = int(input('Enter the Size of the List: '))
for i in range(0, n):
    ele = int(input())
    list1.append(ele)

target = int(input("Enter the target: "))
for i in list1:
    if i < target:
        pair = int(target)-int(i)
        in2 = search(pair, list1)
        if in2 == True:
            print("the first number= %d the second number %d" % (i, pair))
            break

