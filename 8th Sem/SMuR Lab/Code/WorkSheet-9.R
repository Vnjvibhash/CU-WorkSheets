library(tidyverse)
library(ggplot2)

group1 <- c(25, 30, 28, 35, 32)
group2 <- c(20, 22, 18, 25, 28)
t_test_result <- t.test(group1, group2)

successes <- 20
total_trials <- 50
prop_test_result <- prop.test(successes, total_trials, alternative = "two.sided")

data <- matrix(c(30, 20, 15, 25), nrow = 2, byrow = TRUE)
chi_square_result <- chisq.test(data)

results_df <- data.frame(
  Test = c("t-test", "Proportion Test", "Chi-Square Test"),
  p_value = c(t_test_result$p.value, prop_test_result$p.value, chi_square_result$p.value)
)

ggplot(results_df, aes(x = Test, y = p_value, fill = Test)) +
  geom_bar(stat = "identity") +
  geom_text(aes(label = round(p_value, 3)), vjust = -0.5) +
  labs(x = "Test", y = "p-value", title = "Statistical Test Results") +
  theme_minimal() +
  theme(axis.text.x = element_text(angle = 45, hjust = 1))

