# #As per the given Exasmple
# color = ['Red', 'Green', 'White', 'Black', 'Pink', 'Yellow']
# print('Sample List: ',color)
# new_color=[]
# for i in range(len(color)):
#     if i not in (0,4,5):
#         new_color.append(color[i])
# print('Expected Output: ',new_color)

#Program with Dynamic value
list_items=[]
new_list=[]
n = int(input("Enter number of elements you want in List: "))
for i in range(0, n):
    ele = input("Enter {}th of elements: ".format(i))
    list_items.append(ele)
rn=int(input("Enter How many items you want to remove from List: "))
item=[]
if n>=rn:
    for j in range(rn):
        ele = int(input('Enter The Item Index Value: '))
        item.append(ele)
    item=tuple(item)
    print('Given List: ',list_items)
    for i in range(len(list_items)):
        if i not in item:
            new_list.append(list_items[i])
    print('Expected Output: ',new_list)
else:
    print('Invalid Input')

