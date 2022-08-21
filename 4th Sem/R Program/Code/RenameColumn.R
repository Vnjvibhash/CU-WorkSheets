library(readxl)
df <- read.csv("E:/Personal/CodeWithVnj/R Program/Friends_Data.csv")
print(df)
#Rename Column
colnames(df)[which(names(df)=="Marks")]="Math_Marks"
print(df)