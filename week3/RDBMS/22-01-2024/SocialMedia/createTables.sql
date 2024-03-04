CREATE TABLE Users (
  user_id INT PRIMARY KEY IDENTITY(1,1),
  username VARCHAR(50) NOT NULL,
  email_id VARCHAR(100) NOT NULL,
  password VARCHAR(255) NOT NULL,
  profile_picture VARBINARY(MAX),
  is_active BIT DEFAULT 1
);

CREATE TABLE Posts (
  post_id INT PRIMARY KEY IDENTITY(1,1),
  user_id INT NOT NULL,
  content VARCHAR(255) NOT NULL,
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  media_type VARCHAR(20),
  media_url VARCHAR(255),
  FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

CREATE TABLE Friends (
  user_id INT NOT NULL,
  friend_id INT NOT NULL,
  status VARCHAR(20) DEFAULT 'pending',
  relationship_type VARCHAR(20) DEFAULT 'friend',
  best_friend BIT DEFAULT 0,
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (user_id, friend_id),
  FOREIGN KEY (user_id) REFERENCES Users(user_id),
  FOREIGN KEY (friend_id) REFERENCES Users(user_id)
);


CREATE TABLE Likes (
  user_id INT NOT NULL,
  post_id INT NOT NULL,
  liked_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (user_id, post_id),
  FOREIGN KEY (user_id) REFERENCES Users(user_id),
  FOREIGN KEY (post_id) REFERENCES Posts(post_id)
);


CREATE TABLE Notifications (
  notification_id INT PRIMARY KEY IDENTITY(1,1),
  user_id INT NOT NULL,
  content VARCHAR(255) NOT NULL,
  isRead BIT DEFAULT 0,
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

CREATE TABLE Comments (
  comment_id INT PRIMARY KEY IDENTITY(1,1),
  post_id INT NOT NULL,
  user_id INT NOT NULL,
  content VARCHAR(500) NOT NULL,
  timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
  likes INT DEFAULT 0,
  FOREIGN KEY (post_id) REFERENCES Posts(post_id),
  FOREIGN KEY (user_id) REFERENCES Users(user_id)
);
