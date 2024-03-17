library(ggplot2)
library(patchwork)

set.seed(123)
n <- 10000
uniform_data <- runif(n)
exponential_data <- rexp(n, rate = 1)
normal_data <- rnorm(n)

uniform_plot <- ggplot(data.frame(x = uniform_data), aes(x = x)) +
  geom_density(fill = "blue", alpha = 0.5) +
  ggtitle("Uniform Distribution")

exponential_plot <- ggplot(data.frame(x = exponential_data), aes(x = x)) +
  geom_density(fill = "green", alpha = 0.5) +
  ggtitle("Exponential Distribution")

normal_plot <- ggplot(data.frame(x = normal_data), aes(x = x)) +
  geom_density(fill = "red", alpha = 0.5) +
  ggtitle("Normal Distribution") +
  stat_function(fun = dnorm, args = list(mean = mean(normal_data), sd = sd(normal_data)), color = "blue", size = 1) +
  annotate("text", x = 0, y = 0.35, label = "Area under curve", color = "blue") +
  annotate("text", x = 0, y = 0.3, label = "represents probability", color = "blue") +
  annotate("text", x = 2, y = 0.1, label = "68%", color = "blue") +
  annotate("text", x = -2, y = 0.1, label = "68%", color = "blue") +
  annotate("text", x = 2.5, y = 0.02, label = "95%", color = "blue") +
  annotate("text", x = -2.5, y = 0.02, label = "95%", color = "blue") +
  annotate("text", x = 3, y = 0.002, label = "99.7%", color = "blue") +
  annotate("text", x = -3, y = 0.002, label = "99.7%", color = "blue") +
  annotate("rect", xmin = -1, xmax = 1, ymin = 0, ymax = dnorm(0), fill = "yellow", alpha = 0.3) +
  annotate("rect", xmin = -2, xmax = 2, ymin = 0, ymax = dnorm(0), fill = "yellow", alpha = 0.3) +
  annotate("rect", xmin = -3, xmax = 3, ymin = 0, ymax = dnorm(0), fill = "yellow", alpha = 0.3)

combined_plot <- uniform_plot + exponential_plot + normal_plot +
  plot_layout(ncol = 3)

print(combined_plot)
