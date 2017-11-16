# Tim Ludwig
# Lab 7
# CPT 101

# 1
# [1, 2 , 99, 4, 5]

# 2
# [0, 1, 2]

# 3
# [10, 10, 10, 10, 10]

# 4
#output:
# 1
# 3
# 5
# 7
# 9

# 5
# output:
# 4

# 6
# len function

# 7
# [1, 2, 3]
# [10, 20, 30]
# [1, 2, 3, 10, 20, 30]

# 8
# [1, 2, 3]
# [10, 20, 30, 1, 2, 3]

# 9
# [2, 3]

# 10
# [2, 3]

# 11
# [1]

# 12
# [1, 2, 3, 4, 5]

# 13
# [3, 4, 5]

# 14
# Jasmine's family:
# ["Jim", "Jill", "John", "Jasmine"]

# 15
# remove method searchers for and removes an element containing a specific value. del removes an element at a specific index

# 16
# min and max functions built in

# 17
#  names.append("Wendy") because element 0 doesn't exist thus an error will be thrown

# 18
# index searches for item in the list and returns the index of the first element containing that item
# insert method inserts an item into a list at a specified index
# sort method sorts the items in a list to appear in ascending order
# reverse method reverses the order of the items in the list

# 19
# 4 rows, 2 columns

# 20
# mylist = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

# 21
# for r in range(4):
#     for c in range(2):
#         print(numbers[r][c])

# 22
# lists are mutable, tuples are immutable

# 23
# tuples are sometimes required in the Python language
# tuples are safe because their information cannot be modified once they're made

#24
# my_tuple = tuple(my_list)

#25
# my_list = list(my_tuple)

import math

def main():
    nums = get_values()
    print("You've entered: ", nums)
    print("Your total is: ", get_total(nums))
    print("The smallest number is: ", get_min(nums))
    print("The largest number is: ", get_max(nums))
    print("The average is:", round(get_avg(nums)))

def get_values():
    val = []

    while len(val) < 20:
        num = int(input("Enter a number here: "))
        val.append(num)
    return val

def get_total(val_list):
    total = 0

    for num in val_list:
        total += num

    return total


def get_max(val_list):
    max_val = 0

    for num in val_list:
        max_val = max(val_list)
    return max_val


def get_min(val_list):
    min_val = 0

    for num in val_list:
        min_val = min(val_list)
    return min_val

def get_avg(val_list):
    avg = 0
    add = get_total(val_list)

    for num in val_list:
        avg = add / (len(val_list) - 1)
    return avg


# main()
###############################################

import matplotlib.pyplot as plt
import csv

def main():

    x = []
    y = []

    with open("1994_gas.txt", "r") as csvfile:
        plots = csv.reader(csvfile)
        for row in plots:
            x.append(row)
            y.append(row)

    plt.plot(x, y)
    plt.xlabel("X")
    plt.ylabel("Y")
    plt.title("1994 Average Gas Prices")
    plt.legend()
    plt.show()

# main()

def main():
    infile = open("us_pop.txt", "r")

    pop = infile.readlines()
    print(pop)
    emptylist = []
    for i in pop:
        print(emptylist.append(int())

main()
