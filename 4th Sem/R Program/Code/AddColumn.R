library(readxl)
df <- read.csv("E:/Personal/CodeWithVnj/R Program/Friends_Data.csv")
print(df)
#Add Column
df$Marks<-c(100,99,98)
print(df)
