#show databases;

#use whaledb;

#show tables;

#DROP TABLE user;

#show tables;

use whaledb;
CREATE TABLE IF NOT EXISTS user(userid int(10) auto_increment not null primary key,username varchar(25),password varchar(10));

INSERT user (username,password) VALUES("admin","admin");

delete from user where userid >= 3;

select * from user;