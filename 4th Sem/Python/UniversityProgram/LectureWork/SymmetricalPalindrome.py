# Symmetrical Function
def symm(string): 
  l = len(string) 
  flag = 0
  if l%2 == 0: 
    mid = l//2
  else: 
    mid = l//2 + 1
    
  s1 = 0
  s2 = mid
  while(s1 < mid and s2 < l): 
    if (string[s1] == string[s2]):
      s1 = s1 + 1
      s2 = s2 + 1
    else: 
      flag = 1
      break

  if flag == 0: 
    print("The entered string is symmetrical")
  else: 
    print("The entered string is not symmetrical")

# Palindrome Function
def palin(string): 
  st = 0
  end = len(string)-1
  f = 0
  while(st<end): 
    if (string[st]== string[end]): 
      st += 1
      end -= 1
    else: 
      f = 1
      break

  if f == 0: 
    print("The entered string is palindrome") 
  else: 
    print("The entered string is not palindrome") 
    
# Main code 
string = input("Enter the string: ")
palin(string) 
symm(string)