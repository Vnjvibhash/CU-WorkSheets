# Load required libraries
library(ggplot2)

data <- read.csv("C:/Users/Vivekajee/Music/CodeWithVnj/R Program/Friends_Data.csv")

linear_model <- lm(dependent_variable ~ independent_variable, data = data)
multiple_model <- lm(dependent_variable ~ independent_var1 + independent_var2, data = data)
poly_model <- lm(dependent_variable ~ poly(independent_variable, degree = 2), data = data)

summary(linear_model)

summary(multiple_model)

summary(poly_model)

ggplot(data, aes(x = independent_variable, y = dependent_variable)) +
  geom_point() +
  geom_smooth(method = "lm", formula = y ~ poly(x, degree = 2), se = FALSE, color = "blue") +
  labs(title = "Polynomial Regression Analysis", x = "Independent Variable", y = "Dependent Variable")
