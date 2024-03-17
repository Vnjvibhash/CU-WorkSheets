theoretical_probabilities <- rep(1/6, 6)
simulated_rolls <- sample(1:6, size = 1000, replace = TRUE)
empirical_probabilities <- table(simulated_rolls) / length(simulated_rolls)

# Create a matrix of probabilities and provide column names
prob_matrix <- cbind(Theoretical = theoretical_probabilities, Empirical = empirical_probabilities)

# Plot the barplot
barplot(prob_matrix, beside = TRUE,
        ylim = c(0, 1), col = c("blue", "red"),
        legend.text = c("Theoretical", "Empirical"),
        main = "Theoretical vs Empirical Probability")
