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

#6.10

#6.11

#6.12

#6.13

#6.14

#6.15

#6.16

#6.17

#6.18

#6.19

#6.20

#6.21

#6.22

#################################################

def main ():

    outfile = open("golf.txt", "w")

    name = str(input("Enter player name here: "))
    score = int(input("Enter golf score here: "))

    outfile.write("Name: " + name + "\n")
    outfile.write("Score: " + str(score))

    outfile.close()
    print("Name and score added.")


# main()

def main_two():

    infile = open("golf.txt", "r")

    file_contents = infile.read()

    infile.close()

    print(file_contents)

# main_two()

########################################
import math

def stepCounter ():
    stepsFile = open("steps.txt", "r")
    stepsFile.readline()

    totalSteps = 0

    for line in range(1, 31, +1):
        print(int(stepsFile.readline()) + totalSteps)
        


    stepsFile.close()

stepCounter()
