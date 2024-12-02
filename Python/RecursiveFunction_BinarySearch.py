# Recursive Algorithm number 6
# Q. Do binary seach to find x

def recursive_binary_search(arr, target, low, high):
    if low > high:
        return -1
    
    mid = (low + high) // 2  
    if arr[mid] == target:
        return mid  #target found at mid!
    elif arr[mid] < target:          #right half search
        return recursive_binary_search(arr, target, mid + 1, high)  
    else:     #left half search
        return recursive_binary_search(arr, target, low, mid - 1)  

# Input values for the array and respective target
print("Do note that array has to be sorted or the output will be incorrect!")
arr = [ ]
n = int(input("Enter the number of elements in the array: "))
print("Enter the elements of the array in sorted order:")
for i in range(n):
    value = int(input(f"Enter element {i + 1}: "))
    arr.append(value)
target = int(input("Enter the target value to search for: "))

# Call the recursive binary search function
result = recursive_binary_search(arr, target, 0, n - 1)

if result != -1:
    print(f"Target found at index {result + 1}")
else:
    print("Target not found")
