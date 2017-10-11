# Tim Ludwig
# CPT 101
# Lab 5 - 10/9/2017

#5.1
#A function is a group of statements that exist within a program for the purpose of performing a specific task

#5.2
#A large task is divided into several smaller tasks that are easily performed

#5.3
#If a specific operatin is needed more than once, it can be written once and called whenever needed

#5.4
#Functions can be written for tasks needed by several different programs and incorporated thusly

#5.5
#

#Problem 12
def main ():
    print("Welcome!")
    read_two()
    print("==============LINE BREAK================")
    print("Let's find the max of two numbers!")
    max(19, 40)
    print("End max function.")

def read_two():
    firstInt = int(input("Enter a number: "))
    secondInt = int(input("Enter a second number: "))
    print("User entered", firstInt, "and", secondInt)
    print("End read_two function.")

def max (firstInt, secondInt):
    if firstInt > secondInt:
        print("The larger number is: ")
        print(firstInt)
    else:
        print("The larger number is: ")
        print(secondInt)

# main()


# Problem 17/18
import math

def main_two():
    print("Welcome to Prime Check!")
    print("Primes in range are: ")
    prime_range()
    print("End Prime Check program.")

#single variable Prime checking function
def prime_check():
    numCheck = int(input("Enter a number to check if it's Prime: "))
    prime = True
    for i in range(2, numCheck):
        if numCheck % i == 0:
            prime = False

    if prime == True:
        print(numCheck, "is a Prime number.")
    else:
        print(numCheck, "is not a Prime number.")


def prime_range():
    for i in range(2, numCheck):
        if prime_check(numCheck):
            if numCheck==i:
                print(numCheck)


prime_range()
# main_two()
