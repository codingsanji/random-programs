# Q. Find value at 'n' index for Fibonacci sequence (iterative method)

def fibonacci(n):
  if n <= 1:
    return n

  x, y = 0, 1
  for i in range(2, n + 1):
    x, y = y, x + y
  return y

n = int(input("Enter the index of the Fibonacci number to calculate: "))
result = fibonacci(n)
print(f"The {n}th Fibonacci number is {result}")
