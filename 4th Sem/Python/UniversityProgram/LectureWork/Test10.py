def createTable(n):
    for i in range(1,10+1):
        # print("{0} X {1} = {2}".format(n, i, n*i))
        print(n,"X",i,"=",n*i)

n = int(input("Please Enter the Number : "))
createTable(n)