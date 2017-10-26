# Tim Ludwig
# Lab 6 - CPT 101
# 10/16/2017

#6.1
#An output file is file that data is written to.

#6.2
#An input file is a file from which data is read.

#6.3
#Open, Process, Close

#6.4
#Text file and Binary file.
#Text: contains data that has been encoded as text.
#Binary: contains data that has not been converted to text.

#6.5
#Sequential access and Direct access.
#Sequential: file read sequentially from beginning to end, cannot skip ahead.
#Direct: can jump directly to any piece of data in the file.

#6.6
#Filename extensions and file objects.

#6.7
#Everything gets deleted in that file.

#6.8
#Opening a file connects a file and a program and file object.

#6.9
#Closing a file disconnects the program from the file.

#6.10
#Read position marks the location of the next item that will be read from a file. When an input file is open its read position is initially set to the first item of the file.

#6.11
# Open file in append mode. When in append mode data is written to the end of the file's existing contents.

#6.12
# outfile = open("numbers.txt", "w")
# for num in range(1, 11):
#     outfile.write(str(num) + "\n")
# outfile.close()

#6.13
#Readline method returns an empty string when it has attempted to read beyond the end of the file.

#6.14
# infile = open("numbers.txt", "r")
# line = infile.readline()
# while line != " ":
#     print(line)
#     line = infile.readline()
# infile.close()

#6.15
# infile = open("data.txt", "r")
# for line in infile:
#     print(line)
# infile.close()

#6.16

#6.17

#6.18

#6.19

#6.20

#6.21

#6.22

#################################################

def main ():
    try:
        outfile = open("golf.txt", "a")
        name = str(input("Enter player name here: "))
        score = int(input("Enter golf score here: "))

        outfile.write("Name: " + str(name) + " ")
        outfile.write("Score: " + str(score) + " ")

        outfile.close()
        print("Name and score added.")
        main_two()
    except ValueError:
        print("Must enter valid numeric score. Player not recorded.")
        main()

def main_two():

    infile = open("golf.txt", "r")
    moreNames = "N"
    file_contents = infile.readline()

    infile.close()

    moreNames = str(input("Would you like to add more names/scores? (Y/N)"))

    if moreNames == "Y":
        main()
    else:
        print(file_contents)

# main()
########################################
import math

def stepCounter ():
    stepsFile = open("steps.txt", "r")
    stepsFile.readline()

    totalSteps = 0

    for line in stepsFile: #range(0, 31, +1):
        # print(int(stepsFile.readline()) + totalSteps)
        line = int(line.rstrip("\n"))
        totalSteps += line
        print(line)
    print("January's total steps is: ", totalSteps)




    stepsFile.close()

stepCounter()
    # count = 0
    # for line in stepsFile:
    #     steps = int(line)
    #     count = count + steps
    #     avg = count / 365
    # print(count, "steps taken this year!")
    # print("That's about", round(avg), "steps each day!")
