# Recursive Algorithm number 2
# Q. Compute a^n, where a is a nonzero real number, and n is a non-negative integer.

def power(a, n):
    if n == 0:
        return 1
    else:
        return a * power(a, n - 1)

# Input values for a and n
a = float(input("Enter a nonzero real number (a): "))
n = int(input("Enter a nonnegative integer (n): "))

if n < 0:
    print("The exponent must be a nonnegative integer.")
elif a == 0:
    print("Base 'a' must be a nonzero number.")
else:
    print("The value of " , a , " raised to the power of " , n , " is " , power(a, n))
