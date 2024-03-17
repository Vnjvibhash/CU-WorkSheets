library(ggplot2)

uniform_data <- runif(1000, min = 0, max = 1)
exponential_data <- rexp(1000, rate = 0.5)
normal_data <- rnorm(1000, mean = 0, sd = 1)

uniform_plot <- ggplot(data.frame(x = uniform_data), aes(x = x)) +
  geom_density(fill = "blue", alpha = 0.5) +
  labs(title = "Uniform Distribution", x = "Value", y = "Density")

exponential_plot <- ggplot(data.frame(x = exponential_data), aes(x = x)) +
  geom_density(fill = "green", alpha = 0.5) +
  labs(title = "Exponential Distribution", x = "Value", y = "Density")

normal_plot <- ggplot(data.frame(x = normal_data), aes(x = x)) +
  geom_density(fill = "orange", alpha = 0.5) +
  labs(title = "Normal Distribution", x = "Value", y = "Density")

combined_plot <- uniform_plot + exponential_plot + normal_plot +
  plot_layout(ncol = 3)

print(combined_plot)
