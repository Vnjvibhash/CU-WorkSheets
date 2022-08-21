# Load data
data("mtcars")

# Question 1
hist(mtcars$mpg,col="red")
ggplot(mtcars, aes(x = mpg)) + geom_histogram(binwidth = 1, fill = "red")


# Question 2
hist(mtcars$mpg, breaks = 10)
ggplot(mtcars, aes(x = mpg)) + geom_histogram(bins=10, color = "black", fill="Red")

# BONUS
hist(mtcars$mpg, breaks = 10, xlim=c(0,40), col="red")
