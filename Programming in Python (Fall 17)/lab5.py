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

main()


# Problem 17/18
import math

def main_two():
    print("Welcome to Prime Check!")
    print("============================")
    prime_check()
    print("Now it's time to fnid primes in a given range!")
    print("============================")
    prime_range()

#single variable Prime checking function
def prime_check():
    numCheck = int(input("Enter a number to check if it's Prime: "))
    prime = True
    for i in range(2, numCheck):
        if numCheck % i == 0:
            prime = False
            print(numCheck, "is not a Prime number.")


    if prime == True:
        print(numCheck, "is a Prime number.")
    else:
        print(numCheck, "is not a Prime number.")

#User input prime range function
def prime_range():

    startValue = int(input("Enter a number greater than 1: "))
    endValue = int(input("Enter another number greater than the first: "))

    print("Primes between", startValue, "and", endValue, "are: ")

    for num in range(startValue, endValue):
        if num > 1:
            for i in range(2, num):
                if num % i == 0:
                    break
            else:
                print(num)

main_two()
