#Recursive Algorithm number 1
#Q. compute n! where n is a non-negative integer.

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)

n = int(input("Enter a nonnegative integer: "))
if n < 0:
        print("Factorial is not defined for negative integers.")
else:
        print("The factorial of ",  n ,  " is " , factorial(n))




