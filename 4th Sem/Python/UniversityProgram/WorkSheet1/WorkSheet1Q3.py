#Covert centimeters to meters & Kilometers
cm = input("Enter Length in Centimeters : ")
meter = float(cm)/100
kilometer = float(cm) / 100000
print("Length in meters = " ,meter , "m")
print("Length in Kilometers = ",kilometer , "km")

#Covert Meters to centimeters & Kilometers
meter = input("Enter Length in Meters : ")
cm = float(meter)*100
kilometer = float(meter) / 1000
print("Length in Centimeters = " ,cm , "cm")
print("Length in Kilometers = ",kilometer , "km")

#Covert Kilometers to centimeters & meters
kilometer = input("Enter Length in Kilometers : ")
meter = float(kilometer)*1000
cm = float(kilometer) * 100000
print("Length in Centimeters = " ,cm , "cm")
print("Length in meters = ",meter , "m")
