# Recursive Algorithm number 4
# Q. Compute the greatest common divisor (GCD) of two non-negative integers a and b, where a < b.

def gcd(a, b):
    if a == 0:
        return b
    else:
        return gcd(b % a, a)

# Input values for a and b
a = int(input("Enter the first non-negative integer (a): "))
b = int(input("Enter the second non-negative integer (b > a): "))

if a < 0 or b <= a:
    print("Invalid input values. Please ensure a >= 0 and b > a.")
else:
    result = gcd(a, b)
    print(f"The greatest common divisor of {a} and {b} is ", result)
    
