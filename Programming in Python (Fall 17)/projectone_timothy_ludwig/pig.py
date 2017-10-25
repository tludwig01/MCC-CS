# Project One - Python PIG
# Timothy Ludwig
# CPT 101

import random

#INITIAL GAME LOGIC SETUP
def main ():
    playerScore = 0
    compScore = 0
    #ACTIVATE RUNNING SCOREBOARD
    check_winner(playerScore, compScore)
    #INITIAL PLAYER VS. COMPUTER LOOP
    while (playerScore < 100 and compScore < 100):
        #ACTIVATE PLAYER TURN FUNCTION
        playerScore = playerScore + player_turn()
        check_winner(playerScore, compScore)
        if(playerScore < 100):
            #ACTIVATE COMPUTER TURN FUNCTION
            compScore = compScore + computer_turn()
            check_winner(playerScore, compScore)

#FUNCTION FOR HUMAN PLAYER'S TURN
def player_turn ():
    roundPoints = 0
    rollAgain = "Y"
    print("You're up, human. Let's see what you've got.")
    while rollAgain == "Y":
        playerRoll = die_roll()
        if playerRoll == 1:
            print("You rolled a 1. It's the computer's turn.")
            rollAgain = "N"
            return roundPoints
        else:
            print("You've rolled a: ", playerRoll)
            roundPoints = roundPoints + playerRoll
            print("This round you're sitting pretty at:", roundPoints)
            #HUMAN CHOICE TO CONTINUE PLAYING OR PASS
            rollAgain = input("Roll again? (Y/N)")
    print("Okay then, it's the computer's turn.")
    return roundPoints
    check_winner()

#FUNCTION FOR THE COMPUTER'S TURN
def computer_turn ():
    roundPoints = 0
    rollAgain = "Y"
    while rollAgain == "Y":
        compRoll = die_roll()
        if compRoll == 1:
            print("The computer rolled a 1. It's your turn.")
            rollAgain = "N"
            return roundPoints
        else:
            print("The computer rolled a: ", compRoll)
            roundPoints = roundPoints + compRoll
            if roundPoints <= 20:
                print("The computer's rolling again...")
            else:
                rollAgain = "N"
    print("The computer has ended its turn...")
    print("The computer's round score is: ", roundPoints)
    return roundPoints
    check_winner()

#FUNCTION FOR ROLLING THE DIE
def die_roll ():
    roll = random.randint(1,6)
    return roll

#FUNCTION CHECKING FOR A WINNER AND/OR DISPLAYING CURRENT RUNNING SCORE
def check_winner (playerScore, compScore):
    if playerScore > compScore and playerScore >= 100:
        print()
        print("Congratulations! You've won!", playerScore, "to", compScore)
        goodbye()
    elif compScore > playerScore and compScore >= 100:
        print()
        print("Look for shelter! You've lost to the machines!", compScore, "to", playerScore)
        goodbye()
    else:
        print("GAME SCORE --- Computer: ", compScore, "|| Human: ", playerScore)
        print()

#WELCOME MESSAGE, GAMEPLAY, AND USER INPUT READINESS
def hello ():
    print("Welcome to PIG. A dice game pitting human against machine in a race to 100 points! '2-6' are worth as many points and you may roll as much or as little as you want, but BEWARE: rolling a '1' forfeits your turn. Choose wisely.")
    print()
    ready = input("Are you ready to play? (Y/N)")
    if ready == "Y":
        main()
    else:
        print("Pfft! Coward.")

#GOODBYE MESSAGE
def goodbye ():
    print()
    print("Thanks for playing!")
    print()

#OPENING GREETING CALLS THE MAIN FUNCTION
hello()
