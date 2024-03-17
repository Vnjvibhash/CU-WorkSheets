data <- c(23, 45, 67, 12, 89, 45, 23, 67, 34, 56)

range_value <- range(data)
qdev_value <- IQR(data) / 2
sd_value <- sd(data)
variance_value <- var(data)

boxplot(data, main = "Boxplot of Range", ylab = "Value")
hist(data, main = "Histogram of Data", xlab = "Value", col = "lightblue")
plot(density(data), main = "Density Plot", xlab = "Value", col = "darkblue")
plot(data, main = "Scatterplot of Data", xlab = "Index", ylab = "Value", col = "blue", pch = 16)

