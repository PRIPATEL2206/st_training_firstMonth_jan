INSERT INTO Users (username, email_id, password)
VALUES
  ('JohnDoe123', 'johndoe@example.com', 'hashData1'),
  ('JaneSmith456', 'janesmith@example.com', 'hashData2'),
  ('BobJohnson789', 'bobjohnson@example.com', 'hashData3'),
  ('EmilyDavis101', 'emilydavis@example.com', 'hashData4'),
  ('Pratik123', 'pratik@example.com', 'hashData1'),
  ('Prakash456', 'prakash@example.com', 'hashData2'),
  ('Prince789', 'prince@example.com', 'hashData3'),
  ('Kartik101', 'kartik@example.com', 'hashData4');

INSERT INTO Posts (user_id,content, media_type, media_url)
VALUES 
  (5,'This is my first post!', 'text', NULL),
  (6,'Check out this amazing photo!', 'image', 'https://example.com/images/photo1.jpg'),
  (6,'Just posted a video tutorial!', 'video', 'https://example.com/videos/tutorial.mp4'),
  (7,'Thoughts on the latest tech trends.', 'text', NULL);

INSERT INTO Friends (user_id, friend_id, status, relationship_type, best_friend)
VALUES 
  (1, 2, 'accepted', 'friend', 1),
  (2, 3, 'pending', 'friend', 0),
  (3, 1, 'accepted', 'friend', 0),
  (4, 5, 'accepted', 'friend', 1),
  (6, 7, 'pending', 'friend', 0),
  (7, 4, 'accepted', 'friend', 0);

INSERT INTO Likes (user_id, post_id)
VALUES 
  (1, 2),
  (2, 3),
  (4, 3),
  (7, 4),
  (5, 1),
  (6, 2);


INSERT INTO Notifications (user_id, content)
VALUES 
  (5, 'You have a new friend request.'),
  (6, 'Your post received a new like.'),
  (8, 'Your friend request has been accepted.'),
  (7, 'Your post received a new like.');

  
INSERT INTO Comments (post_id, user_id, content, likes)
VALUES 
  (4, 6, 'Nice post!',  2),
  (2, 7, 'Great photo!',  1),
  (3, 5, 'Interesting video!',  3),
  (4, 8, 'Thoughtful post!',0),
  (1, 5, 'Beautiful picture!', 2);