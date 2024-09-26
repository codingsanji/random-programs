#QUESTION 1
print("1. Fill in the blanks to print the numbers from 15 to 5, counting down by fives.")
# Code:
number = 15 # Initialize the variable
while number>=5: # Complete the while loop condition
    print(number, end=" ")
    number=number - 5 # Increment the variable
# Should print 15 10 5
print()

#QUESTION 2
print("2. The loop should check each number from 1 to 5 and identify if the number is odd or even.  ")
# Code:
for number in range(1 , 6 , 1):
    if number % 2 == 0:
        print("even")
    else:
        print("odd")
print()

#QUESTION 3
print("3. Fill in the blanks to complete the function “even_numbers(n)”. This function should count how many even numbers exist in a sequence from 0 to the given “n”number, where 0 counts as an even number.  For example, even_numbers(25) should return 13, and even_numbers(6) should return 4.")
# Code:
def even_numbers(n):
    count = 0
    current_number = 0
    while  current_number<=n: # Complete the while loop condition
        if current_number % 2 == 0:
            count=count+1# Increment the appropriate variable
        current_number=current_number+1 # Increment the appropriate variable
    return count
    
print(even_numbers(25))   # Should print 13
print(even_numbers(144))  # Should print 73
print(even_numbers(1000)) # Should print 501
print(even_numbers(0))    # Should print 1
print()


#QUESTION 4
print("4. Fill in the blanks to complete the “rows_asterisks” function. This function should print rows of asterisks (*), where the number of rows is equal to the “rows” variable. The number of asterisks per row should correspond to the row number (row 1 should have 1 asterisk, row 2 should have 2 asterisks, etc.). Complete the code so that “row_asterisks(5)” will print a pattern.")
# Code:
def rows_asterisks(rows):
    # Complete the outer loop range to control the number of rows
    for x in range(0, rows): 
        # Complete the inner loop range to control the number of 
        # asterisks per row
        for y in range(0, x+1): 
            # Prints one asterisk and one space
            print("*", end=" ")
        # An empty print() function inserts a line break at the 
        # end of the row 
        print()


rows_asterisks(5)
# Should print the asterisk rows shown above
print()


#QUESTION 5
print("5. Fill in the blanks to complete the “counter” function. This function should count down from the “start” to “stop” variables when “start” is bigger than “stop”. Otherwise, it should count up from “start” to “stop”. Complete the code so that a function call like “counter(3, 1)” will return “Counting down: 3, 2, 1” and “counter(2, 5)” will return “Counting up: 2, 3, 4, 5”.")
# Code
def counter(start, stop):
    if start > stop:
        return_string = "Counting down: "
        while start >= stop: # Complete the while loop
            return_string += str(start) # Add the numbers to the "return_string"
            if start > stop:
                return_string += ","
            start=start-1 # Increment the appropriate variable
    else:
        return_string = "Counting up: "
        while start <= stop: # Complete the while loop
            return_string += str(start) # Add the numbers to the "return_string"
            if start < stop:
                return_string += ","
            start=start+1 # Increment the appropriate variable
    return return_string


print(counter(1, 10)) # Should be "Counting up: 1,2,3,4,5,6,7,8,9,10"
print(counter(2, 1)) # Should be "Counting down: 2,1"
print(counter(5, 5)) # Should be "Counting up: 5"
print()


#QUESTION 6
print("6. Fill in the blanks to complete the “odd_numbers” function. This function should return a space-separated string of all odd positive numbers, up to and including the “maximum” variable that's passed into the function. Complete the for loop so that a function call like “odd_numbers(6)” will return the numbers “1 3 5”.")
#Code
def odd_numbers(maximum):
    
    return_string = "" # Initializes variable as a string

    # Complete the for loop with a range that includes all 
    # odd numbers up to and including the "maximum" value.
    for i in range (0,maximum+1): 
        if i%2!=0 :
            return_string += str(i)
            i+=1
        else:
            return_string += " "
            i+=1
        # Complete the body of the loop by appending the odd number
        # followed by a space to the "return_string" variable.

    # This .strip command will remove the final " " space 
    # at the end of the "return_string".
    return return_string.strip()


print(odd_numbers(6))  # Should be 1 3 5
print(odd_numbers(10)) # Should be 1 3 5 7 9
print(odd_numbers(1))  # Should be 1
print(odd_numbers(3))  # Should be 1 3
print(odd_numbers(0))  # No numbers displayed
print()

      
#QUESTION 7 ANSWER
num1 = 0
num2 = 0

for x in range(5):
    num1 = x
    for y in range(14):
        num2 = y + 3

print(num1 + num2)



