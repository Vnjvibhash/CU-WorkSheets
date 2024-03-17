library(readr)

# Import data from CSV file
dataset <- read.csv("C:/Users/Vivekajee/Music/CodeWithVnj/R Program/Student_Data.csv")

str(dataset)
head(dataset)
summary(dataset)
subset_data <- dataset[dataset$Fees > 60000, ]
dataset$New_Values <- dataset$Values * 2
filtered_data <- subset(dataset, St_Name == "Ruhma")
mean_value <- mean(dataset$Fees)
median_value <- median(dataset$Fees)
sd_value <- sd(dataset$Fees)
table(dataset$St_Name)

hist_color <- "red"
barplot_color <- "lightgreen"

par(mfrow = c(1, 2))
hist(dataset$Values, col = hist_color, main = "Distribution of Values", xlab = "Values")
barplot(table(dataset$St_Name), col = barplot_color, main = "Frequency of St Names", las = 2)
