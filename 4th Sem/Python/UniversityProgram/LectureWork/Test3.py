total_classes=float(input("Enter the Number of classes held: "))
total_attended=float(input("Enter the Number of classes attend: "))
medicancause = input("Do you have any Medical cause: (Y/N) ")
attendance=(total_attended/total_classes)*100
if medicancause=='Y'or medicancause=='y':
    print("You are allowed to sit in Exam")
else:
    if attendance>=75:
        print("Your attendance is: %.2f"%attendance+"%")
        print("You are allowed to sit in Exam")
    else:
        print("Your attendance is: %.2f"%attendance+"%")
        print("I'm So Sorry, You are Not allowed to sit in Exam")