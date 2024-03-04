INSERT INTO Book_Table ( title, Genre_id, author_id, publication_date, is_available, quantity)
VALUES
  ( 'The Great Gatsby', 1, 1, '2022-01-01', 1, 10),
  ( 'To Kill a Mockingbird', 2, 2, '2022-02-01', 1, 15),
  ( '1984', 3, 3, '2022-03-01', 1, 20),
  ( 'Pride and Prejudice', 1, 4, '2022-04-01', 1, 12),
  ( 'The Catcher in the Rye', 2, 5, '2022-05-01', 1, 8);

INSERT INTO Author_Table ( author_name, birthday, nationality, biography)
VALUES
  ('F. Scott Fitzgerald', '1896-09-24', 'American', 'F. Scott Fitzgerald was an American novelist, essayist, and short-story writer, known for his novels depicting the flamboyance and excess of the Jazz Age.'),
  ('Harper Lee', '1926-04-28', 'American', 'Harper Lee was an American novelist widely known for To Kill a Mockingbird, published in 1960. Immediately successful, it won the Pulitzer Prize and has become a classic of modern American literature.'),
  ( 'George Orwell', '1903-06-25', 'British', 'George Orwell was an English novelist, essayist, journalist, and critic. His work is characterized by lucid prose, biting social criticism, and awareness of social injustice.'),
  ('Jane Austen', '1775-12-16', 'British', 'Jane Austen was an English novelist known primarily for her six major novels, which interpret, critique, and comment upon the British landed gentry at the end of the 18th century.'),
  ( 'J.D. Salinger', '1919-01-01', 'American', 'J.D. Salinger was an American writer known for his widely read novel, The Catcher in the Rye. Following his early success publishing short stories and The Catcher in the Rye, Salinger led a very private life for more than a half-century.');

INSERT INTO Members_Table ( member_name, Join_Date, ending_date, address, phone_no)
VALUES
  ( 'John Smith', '2022-01-15', '2023-01-15', '123 Main St, Cityville', '1234567890'),
  ( 'Alice Johnson', '2022-02-20', '2023-02-20', '456 Oak St, Townsville', '9876543210'),
  ( 'Bob Williams', '2022-03-10', '2023-03-10', '789 Pine St, Villagetown', '5551112233'),
  ('Emily Davis', '2022-04-05', '2023-04-05', '101 Elm St, Hamletville', '9998887777'),
  ('David Wilson', '2022-05-12', '2023-05-12', '202 Cedar St, Countryside', '3334445555');

INSERT INTO Loans ( book_id, member_id, loan_date, return_date)
VALUES
  (2, 1, '2022-01-20', '2022-02-20'),
  (3, 2, '2022-02-25', '2022-03-25'),
  ( 4, 3, '2022-03-15', '2022-04-15'),
  ( 5, 4, '2022-04-10', '2022-05-10'),
  ( 6, 5, '2022-05-18', '2022-06-18');

INSERT INTO Genre_Table ( name, description, books_type_avail, created_at, update_time)
VALUES
  ('Fiction', 'Literary works created from the imagination, not based on real events', 3, '2022-01-01', '2022-01-15'),
  ( 'Classics', 'Books that are widely accepted as exemplary and noteworthy of their genre', 2, '2022-01-01', '2022-01-15'),
  ( 'Dystopian', 'Books set in a future society where there is great suffering or injustice', 1, '2022-01-01', '2022-01-15');