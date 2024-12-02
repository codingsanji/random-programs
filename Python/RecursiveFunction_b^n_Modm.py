# Recursive Algorithm number 3
# Q. Compute b^n mod m where b , n and m are integers with m >= 2 , n >= 0 , 1 <= b < m.

def mpower(b, n, m):
    if n == 0:
        return 1
    elif n % 2 == 0:
        return mpower(b, n // 2, m) ** 2 % m
    else:
        return b * mpower(b, n - 1, m) % m

# Input values for b, n, and m
b = int(input("Enter the base number (b): "))
n = int(input("Enter the exponent (n): "))
m = int(input("Enter the modulus (m): "))

if b < 1 or m < 2 or n < 0:
    print("Invalid input values. Please ensure b >= 1, m >= 2, and n >= 0.")
else:
    result = mpower(b, n, m)
    print(f"The value of {b}^{n} mod {m} is " ,  result)
