create table if not exists users(
id bigserial primary key,
username varchar(12) not null,
address varchar(1000) not null
);