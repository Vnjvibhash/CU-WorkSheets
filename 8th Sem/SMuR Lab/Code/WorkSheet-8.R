library(dplyr)
library(ggplot2)

data <- read.csv("C:/Users/Vivekajee/Music/CodeWithVnj/R Program/anscombe.csv")
srs_sample <- data %>% sample_n(size = 100)

strata <- data %>% group_by(stratum_variable) %>% slice_sample(n = 50, replace = TRUE)
stratified_sample <- ungroup(strata)

clusters <- unique(data$cluster_variable)
cluster_sample <- data[data$cluster_variable %in% sample(clusters, size = 2), ]

mean_srs <- mean(srs_sample$variable_of_interest)
mean_stratified <- mean(stratified_sample$variable_of_interest)
mean_cluster <- mean(cluster_sample$variable_of_interest)

sampling_methods <- c("Simple Random Sampling", "Stratified Sampling", "Cluster Sampling")
means <- c(mean_srs, mean_stratified, mean_cluster)
sampling_data <- data.frame(Sampling_Method = sampling_methods, Mean_Value = means)

ggplot(sampling_data, aes(x = Sampling_Method, y = Mean_Value, fill = Sampling_Method)) +
  geom_bar(stat = "identity", width = 0.5) +
  geom_text(aes(label = round(Mean_Value, 2)), vjust = -0.5, size = 4) +
  labs(title = "Means of Different Sampling Methods", y = "Mean Value") +
  theme_minimal() +
  theme(axis.text.x = element_text(angle = 45, hjust = 1))
