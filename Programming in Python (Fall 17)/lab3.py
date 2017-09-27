# Tim Ludwig
# Programming in Python
# Lab 3


## PART ONE##
# page 117, 1-7
# page 121, 8-10
# page 124-125, 11-12
# page 132-133, 13
# page 139, 14-19
# page 140, 20-21

#1 Control structure is a logical design that controls the order in which a set of statements executes.

#2 Decision structure is a specific set of actions performed ONLY IF a condition exists. Aka selection structure.

#3 A single alternative decision structure is a decision structure that only provides one alternative execution path.

#4 A Boolean expression is an expression tested by the IF statement to determine whether it is true or false.

#5 A relational operator determines whether a specific relationship exists between two values. Greater than, less than, greater than or equal to, less than or equal to, equal to, not equal to.
# >, <, >=, <=, ==, !=

#6
# y = int(input("Enter a value between 0-20: "))
#
# if y ==20:
#     x=0
#     print(y)
#     print(x)
#

#7
# sales = int(input("Enter sales amount: "))
#
# if sales >= 10000:
#     commisionRate = 0.2
# else:
#     commisionRate = 0.00
#
#     print(commisionRate)

#8 A dual alternative decision structure is has TWO possible execution paths. One taken if the condition is true, the other taken if it's false.

#9 A dual decision structure is made through the if-else statement.

#10 If the initial condition is FALSE then the ELSE statemnt will execute.

#11
# if "z" < "a":
    # print("z is less than a.")
# else:
    # print("z is not less than a.")
# prints "z is not less than a."

#12
# s1 = "New York"
# s2 = "Boston"
#
# if s1 > s2:
#     print(s2)
#     print(s1)
# else:
#     print(s1)
#     print(s2)
# prints Boston, then New York.

#13
# number = int(input("Enter a number here: "))
#
# if number == 1:
#     print("One")
# elif number == 2:
#     print("Two")
# elif number == 3:
#     print("Three")
# else:
#     print("Unknown")

#14 A compound Boolean expression is multiple Boolean expressions connected by logical operators.

#15 F, T, F, F, T, T, F, F, F, T

#16 T, F, T, T, T

#17 For the or operator: if left operand is TRUE, the compound expression is true. Otherwise, evaluate right operand.
#17 For the and operator: if the left operand is false, the compound expression is false. Otherwise, evaluate right operand.

#18, #19
# speed = int(input("Enter speed here: "))
# if speed > 0 and speed < 200:
#     print("The number is valid.")
# else:
#     print("The number is  not valid.")

#20 The bool variable can only be the values TRUE or FALSE

#21 Flag variables are variables that signal when some condition exists in a program. When it's set to FALSE, the condition doesn't exist in the program. When it's set to TRUE, the condition does exist in the program.

## PART TWO ##
# page 153, 8


# state amount of hotdogs and buns per package and store in variables
import math

hotdogs = 10
buns = 8

print("You're having a party! Let's get ready to go shopping...")

guests = int(input("How many people are coming over: "))
hotdogsPerPerson = int(input("How many hotdogs will each person be given: "))

hotdogPackagesNeeded  = math.ceil((guests * hotdogsPerPerson) / 10)
bunPackagesNeeded = math.ceil((guests * hotdogsPerPerson) / 8)
#math.ceil rounds partial packages up to the higher integer.

totalDogs = hotdogPackagesNeeded * 10
totalBuns = bunPackagesNeeded * 8

print("Hotdog packages needed: ")
print(hotdogPackagesNeeded)
print("Bun packages needed: ")
print (bunPackagesNeeded)

if totalDogs * totalBuns >= guests * hotdogsPerPerson:
    print("Hotdogs leftover: ")
    print(totalDogs - (guests * hotdogsPerPerson))
    print("Hotdog buns leftover: ")
    print(totalBuns - (guests * hotdogsPerPerson))
    
    #because I have to write out my mathematical logic
    #if there are 20 people coming and having 2 hotdogs each = 21 * 2 = 42
    #40 total hotdogs requires 5 packs of hotdogs, 50 total. Remainder is 50 - 42 = 8
    #40 total hotdogs requires 6 packs of buns, 48 total. Remainder is 48 - 42 = 6

## PART THREE ##
# page 153, 9

pocket = int(input("Take a roll at roulette! Which number did you get: "))

if pocket == 0:
    print("Green pocket!")
elif pocket % 2 == 0 and pocket <= 10:
    print("Black pocket!")
elif pocket % 2 == 1 and pocket <= 10:
    print("Red pocket!")
elif pocket % 2 == 0 and pocket <= 18 and pocket >= 11:
    print("Red pocket!")
elif pocket % 2 == 1 and pocket <= 18 and pocket >= 11:
    print("Black pocket!")
elif pocket % 2 == 0 and pocket <= 28 and pocket >= 19:
    print("Black pocket!")
elif pocket % 2 == 1 and pocket <= 28 and pocket >= 19:
    print("Red pocket!")
elif pocket % 2 == 1 and pocket <= 36 and pocket >= 29:
    print("Black pocket!")
elif pocket % 2 == 0 and pocket <= 36 and pocket >= 29:
    print("Red pocket!")
elif pocket  < 0 or pocket > 36:
    print("Ya silly? Those numbers aren't even in roulette. Try 0-36.")
