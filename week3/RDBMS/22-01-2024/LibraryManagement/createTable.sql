CREATE TABLE Genre_Table (
  genre_id INT PRIMARY KEY IDENTITY(1,1),
  name VARCHAR(250),
  description VARCHAR(250),
  books_type_avail INT,
  created_at DATETIME,
  update_time DATETIME
);

CREATE TABLE Author_Table (
  author_id INT PRIMARY KEY IDENTITY(1,1),
  author_name VARCHAR(100),
  birthday DATETIME,
  nationality VARCHAR(100),
  biography VARCHAR(1000)
);

CREATE TABLE Book_Table (
  Book_id INT PRIMARY KEY IDENTITY(1,1),
  title VARCHAR(100) NOT NULL,
  Genre_id INT,
  author_id INT,
  publication_date DATETIME,
  is_available BIT DEFAULT 1,
  quantity INT,
  FOREIGN KEY (Genre_id) REFERENCES Genre_Table(genre_id),
  FOREIGN KEY (author_id) REFERENCES Author_Table(author_id)
);

CREATE TABLE Members_Table (
  member_id INT PRIMARY KEY IDENTITY(1,1),
  member_name VARCHAR(200),
  Join_Date DATETIME,
  ending_date DATETIME,
  address VARCHAR(500),
  phone_no VARCHAR(10)
);

CREATE TABLE Loans (
  loan_id INT PRIMARY KEY IDENTITY(1,1),
  book_id INT,
  member_id INT,
  loan_date DATETIME,
  return_date DATETIME,
  FOREIGN KEY (book_id) REFERENCES Book_Table(Book_id),
  FOREIGN KEY (member_id) REFERENCES Members_Table(member_id)
);