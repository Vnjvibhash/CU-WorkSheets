# message = 'Happy 29th!'
# new_message = ''

# for char in message:
#     if not char.isdigit():
#         new_message = new_message + char
#     else:
#         new_message = new_message + str((int(char) + 1) % 10)

# print(new_message)

# def secret(s):
#     i = 0
#     result = ''
#     while s[i].isdigit():
#         result = result + s[i]
#         i = i + 1
#     return result


# # secret('123')
# # secret('123abc')
# # secret('abc')
# # secret('abc123')
# print(secret('123'))

# def get_keys(L, d):
#     '''(list, dict) -> list

#     Return a new list containing all the items in L that are keys in d.

#     >>> get_keys([1, 2, 'a'], {'a': 3, 1: 2, 4: 'w'})
#     [1, 'a']
#     '''
  
#     result = []
#     for k in L:
#        if k in d:
#           result.append(k)

#     return result
# print(get_keys([1, 2, 'a'], {'a': 3, 1: 2, 4: 'w'}))

# def count_values_that_are_keys(d):
#     '''(dict) -> int

#     Return the number of values in d that are also keys in d.
   
#     >>> count_values_that_are_keys({1: 2, 2: 3, 3: 3})
#     3
#     >>> count_values_that_are_keys({1: 1})
#     1
#     >>> count_values_that_are_keys({1: 2, 2: 3, 3: 0})
#     2
#     >>> count_values_that_are_keys({1: 2})
#     0
#     '''

#     result = 0
#     for k in d:
#         if  d[k] in d:
#             result = result + 1
#     return result


# print(count_values_that_are_keys({1: 2, 2: 3, 3: 0}))

# def double_last_value(L):
#     if len(L) >= 1:
#         L[-1]=L[-1]*2
#     '''(list of int) -> NoneType

#     Double the value at L[-1]. For example, if L[-1] is 3,
#     replace it with 6.

#     Precondition: len(L) >= 1.
#     '''
# L1 = [1, 3, 5]
# double_last_value(L1)
# print(L1[-1])

# def get_diagonal_and_non_diagonal(L):
#     '''(list of list of int) -> tuple of (list of int, list of int)
#     Return a tuple where the first item is a list of the values on the
#     diagonal of square nested list L and the second item is a list of the rest
#     of the values in L.
#     >>> get_diagonal_and_non_diagonal([[1,  3,  5], [2,  4,  5], [4,  0,  8]])
#     ([1, 4, 8], [3, 5, 2, 5, 4, 0])
#     '''

#     diagonal = []
#     non_diagonal = []
#     for row in range(len(L)):
#         for col in range(len(L)):
#             if row == col:
#                 diagonal.append(L[row][col])
#             else:
#                 non_diagonal.append(L[row][col])

#     return (diagonal, non_diagonal)


# print(get_diagonal_and_non_diagonal([[1,  3,  5], [2,  4,  5], [4,  0,  8]]))

# def get_diagonal_and_non_diagonal(L):
#     '''(list of list of int) -> tuple of (list of int, list of int)

#     # Return a tuple where the first item is a list of the values on the
#     # diagonal of square nested list L and the second item is a list of the rest
#     # of the values in L.

#     # >>> get_diagonal_and_non_diagonal([[1,  3,  5], [2,  4,  5], [4,  0,  8]])
#     # ([1, 4, 8], [3, 5, 2, 5, 4, 0])
#     # '''

#     diagonal = []
#     non_diagonal = []
#     for row in range(len(L)):
#         for col in range(len(L)):

#             if row == col:
#                 diagonal.append(L[row][col])
#             if row != col:
#                 non_diagonal.append(L[row][col])

#     return (diagonal, non_diagonal)
 

# print(get_diagonal_and_non_diagonal([[1,  3,  5], [2,  4,  5], [4,  0,  8]]))


# def count_chars(s):
#     '''(str) -> dict of {str: int}

#     # Return a dictionary where the keys are the characters in s and the values
#     # are how many times those characters appear in s.

#     # >>> count_chars('abracadabra')
#     # {'a': 5, 'r': 2, 'b': 2, 'c': 1, 'd': 1}
#     '''
#     d = {}

#     for c in s:
#         if not (c in d):
#             d[c] = 1
#         else:
#             d[c] = d[c] + 1

#     return d
# print(count_chars('abracadabra'))