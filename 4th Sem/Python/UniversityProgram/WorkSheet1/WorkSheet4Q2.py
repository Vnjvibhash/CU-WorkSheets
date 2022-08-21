# Iterative method
def iterate_uncommon(s1,s2):
    list_s1 = s1.split()
    list_s2 = s2.split()
    uc_words = ""
    for i in list_s1:
        if i not in list_s2:
            uc_words =  uc_words+" "+i
    for j in list_s2:
        if j not in list_s1:
             uc_words =  uc_words+" "+j
    return  uc_words
  
s1=str(input('Enter 1st String: '))
s2=str(input('Enter 2nd String: '))
  
# Print required answer
print(iterate_uncommon(s1,s2))