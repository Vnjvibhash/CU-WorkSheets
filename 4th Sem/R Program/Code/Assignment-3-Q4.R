data <- data.frame(year=c(1960:2019),values1=runif(60,-1,1)*10+1:60)
attach(data)
plot(x = year, y = values1, type='l')
points(x = year, y = values1)