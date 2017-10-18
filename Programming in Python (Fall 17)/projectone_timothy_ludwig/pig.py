# Project One - Python PIG
# Timothy Ludwig
# CPT 101

import random

def main ():
    playerScore = 0
    compScore = 0
    #ACTIVATE RUNNING SCOREBOARD
    check_winner(playerScore, compScore)
    #INITIAL PLAYER VS. COMPUTER LOOP
    while (playerScore < 100 and compScore < 100):
        #ACTIVATE PLAYER TURN FUNCTION FIRST
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
    print("It's your turn, human! Let's see what you've got...")
    while rollAgain == "Y":
        playerRoll = die_roll()
        if playerRoll == 1:
            print("Too bad, that's a bust! It's the computer's turn.")
            print("===============================")
            rollAgain = "N"
            return roundPoints
        else:
            print("You've rolled a: ", playerRoll)
            roundPoints = roundPoints + playerRoll
            print("This round you're sitting pretty at:", roundPoints)
            print("================================")
            #HUMAN CHOICE TO CONTINUE PLAYING OR PASS
            rollAgain = input("Take a risk, roll again? (Y/N)")
    print("=============================")
    print("Okay then, it's the computer's turn.")
    print("=============================")
    return roundPoints

#FUNCTION FOR THE COMPUTER'S TURN
def computer_turn ():
    roundPoints = 0
    rollAgain = "Y"
    while rollAgain == "Y":
        compRoll = die_roll()
        if compRoll == 1:
            print("The computer busted!")
            print("========================")
            rollAgain = "N"
            return roundPoints
        else:
            print("The computer rolled a: ", compRoll)
            roundPoints = roundPoints + compRoll
            if roundPoints <= 20:
                print("The computer's rolling again...")
            else:
                rollAgain = "N"
    print("================================")
    print("The computer has ended its turn...")
    print("The computer's round score is: ", roundPoints)
    print("================================")
    return roundPoints

#FUNCTION FOR ROLLING THE DIE
def die_roll ():
    roll = random.randint(1,6)
    return roll

#FUNCTION CHECKING FOR A WINNER OR DISPLAYING CURRENT SCORE
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
        print("===================================")

#WELCOME MESSAGE AND GAMEPLAY, USER INPUT READINESS
def hello ():
    ready = False
    print("Welcome to PIG. A dice game pitting human against machine in a race to 100 points! '2-6' are worth as many points and you may roll as much or as little as you want, but BEWARE: rolling a '1' forfeits your turn. Choose wisely.")
    print("========================================")
    ready = input("Are you ready to play? (Y/N)")
    if ready == "Y":
        ready = True
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
