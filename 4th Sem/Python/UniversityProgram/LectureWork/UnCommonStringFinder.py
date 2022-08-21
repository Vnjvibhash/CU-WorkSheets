# Hashing method
def hash_uncommon(s1, s2):
    count = {}
    for word in s1.split():
        count[word] = count.get(word, 0) + 1
    # words of string s2
    for word in s2.split():
        count[word] = count.get(word, 0) + 1
    # return required list of words
    return [word for word in count if count[word] == 1]

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

# Using symmetric_difference() method
def default_fun_uncommon(s1,s2):
  s1=s1.split()
  s2=s2.split()
  k=set(s1).symmetric_difference(set(s2))
  return k

s1=str(input('Enter 1st String: '))
s2=str(input('Enter 2nd String: '))
  
# Print required answer
print(hash_uncommon(s1, s2))
print(iterate_uncommon(s1,s2))
print(list(default_fun_uncommon(s1,s2)))