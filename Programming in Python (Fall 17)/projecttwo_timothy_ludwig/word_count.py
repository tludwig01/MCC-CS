#Timothy Ludwig
#Project 2 - Word Count
#CPT 101

##This program will look at all the text in a saved file.
##It will count the following and display to user:
##Total words
##Total characters
##Total sentences
##Number of unique words
##Word occurences

##NOTICE AND SEND ADVICE:
##You'll notice after my outputs, just before the goodbye message, the program displays a count for ONE whitespace. I have no idea how to get rid of it, but modified the code such that uniquewords I subtract minus one and get the appropriate amount. Any comment on this whitespace would be greatly appreciated. 

import re ##REGULAR EXPRESSION IMPORT FOR PUNCTUATION EXCEPTIONS
from collections import Counter ##COUNTER IMPORT FOR WORD OCCURENCE
##WELCOME MESSAGE AND USER FILENAME INPUT PROMPT
print("Welcome! This is my word counter program. We'll look at all the text in a file of your choosing.")

def main():
    FILE = input("Enter Filename: ")
    punc_strip(FILE)
    sentences(FILE)
    word_occurence(FILE)
##GOODBYE MESSAGE
    print("Thanks for playing. Bye!")

##FUNCTION GETTING TOTAL AMOUNT OF UNIQUE WORDS AND WORD OCCURENCE BREAKDOWN
def word_occurence(FILE):
    ##MAKES LOWERCASE, IGNORES APOSTROPHES, HYPHENS, AND MOST SPECIAL CHARACTERS, TREATING THEM LIKE WORDS
    words = re.split("[^-'@#!?$%&*()^\w]+", open(FILE).read().lower())
    counter = Counter(words)
    amount = counter.most_common() ##UNIQUE WORD COUNTER CREATES DICTIONARY
    unique = set(words)
    print("Unique words: ", len(unique) - 1) ##TOTAL UNIQUE WORDS
    print("Word occurences:")
    for i, line in amount:
        print(i, "=", line) ##WORD OCCURENCE DISPLAY

##FUNCTION STRIPPING PUNCTUATION TO COUNT WORDS AND CHARACTERS
def punc_strip(FILE):
    lines = 0
    numwords = 0
    numchars = 0
    with open(FILE, 'r') as infile:
        for line in infile:
            words = line.split()
            lines +=1
            numwords += len(words)
            numchars += len(line)
    print("Character count:", numchars) ##CHARACTER COUNTER
    print("Word count: ", numwords) ##WORD COUNTER

##FUNCTION GETTING INDIVIDUAL SENTENCES
def sentences(FILE):
    with open(FILE, 'r') as infile:
        contents = infile.read()
        print("Sentences: ", contents.count('.') + contents.count('!') + contents.count('?')) ##SENTENCE COUNTER THAT STOPS AT '.', '!', '?'...

##CALL MAIN
main()
