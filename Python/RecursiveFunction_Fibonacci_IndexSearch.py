# Recursive Algorithm number 7 
# Q. Find value at 'n' index for Fibonacci sequence

def fibonacci(n):
  if n <= 1:
    return n
  else:
    return fibonacci(n - 1) + fibonacci(n - 2)

n = int(input("Enter the index of the Fibonacci number to calculate: "))
result = fibonacci(n)
print(f"The {n}th Fibonacci number is {result}")
