def digits(n):
	count = 0
	while (n!=0):
		n//=10
		count += 1
		
	return count
	
print(digits(25))   # Should print 2
print(digits(144))  # Should print 3
print(digits(1000)) # Should print 4
print(digits(0))    # Should print 1