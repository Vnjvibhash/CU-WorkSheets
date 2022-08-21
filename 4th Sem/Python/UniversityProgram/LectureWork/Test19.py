from collections import Counter
my_dict = {'a': 3, 'b': 4, 'c': 6, 'd': 5, 'e': 21, 'f':99, 'g':40}
k = Counter(my_dict)
high = k.most_common(3)
print("Dictionary with 3 highest values:")
print("Keys: Values")
for i in high:
    print(i[0],":",i[1])