d1 = {'a': 100, 'b': 200, 'c': 300}
d2 = {'a': 300, 'b': 200, 'd': 400}
print('Given Dictionary 1: ',d1)
print('Given Dictionary 2: ',d2)
for i in d2 :
    if i in d1 :
        d1[i] = d1[i] + d2[i]
    else :
        d1[i] = d2[i]
print('Afterd Adding Same key Value: ',d1)
