create database crud_jdbc_project;

create table user
(
    password varchar(255) not null,
    id       int auto_increment
        primary key,
    username varchar(255) not null
);

