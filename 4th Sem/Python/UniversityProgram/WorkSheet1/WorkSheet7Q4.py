def tuple_int_converter(tuple_str):
    int_item=[]
    for x in tuple_str:
        int_item.append(int(x))
    result=tuple(int_item)
    return result
     
item=[]
n = int(input("Enter number of elements : "))
for i in range(0, n):
    print("Enter {}th elements of Tuples: ".format(i))
    ele = str(input())
    item.append(ele)
tuple_str=tuple(item)
print("\nOriginal tuple with  String values:")
print(tuple_str)
print("\nNew tuple with integer values:")
print(tuple_int_converter(tuple_str))