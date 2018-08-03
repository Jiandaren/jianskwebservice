CREATE USER 'jiansk'@'127.0.0.1' IDENTIFIED BY '921521';
CREATE DATABASE jiansk;
GRANT ALL ON jiansk.* TO 'jiansk'@'localhost';


drop table users;
create table users
(username varchar(32) primary key,
 password char(255));

