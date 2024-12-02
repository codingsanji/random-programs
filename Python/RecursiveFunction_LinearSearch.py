# Recursive Algorithm number 5
# Q. Do linear seach to find x

def recursive_search(arr, target, i, j):
    if i > j:
        return -1

    if arr[i] == target:
        return i

    return recursive_search(arr, target, i+1, j)

# Input values for the array and respective target
arr = [ ]
n = int(input("Enter the number of elements in the array: "))
print("Enter the elements of the array:")
for i in range(n):
    value = int(input(f"Enter element {i + 1}: "))
    arr.append(value)
target = int(input("Enter the target value to search for: "))

result = recursive_search(arr, target, 0, len(arr) - 1)
if result != -1:
    print(f"Target found at index {result+1}")
else:
    print("Target not found")
