class Player:
    def __init__(self, name):
        self.name = name
        self.score = 0

class Game:
    def __init__(self, players):
        self.players = players
        self.current_turn = 0

    def display_scoreboard(self):
        print("Scoreboard:")
        for player in self.players:
            print(f"{player.name}: {player.score}")

    def play_turn(self):
        current_player = self.players[self.current_turn]
        print(f"\nIt's {current_player.name}'s turn.")
        command = input("Enter your command: ")

        current_player.score += 1

        self.display_scoreboard()

        self.current_turn = (self.current_turn + 1) % len(self.players)

num_players = int(input("Enter the number of players: "))
players = [Player(input(f"Enter Player {i + 1}'s name: ")) for i in range(num_players)]

game = Game(players)

while True:
    game.play_turn()
    play_again = input("Do you want to play another turn? (yes/no): ").lower()
    if play_again != 'yes':
        print("Exiting the game. Final scores:")
        game.display_scoreboard()
        break

