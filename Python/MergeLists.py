# Recursive Algorithm number 10
# Q. Merge 2 lists (input 2 , 3 , 5 , 6 for the first list and 1 , 4 for the second list as per question to check)

def merge_lists(list1, list2):
    merged_list = []
    i = j = 0

    while i < len(list1) and j < len(list2):
        if list1[i] <= list2[j]:
            merged_list.append(list1[i])
            i += 1
        else:
            merged_list.append(list2[j])
            j += 1

    # Appending the remaining elements 
    merged_list.extend(list1[i:])
    merged_list.extend(list2[j:])

    return merged_list

# 1st List
n1 = int(input("Enter the number of elements in the first list: "))
print("Enter the elements of the first list in sorted order:")
list1 = []
for i in range(n1):
    value = int(input(f"Enter element {i + 1}: "))
    list1.append(value)

# 2nd List
n2 = int(input("Enter the number of elements in the second list: "))
print("Enter the elements of the second list in sorted order:")
list2 = []
for i in range(n2):
    value = int(input(f"Enter element {i + 1}: "))
    list2.append(value)

# Merging and printing the list
merged_list = merge_lists(list1, list2)
print("Merged list:", merged_list)
