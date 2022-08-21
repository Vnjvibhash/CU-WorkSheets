# static Tuple
my_tuple = (('Mon',10),('Tue',8),('Wed',8),('Thu',5))

print("Given tuple: ",my_tuple)
inputype=input('Do you want to search string (y/n): ')
if inputype=='y':
    key=input('Enter the Element want to search: ')
else:
    key=int(input('Enter the Element want to search: '))
    
if any(key in i for i in my_tuple):
   print("present")
else:
   print("Not present")
