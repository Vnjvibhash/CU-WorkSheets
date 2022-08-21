def add_string(str1): 
        length = len(str1) 
        if length > 2: 
                if str1[-3:] == 'ing':
                    str1 += 'ly' 
        else: 
                str1 += 'ing' 
        return str1 

#string less than 3 = remain unchanged 
print('String less than 3 - UNCHANGED:')
print(add_string('ab'))
print('\nAdd ing at last - + ing:') 
print(add_string('abc')) 
print('\nalready ending with ing - + ly:') 
print(add_string('string'))