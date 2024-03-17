library(tidyverse)
library(ggplot2)

group1 <- c(30, 35, 40, 45, 50)
group2 <- c(25, 30, 35, 40, 45)
group3 <- c(20, 25, 30, 35, 40)

one_way_anova_result <- aov(c(group1, group2, group3) ~ rep(c("Group1", "Group2", "Group3"), each = 5))

data <- data.frame(
  value = c(group1, group2, group3),
  factor1 = rep(c("A", "B", "C"), each = 5)
)
two_way_anova_result <- aov(value ~ factor1, data = data)

one_way_p <- summary(one_way_anova_result)[[1]]$`Pr(>F)`[1]
two_way_p <- summary(two_way_anova_result)[[1]]$`Pr(>F)`[1]

anova_results <- data.frame(
  Analysis = c("One-Way ANOVA", "Two-Way ANOVA"),
  p_value = c(one_way_p, two_way_p)
)

ggplot(anova_results, aes(x = Analysis, y = p_value, fill = Analysis)) +
  geom_bar(stat = "identity", width = 0.5) +
  geom_text(aes(label = format(p_value, scientific = TRUE)), vjust = -0.5, size = 4) +
  labs(title = "ANOVA Results", y = "p-value") +
  theme_minimal() +
  theme(legend.position = "none")
