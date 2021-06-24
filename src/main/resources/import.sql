-- H2
--insert into user(id, email, first_name, last_name) values(1, 'abc@123.com', 'Bill', 'Clinton');
--insert into user(id, email, first_name, last_name) values(2, 'xyz@123.com', 'Max', 'Zhang');

-- MySQL
insert into demo.user(id, email, first_name, last_name) values(1, 'abc@123.com', 'Bill', 'Clinton');
insert into demo.user(id, email, first_name, last_name) values(2, 'xyz@123.com', 'Max', 'Zhang');

--  SQL Server
---- create table user_table (id bigint not null, email varchar(255), first_name varchar(255), last_name varchar(255), primary key (id))
--insert into user_table(id, email, first_name, last_name) values(1, 'abc@123.com', 'Bill', 'Clinton');
--insert into user_table(id, email, first_name, last_name) values(2, 'xyz@123.com', 'Max', 'Zhang');