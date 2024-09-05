#QUESTION 1
print("1. Complete the code to output the statement, “Marjery lives at her home address of 1234 Mockingbird Lane”. Remember that precise syntax must be used to receive credit.")
name = "Marjery"
home_address = "1234 Mockingbird Lane"
print(name + " lives at her home address of " + home_address)
# Should print "Marjery lives at her home address of 1234 Mockingbird Lane"
print()

#QUESTION 2
print("2. Consider the following scenario about using if-elif-else statements: Students in a class receive their grades as Pass/Fail. Scores of 60 or more (out of 100) mean that the grade is 'Pass'. For lower scores, the grade is 'Fail'. In addition, scores above 95 (not included) are graded as 'Top Score'. Fill in the blanks in this function so that it returns the appropriate 'Pass',  'Fail', or 'Top Score' grade.")
def exam_grade(score):
    if score==100:
        grade = "Top Score"
    elif score>=60:
        grade = "Pass"
    else:
        grade = "Fail"
    return grade


print(exam_grade(65)) # Should print Pass
print(exam_grade(55)) # Should print Fail
print(exam_grade(60)) # Should print Pass
print(exam_grade(95)) # Should print Pass
print(exam_grade(100)) # Should print Top Score
print(exam_grade(0)) # Should print Fail
print()

#QUESTION 3
print("3. Fill in the blanks to complete the function. The character translator function receives a single lowercase letter, then prints the numeric location of the letter in the English alphabet. For example, 'a' would return 1 and 'b' would return 2. Currently, this function only supports the letters 'a', 'b', 'c', and 'd'. It returns 'unknown' for all other letters or if the letter is uppercase.")
def letter_translator(letter):
    if letter == 'a':
        letter_position = 1
    elif letter == 'b':
        letter_position = 2
    elif letter == 'c':
        letter_position = 3
    elif letter == 'd':
        letter_position = 4
    else:
        letter_position = 'unknown'
    return letter_position


print(letter_translator('a'))  # Should print 1
print(letter_translator('b'))  # Should print 2
print(letter_translator('c'))  # Should print 3
print(letter_translator('d'))  # Should print 4
print(letter_translator('e'))  # Should print unknown
print(letter_translator('A'))  # Should print unknown
print(letter_translator(' '))   # Should print unknown
print()


#QUESTION 4
print("4. Fill in the blanks to complete the ‘safe_division’ function. The function accepts two numeric variables through the function parameters and divides the ‘numerator’ by the ‘denominator’. The function’s main purpose is to prevent a ZeroDivisionError by checking if the ‘denominator’ is 0. If it is 0, the function should return 0 instead of attempting the division. Otherwise, all other numbers will be part of the division equation. Complete the body of the function so that the function completes its purpose.")
def safe_division(numerator, denominator):
    # Complete the if block to catch any "denominator" variables
    # that are equal to 0.
    if denominator == 0:
        result = 0
    else:
        # Complete the division equation.
        result = numerator / denominator
    return result


print(safe_division(5, 5))  # Should print 1.0
print(safe_division(5, 4))  # Should print 1.25
print(safe_division(5, 0))  # Should print 0
print(safe_division(0, 5))  # Should print 0.0
print()

