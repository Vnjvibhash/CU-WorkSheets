english = float(input("Please enter English Marks: "))
math = float(input("Please enter Math score: "))
computers = float(input("Please enter Computer Marks: "))
physics = float(input("Please enter Physics Marks: "))
chemistry = float(input("Please enter Chemistry Marks: "))

total = english + math + computers + physics + chemistry
average = total / 5
percentage = (total / 500) * 100
if(percentage<45):
    grade = "D"
elif(percentage>=45 and percentage<60):
    grade = "C"
elif(percentage>=60 and percentage<80):
    grade = "B"
elif(percentage>=80 and percentage<90):
    grade = "A"
elif(percentage>=90 and percentage<=100):
    grade = "A+"



print("\nTotal Marks = %.2f"  %total)
print("Average Marks = %.2f"  %average)
print("Marks Percentage = %.2f"  %percentage)
print("Marks Grade = " +grade)