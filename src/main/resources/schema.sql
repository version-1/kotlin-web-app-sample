create table if  not exists users (
  id int primary key,
  name varchar(255),
  age int,
  sex tinyint
);

delete from users;
insert into users
VALUES( 1 , 'John' , 26 , 1),
( 2 , 'Bob' , 40 , 1),
( 3 , 'Michael' , 20 , 1),
( 4 , 'Mary' , 30 , 0);