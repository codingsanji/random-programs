# Recursive Algorithm number 9
# Q. Merge sort to sort an array (input 8 , 2  , 4 , 6 , 9 , 7 , 10 , 1 , 5 , 3 as per question to test)

def merge_sort(arr):
  if len(arr) <= 1:
    return arr  

  mid = len(arr) // 2
  left_half = arr[:mid]
  right_half = arr[mid:]

  left_half = merge_sort(left_half)
  right_half = merge_sort(right_half)

  return merge(left_half, right_half)

def merge(left, right):
  merged = []
  i = j = 0

  while i < len(left) and j < len(right):
    if left[i] <= right[j]:
      merged.append(left[i])
      i += 1
    else:
      merged.append(right[j])
      j += 1

  merged.extend(left[i:])
  merged.extend(right[j:])

  return merged


n = int(input("Enter the number of elements in the array: "))
print("Enter the elements of the array:")
arr = []
for i in range(n):
  value = int(input(f"Enter element {i + 1}: "))
  arr.append(value)
  
# Sorting and printing the array
sorted_arr = merge_sort(arr)
print("Sorted array:", sorted_arr)
