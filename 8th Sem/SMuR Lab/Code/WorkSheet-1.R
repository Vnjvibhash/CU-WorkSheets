a <- c(1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 6)

result.mean <- mean(a)
print(result.mean)

result.median<-median(a)
print(result.median)

find_mode <- function(x) {
  u <- unique(x)
  tab <- tabulate(match(x, u))
  u[tab == max(tab)]
}
result.mode<-find_mode(a)
print(result.mode)

hist(a, main = "Histogram of Data", xlab = "Values", col = "lightblue", border = "black")
abline(v = result.mean, col = "red", lwd = 2)
abline(v = result.median, col = "blue", lwd = 2)
abline(v = result.mode, col = "green", lwd = 2)
legend("topright", legend = c("Mean", "Median", "Mode"), col = c("red", "blue", "green"), lwd = 2)
