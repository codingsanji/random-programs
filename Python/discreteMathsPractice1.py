
# Question 7
print("7. Give a recursive algorithm for computing nx whenever n is a positive integer and x is an integer using just addition.")
def multiplication(n, x):
    if n == 1:
        return x
    else:
        return x + multiplication(n - 1, x)

while True:
    n = int(input("Enter a positive integer n: "))
    if n > 0:
        break
    print("n must be a positive integer. Please try again.")

x = int(input("Enter an integer x: "))
result = multiplication(n, x)
print(f"{n} x {x} = {result}")


#Question 8
print("8. Give a recursive algorithm for finding the sum of the first n positive integers.")
def nsum(n):
    if n == 1:
        return 1
    else:
        return n + nsum(n - 1)

while True:
    n = int(input("Enter a positive integer n: "))
    if n > 0:
        break
    print("n must be a positive integer. Please try again.")
result = nsum(n)
print(f"The sum of the first {n} positive integers is {result}")


#Question 9
print("9. Give a recursive algorithm for finding the sum of the first n odd positive integers.")
def oddNsum(n):
    if n == 1:
        return 1
    else:
        return (2 * n - 1) + oddNsum(n - 1)

while True:
    n = int(input("Enter a positive integer n: "))
    if n > 0:
        break
    print("n must be a positive integer. Please try again.")

result = oddNsum(n)
print(f"The sum of the first {n} odd positive integers is {result}")


#Question 10
print("10. Give a recursive algorithm for finding the maximum of a finite set of integers, making use of the fact that the maximum of n integers is the larger of the last integer in the list and the maximum of the first n-1 integers in the list.")
def maxx(arr, n):
    if n == 1:
        return arr[0]
    else:
        return max(arr[n - 1], maxx(arr, n - 1))

numbers = list(map(int, input("Enter a list of integers separated by spaces: ").split()))
if not numbers:
    print("The list is empty. Please provide a valid list of integers.")
else:
    result = maxx(numbers, len(numbers))
    print(f"The maximum value in the list is {result}")
    

#Question 11
print("11.Give a recursive algorithm for finding the minimum of a set of finite set of integers, making use of the fact that the minimum of n integers is the smaller of the last integer in the list and the minimum of the first n-1 integers in the list.")
def minn(arr, n):
    if n == 1:
        return arr[0]
    else:
        return min(arr[n - 1], minn(arr, n - 1))

numbers = list(map(int, input("Enter a list of integers separated by spaces: ").split()))
if not numbers:
    print("The list is empty. Please provide a valid list of integers.")
else:
    result = minn(numbers, len(numbers))
    print(f"The minimum value in the list is {result}")
    

#Question 17
print("17. Describe a recursive algorithm for multiplying 2 non-negative integers x and y based on the fact that xy=2(x*(y/2)) when y is even and xy=2(x*(y/2)+x when y is odd , together with the intial condition xy=0 when y=0")
def multiplier(x, y):
  if y == 0:
    return 0  
  elif y % 2 == 0:
    return 2 * multiplier(x, y // 2)  
  else:
    return 2 * multiplier(x, y // 2) + x  

x = int(input("Enter the first non-negative integer (x): "))
y = int(input("Enter the second non-negative integer (y): "))
result = multiplier(x, y)
print("The product of", x, "and", y, "is", result)


#Question 23
print("23. Devise a recursive algorithm for computing n^2 where n is a non-negative integer, using the fact that (n+1)^2=n^2+2n+1. Then prove that this algorithm is correct.")
def squarer(n):
    if n == 0:
        return 0
    else:
        return squarer(n - 1) + 2 * (n - 1) + 1

result = squarer(4) #Output should be 16 so if you get it means the algorithm is correct
print(result)  


#Question 24
print("24. Devise a recursive algorithm to find a^2^n, where a is a real number and n is a positive integer. Use the equality a^(2^(n+1)) = (a^(2^n))^2.")
def rpower(a, n):
    if n == 0:
        return a
    else:
        return rpower(a * a, n - 1)

result = rpower(2, 3)  # 2^(2^3) = 2^8 = 256
print(result)  






