# string = "Bollocks"
#
# for character in string:
#     print(character)
#
# string[0]
#
# 9
#
# IndexError
#
# len function
#
# second statement assigns value to individual character
#
# cde
#
# defg
#
# abc
#
# abcdefg
#
# if 'd' in mystring:
#     print("yes, it's there")
#
#
# little = big.upper()
#
# if ch.isdigit():
#     print("digit")
# else:
#     print("Not digit")
#
# a A
#
# $
#
# for letter in mystring:
#     if letter.isupper():
#         count+=1
#
# my_list = days.split()
#
# my_list = values.split()



def pig_latin():
    word = str(input("Enter a sentence here: ")).split()
    for char in word:
        print(char[1:].lower() + char[0].lower() + "ay", end = " ")
    print()
pig_latin()



from collections import Counter

def powerball():
    with open("pbnumbers.txt") as pb:
        lines = pb.read().split()
        counter = Counter(lines)
        amt = counter.most_common(10)
        print("Powerball numbers are up, let's see which are the most popular...")
        for i, line in amt:
            print("The number", i, "appears", line, "times")
powerball()
