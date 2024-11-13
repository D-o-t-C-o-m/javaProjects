Learning java with some projects. Starting with blackjack.

Inital commit is day 1 of work on the project. The generic game is outline and it is a poor working copy of the game where it is recognizably blackjack but missing key features.

First tasks are simple things to make the game more foolproof:
  - only allowing positive integers on bets
  - only allowing integer inputs
  - limiting bids to be a max of the player "bank"
  
Next tasks are completing the game and getting it into a playable state. 
  - modify player hands into arrays
  - removing drawn cards from the 'deck'
  - Enable scoring of hands by assigning values to the cards
  - implement logic for busting
  - Make Dealer play appropriately
  - enable true win/loss state

After getting the gameplay basics sorted out there are a couple more advanced features to work through
  - Enable Splitting hands
  - Enable Doubling bet
  - Implementing logic for 'Black jack'
  - Implementing failsafes for not allowing hits on 21
  - implementing insurance
  - Implementing logic for different payout types, ie a draw is a bet returned
  - Make the opener a cool ascii image instead of a single line of text

Following getting all of the above working (Perhaps this comes before the advanced gameplay features)
  - Move all possible code out of main and into separate modules

After the game is built out and everything is containerized, I'd like to take the modules created for things like Draw, Score, Player Hand, Dealer Hand etc and create a simple card game enginer to build out other games such as War, Hearts, or Texas Hold em

