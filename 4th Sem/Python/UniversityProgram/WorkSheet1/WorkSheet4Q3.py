def inglify(string):
  if len(string) < 3:
    return string
  elif string.endswith('ing'):
    return string + 'ly'
  else:
    return string + 'ing' 

string = input("Enter The String: ")
print(inglify(string))