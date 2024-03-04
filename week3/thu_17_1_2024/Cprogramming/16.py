class Movie:
    def __init__(self, title, duration):
        self.title = title
        self.duration = duration

class Theater:
    def __init__(self, name, capacity):
        self.name = name
        self.capacity = capacity
        self.booked_seats = []

class BookingSystem:
    def __init__(self):
        self.movies = []
        self.theaters = []

    def add_movie(self, title, duration):
        new_movie = Movie(title, duration)
        self.movies.append(new_movie)
        print(f"Movie '{title}' added successfully.")

    def add_theater(self, name, capacity):
        new_theater = Theater(name, capacity)
        self.theaters.append(new_theater)
        print(f"Theater '{name}' added successfully.")

    def display_movies(self):
        print("Available Movies:")
        for movie in self.movies:
            print(f"- {movie.title} ({movie.duration} minutes)")

    def display_theaters(self):
        print("Available Theaters:")
        for theater in self.theaters:
            available_seats = theater.capacity - len(theater.booked_seats)
            print(f"- {theater.name} ({available_seats} seats available)")

    def book_ticket(self, movie_title, theater_name, num_tickets):
        movie = next((m for m in self.movies if m.title == movie_title), None)
        theater = next((t for t in self.theaters if t.name == theater_name), None)

        if movie and theater:
            available_seats = theater.capacity - len(theater.booked_seats)

            if num_tickets <= available_seats:
                theater.booked_seats.extend([None] * num_tickets)
                print(f"Successfully booked {num_tickets} tickets for '{movie_title}' at '{theater_name}'.")
            else:
                print(f"Not enough seats available at '{theater_name}' for {num_tickets} tickets.")
        else:
            print("Movie or theater not found.")

booking_system = BookingSystem()

booking_system.add_movie("Inception", 150)
booking_system.add_movie("The Dark Knight", 152)

booking_system.add_theater("City Cinema", 50)
booking_system.add_theater("Star Theater", 40)

while True:
    print("\n1. Display Movies\n2. Display Theaters\n3. Book Ticket\n4. Exit")
    choice = input("Enter your choice (1-4): ")

    if choice == '1':
        booking_system.display_movies()
    elif choice == '2':
        booking_system.display_theaters()
    elif choice == '3':
        movie_title = input("Enter movie title: ")
        theater_name = input("Enter theater name: ")
        num_tickets = int(input("Enter number of tickets: "))
        booking_system.book_ticket(movie_title, theater_name, num_tickets)
    elif choice == '4':
        print("Exiting the booking system. Goodbye!")
        break
    else:
        print("Invalid choice. Please enter a number between 1 and 4.")