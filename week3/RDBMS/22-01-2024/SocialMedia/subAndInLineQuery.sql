USE social_media;
--INLINE QUERY
select * from comments where user_id IN(select user_id from users where username='Prince789');
select * from posts where USER_ID IN (select user_id from users where username='Prince789');
select COUNT(1) AS Likes from likes where post_id IN (select post_id from posts where post_id=2);

-- SUBQUERY
select *,(select content from posts where post_id = comments.post_id) from comments;
select *,(select count(1) from likes where post_id = posts.post_id) from posts;
select username,(select count(1) from posts where user_id = users.user_id)PostCount from users;
