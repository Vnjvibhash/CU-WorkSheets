# Sample dataset
data <- c(23, 45, 67, 12, 89, 45, 23, 67, 34, 56)

# Measures of dispersion
range_value <- range(data)
quartiles <- quantile(data)
variance_value <- var(data)
sd_value <- sd(data)

# Plotting
par(mfrow = c(2, 2))  # Setting up a 2x2 grid for subplots

# Range
boxplot(data, main = "Boxplot - Range", col = "lightblue")
text(1, range_value[2], paste("Max:", round(range_value[2], 2)), pos = 4)
text(1, max(data) + 5, paste("Range: ", round(diff(range_value), 2)), col = "red")

# Quartile Deviation
boxplot(data, main = "Boxplot - Quartiles", col = "lightgreen")
text(1, quartiles[4], paste("Q3:", round(quartiles[4], 2)), pos = 4)
text(1, quartiles[2], paste("Q1:", round(quartiles[2], 2)), pos = 4)
qdev_value <- (quartiles[4] - quartiles[2]) / 2
text(1, max(data) + 10, paste("Quartile Deviation: ", round(qdev_value, 2)), col = "blue")

# Standard Deviation
hist(data, main = "Histogram - Standard Deviation", col = "pink")
abline(v = mean(data), col = "red", lty = 2, lwd = 2)
text(15, 12, paste("Mean:", round(mean(data), 2)), col = "red")
text(1, max(data) + 15, paste("Standard Deviation: ", round(sd_value, 2)), col = "green")

# Variance
boxplot(data, main = "Boxplot - Variance", col = "lightyellow")
text(1, variance_value, paste("Variance:", round(variance_value, 2)), pos = 4)
text(1, max(data) + 20, paste("Variance: ", round(variance_value, 2)), col = "purple")
