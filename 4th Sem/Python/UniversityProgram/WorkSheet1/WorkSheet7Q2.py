def removet(li):
    li=[ num for num in li if num]
    return li
    
# Static list of tuples
li=[ (), ('Studytonight', '1', '2'), (), ('3', '4', '5', '6') ]
print('Given list of Tuples are: ',li)
print('After Removing Empty Tuples: ',removet(li))
