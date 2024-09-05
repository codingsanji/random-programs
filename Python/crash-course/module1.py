#QUESTION 1
print("1. Keeping in mind there are 60 seconds per minute , write a program that calculates how many seconds there are in an hour .Print the result to the screen. Note: Your result should be in the format of just a number, not a sentence.")
# Code:
seconds=60
minutes=60
hour=seconds*minutes
print(hour)
print()

#QUESTION 2
print("2. Use Python to calculate how many different passwords can be formed with 3 lower case English letters (excludes any character not found in the English alphabet).  For a 1 letter password, there would be 26 possibilities; one for every letter of the English alphabet.  For a 2 letter password, each letter is independent of the other, so there would be 26 times 26 possibilities. Using this information, print the amount of possible passwords that can be formed with 3 letters.")
# Code:
digits=3
alphabets=26
possibilities=alphabets**digits
print(possibilities)
print()

#QUESTION 3
print("3. Fill in the blank to calculate how many sectors a given 16 GB (gigabyte) hard disk drive has. The given hard drive is divided into sectors of 512 bytes each. Divide the total bytes on the drive by the number of bytes in a sector to calculate how many sectors this drive has.  Your result should be a number. Note: To calculate the total bytes on the disk drive, multiply by multiples of 1024. In the code below,  you can calculate the 'disk_size' of 16 GB by multiplying 16 by 1024 three times to go from bytes, to kilobytes, to megabytes, and finally to gigabytes.")
# Code:
disk_size = 16*1024*1024*1024
sector_size = 512
sector_amount = disk_size/sector_size
print(sector_amount) 
print()
