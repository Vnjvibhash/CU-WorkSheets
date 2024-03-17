library(ggplot2)
library(gridExtra)

bernoulli_data <- rbinom(n = 1000, size = 1, prob = 0.3)
binomial_data <- rbinom(n = 1000, size = 10, prob = 0.5)
poisson_data <- rpois(n = 1000, lambda = 3)

plot1 <- ggplot(data.frame(x = bernoulli_data), aes(x = x, fill = factor(x))) +
  geom_bar(stat = "count", width = 0.5) +
  labs(title = "Bernoulli Distribution", x = "Outcome (Success/Failure)", y = "Frequency") +
  scale_fill_manual(values = c("0" = "blue", "1" = "red"))

plot2 <- ggplot(data.frame(x = binomial_data), aes(x = x, fill = factor(x))) +
  geom_bar(stat = "count", width = 0.5) +
  labs(title = "Binomial Distribution", x = "Number of Successes", y = "Frequency") +
  scale_fill_brewer(palette = "Set1")

plot3 <- ggplot(data.frame(x = poisson_data), aes(x = x, fill = factor(x))) +
  geom_bar(stat = "count", width = 0.5) +
  labs(title = "Poisson Distribution", x = "Number of Events", y = "Frequency") +
  scale_fill_brewer(palette = "Set3")

# Arrange plots on a single page
grid.arrange(plot1, plot2, plot3, ncol = 3)
