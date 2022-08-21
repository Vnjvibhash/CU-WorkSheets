file1=open("filef1.txt","w")
L=["My name is Er.Richa Sharma \n",
"I am from Chandigarh \n",
"I have two kids Amayra and Adhvik"]
file1.write("My Family Supprt: My Husband")
file1.writelines(L)
file1.close()

file1=open("filef1.txt","r")
print("the output of read()")
print(file1.read(2))
file1.close()