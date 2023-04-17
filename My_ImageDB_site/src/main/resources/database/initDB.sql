 -- Table users

create table if not exists users(
    id        bigserial     not null primary key,
    username  varchar(32)   not null,
    ipAddress varchar(1000) not null
);

 -- Table roles

create table if not exists roles(
    id        bigserial     not null primary key,
    rolename  varchar(32)   not null
);

 -- Table for mapping user and roles: user_roles

create table if not exists user_roles(
    user_id int not null,
    role_id int not null,

    foreign key (user_id) references users(id),
    foreign key (role_id) references roles(id),

    unique (user_id, role_id)
);