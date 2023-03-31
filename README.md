# war-card-game
This project contains the implementation of a simple card game called "War". The project includes three classes: "Deck", "NotAvailableException", and "WarGame" and a main class called "Play".

The "Deck" class represents a deck of cards, with methods to add, delete, sort, and shuffle cards. It also has a toString() method to display the deck.

The "NotAvailableException" class is a custom exception that is thrown when a card is added to a deck but is already in the deck.

The "WarGame" class is responsible for creating and managing the game. It contains methods to create the deck, deal cards, and play the game. The game is played between four players, and the winner is the one who has all the cards at the end.

The "Play" class is the main class that runs the game. It creates a WarGame object and runs it 10 times, storing the number of moves required to finish each game in an array. It then calculates the minimum, maximum, and mean number of moves required to win the game and prints the results.

To run the game, simply execute the "Play" class.
