USE library_management;
--INLINE QUERY
select * from book_table where genre_id in (select genre_id from genre_table where name='Fiction')
select * from book_table where author_id in (select author_id from author_table where author_name='Harper Lee')
select name from genre_table where genre_id in (select genre_id from book_table where book_id in(select MAX(book_id) from Loans ));

-- SUBQUERY
select *,(select title from book_table where book_id = loans.book_id)BookName from loans;
select *,(select name from genre_table where genre_id = book_table.genre_id)Genre from book_table;
select *,(select COUNT(1) from loans where member_id = members_table.member_id)Count from members_table;
