#QUESTION 1
print("1. Fill in the blank to complete the “first_character” function. This function should return the first character of any string passed in.  Complete the string operation needed in this function so that input like 'Hello, World' will produce the output 'H'.")
#Code
def first_character(string):
    # Complete the return statement using a string operation.
    return string[0] 


print(first_character("Hello, World")) # Should print H
print(first_character("Python is awesome")) # Should print P
print(first_character("Keep going")) # Should print K
print()

#QUESTION 2
print('''Complete the for loop and string method needed in this function so that a function call like 
"alpha_length('This has 1 number in it')" will return the output "17". 

This function should:
- accept a string through the parameters of the function;
- iterate over the characters in the string;
- determine if each character is a letter (counting only alphabetic characters; numbers, punctuation, and spaces should be ignored);
- increment the counter;
- return the count of letters in the string.''')
#Code
def alpha_length(string):
    count = 0  # Initialize a counter
    for char in string:  # Iterate over each character in the string
        if char.isalpha():  # Check if the character is alphabetic
            count += 1  # Increment the counter if it's a letter
    return count  # Return the count of alphabetic characters


# Test cases
print(alpha_length("This has 1 number in it"))  # Should print 17
print(alpha_length("Python 3.8!"))  # Should print 6
print(alpha_length("1234!@#$"))  # Should print 0
print()

#QUESTION 3
print('''Consider the following scenario about using Python lists:

A professor gave his two assistants, Jaime and Drew, the task of keeping an attendance list of students in the order they arrive in the classroom. 
Drew was the first one to note which students arrived, and then Jaime took over. After the class, they each entered their lists into the computer 
and emailed them to the professor. The professor wants to combine the two lists into one, in the order of each student's arrival. 
Jaime emailed a follow-up, saying that her list is in reverse order.

Complete the code to combine the two lists into one in the order of: the contents of Drew's list, followed by Jaime’s list in reverse order, 
to produce an accurate list of the students as they arrived. This function should:

- accept two lists through the function’s parameters;
- reverse the order of “list1”;
- combine the two lists so that “list2” comes first, followed by “list1”;
- return the new list.''')
#Code
def combine_lists(list1, list2):
    combined_list = []  # Initialize an empty list variable
    list1.reverse()  # Reverse the order of "list1"
    combined_list = list2 + list1  # Combine list2 and reversed list1
    return combined_list

  
Jaimes_list = ["Alma", "Chika", "Benjamin", "Jocelyn", "Oakley"]
Drews_list = ["Minna", "Carol", "Gunnar", "Malena"]

print(combine_lists(Jaimes_list, Drews_list))
# Should print ['Minna', 'Carol', 'Gunnar', 'Malena', 'Oakley', 'Jocelyn', 'Benjamin', 'Chika', 'Alma']
print()

#QUESTION 4
print('''Fill in the blank to complete the “increments” function. This function should use a list comprehension to create a list of numbers 
incremented by 2 (n+2). The function receives two variables and should return a list of incremented consecutive numbers between “start” 
and “end” inclusively (meaning the range should include both the “start” and “end” values). Complete the list comprehension in this function 
so that input like “increments(2, 3)” will produce the output “[4, 5]”.''')
#Code
def increments(start, end):
    return [n + 2 for n in range(start, end + 1)]  # Create the required list comprehension.


print(increments(2, 3))  # Should print [4, 5]
print(increments(1, 5))  # Should print [3, 4, 5, 6, 7]
print(increments(0, 10))  # Should print [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
print()

#QUESTION 5
print('''Question 5
Fill in the blanks to complete the “countries” function. This function accepts a dictionary containing a list of continents (keys) 
and several countries from each continent (values). For each continent, format a string to print the names of the countries only. 
The values for each key should appear on their own line.''')
#Code
def countries(countries_dict):
    result = ""
    # Complete the for loop to iterate through the key and value items 
    # in the dictionary.
    for continent, country_list in countries_dict.items():
        # Use a string method to format the required string.
        result += str(country_list) + "\n"  # Convert the list to a string and add a newline
    return result

print(countries({"Africa": ["Kenya", "Egypt", "Nigeria"], "Asia": ["China", "India", "Thailand"], "South America": ["Ecuador", "Bolivia", "Brazil"]}))
print()

#QUESTION 6
print('''Consider the following scenario about using Python dictionaries:

Tessa and Rick are hosting a party. Together, they sent out invitations, and collected the responses in a dictionary, with names of their friends 
and the number of guests each friend will be bringing.

Complete the function so that the “check_guests” function retrieves the number of guests (value) the specified friend “guest” (key) is bringing. 
This function should:

- accept a dictionary “guest_list” and a key “guest” variable passed through the function parameters;
- print the values associated with the key variable.''')
#CODE
def check_guests(guest_list, guest):
    return guest_list[guest]  # Return the value for the given key


guest_list = {
    "Adam": 3,
    "Camila": 3,
    "David": 5,
    "Jamal": 3,
    "Charley": 2,
    "Titus": 1,
    "Raj": 6,
    "Noemi": 1,
    "Sakira": 3,
    "Chidi": 5
}

print(check_guests(guest_list, "Adam"))    # Should print 3
print(check_guests(guest_list, "Sakira"))  # Should print 3
print(check_guests(guest_list, "Charley")) # Should print 2
print()

#QUESTION 7
print('''Consider the following scenario about using Python dictionaries:

A teacher is using a dictionary to store student grades. The grades are stored as a point value out of 100. Currently, the teacher has a 
dictionary setup for Term 1 grades and wants to duplicate it for Term 2. The student name keys in the dictionary should stay the same, 
but the grade values should be reset to 0.

Complete the “setup_gradebook” function so that input like “{"James": 93, "Felicity": 98, "Barakaa": 80}” will produce a resulting 
dictionary that contains “{"James": 0, "Felicity": 0, "Barakaa": 0}”. This function should:

- accept a dictionary “old_gradebook” variable through the function’s parameters;
- make a copy of the “old_gradebook” dictionary;
- iterate over each key and value pair in the new dictionary;
- replace the value for each key with the number 0;
- return the new dictionary.''')
#CODE
def setup_gradebook(old_gradebook):
    # Use a dictionary method to create a new copy of the "old_gradebook".
    new_gradebook = old_gradebook.copy()  
    # Complete the for loop to iterate over the new gradebook. 
    for student in new_gradebook:
        # Use a dictionary operation to reset the grade values to 0.
        new_gradebook[student] = 0  
    return new_gradebook

fall_gradebook = {"James": 93, "Felicity": 98, "Barakaa": 80}
print(setup_gradebook(fall_gradebook))
# Should output {'James': 0, 'Felicity': 0, 'Barakaa': 0}
print()









