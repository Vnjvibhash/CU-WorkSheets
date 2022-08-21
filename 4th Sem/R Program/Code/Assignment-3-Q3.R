data("mtcars")

hp.avg <- aggregate(x=mtcars$hp, by=list(mtcars$cyl), FUN=mean)

hp.plot <- barplot(height = hp.avg[,2], 
                   names.arg = hp.avg[,1],
                   ylim = c(0,300))

hp.plot <- text(x=hp.plot, 
                y=hp.avg[,2]+10, 
                labels=as.character(round(hp.avg[,2],2)))

hp.plot