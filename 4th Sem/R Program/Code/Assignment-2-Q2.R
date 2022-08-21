name=c("Vivek","Abhi","Amar","Ruh")
qlfy=c("BE","BCA","BE","B.Tech")
age=c(23,20,21,22)
address=c("Ashreya Layout","Marathahalli","Kadugodi","Kadugodi")
df=data.frame("Name"=name,
              "Qualification"=qlfy,
              "Age"=age,
              "Address"=address
              )
print(df)

data.frame(df$Name)

print(df[1:2])
