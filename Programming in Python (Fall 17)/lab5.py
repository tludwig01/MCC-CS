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
# Function perform very specific tasks such that various programmers can develop different functions for one program

#5.6
#Functions have headers and block. Headers denote the beginning of the function while the block is a set of statements that belong to the funtion.

#5.7
#Calling a function is executing it.

#5.8
#At the end of a funciton, the computer returns to the part of the program that called said function.

#5.9
#Python interpreter uses indentation to determine where blocks sart and end.

#5.10
#A local variable is a variable declared inside a function. Only statements inside that function can access a local variable.

#5.11
#The part of a program in which a variable can be accessed.

#5.12
#Yes

#5.13
#Arguments

#5.14
#Parameters

#5.15
#A parameter variable's scope is the entire function where the parameter is declared

#5.16
#No

#5.17
#a. passes by keyword
#b. passes by position

#5.18
#Entire program

#5.19
#Global variables make programs tough to understand. They can be changed by any statement in the program, which can make them difficult to be aware of through many lines of code.

#5.20
#A global constant is available to every function of the program. You can use global constants. Their value remains unchanging through the whole program and can be used in any function.

#5.21
#A simple function doesn't return a value.

#5.22
#Prewritten functions perform common tasks.

#5.23
#black box describes anything that accepts input, performs some task that can't be seen, and produces output.

#5.24
#assigns random integer in range 1-100 to the variable x.

#5.25
#Prints a random integer from 1-20

#5.26
#prints random integer 10-19

#5.27
#Prints  a random float in range 0.0 up to but not including 1.0.

#5.28
#Prints random float in range 0.1-0.5

#5.29
#Uses the system time from your computer's internal clock

#5.30
#If the seed value is always the same, a function calling random numbers would always gengerate the same series of numbers.

#5.31
#Returns value back to the part of the program that called it.

#5.32
#a) do_something
#b) returns value that is twice the argument passed to it.
#c) 20

#5.33
#function that either returns True or False

#5.34
#import math

#5.35
# square_root = math.sqrt(100)

#5.36
#angle = math.radians(45)

import math

#Problem 12
def main ():
    print("Welcome!")
    read_two()
    print("==============LINE BREAK================")

def read_two():
    firstInt = int(input("Enter a number: "))
    secondInt = int(input("Enter a second number: "))
    print("User entered", firstInt, "and", secondInt)
    print("The larger number is: ", max(firstInt, secondInt))

main()


# Problem 17/1

def main_two():
    print("Welcome to Prime Check!")
    print("============================")
    prime_check()
    print("Now it's time to find primes in a given range!")
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
