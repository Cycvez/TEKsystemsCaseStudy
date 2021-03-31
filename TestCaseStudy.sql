drop database if exists TestCaseStudy;

create database TestCaseStudy;

use TestCaseStudy;

create table User(
	Id int primary key auto_increment,
    f_name varchar(30) not null,
    l_name varchar(30) not null,
    email varchar (45) not null,
    Phone varchar(50) not null,
    username varchar(45) not null UNIQUE,
    `password` varchar(100) not null,
	Dob date not null,
    Created date not null	
);

create table user_friend(
	Id int primary key auto_increment,
    user_id int not null,
    reciever_id int not null,
    Created date not null,
--     1=Pending, 2=approved, 3=declined
    status ENUM('1', '2', '3') not null,
    foreign key (user_id) references User(Id),
    foreign key (reciever_id) references User(Id)
);

create table Posts(
	Id int primary key auto_increment,
    userId int not null,
    body varchar(255) not null,
    created date not null,
    foreign key (userId) references User(Id)
);

create table ToDo(
	Id int primary key auto_increment,
    userId int not null,
    body varchar(255) not null,
    created date not null,
    completed date,
    foreign key (userId) references User(Id)
);

create table income(
	Id int primary key auto_increment,
	name varchar(50) not null,
    description varchar(255),
    amount Decimal(10,2) not null,
    created date not null,
    userId int not null,
    foreign key (userId) references user(Id)	
);

create table expense(
	Id int primary key auto_increment,
	name varchar(50) not null,
    description varchar(255),
    amount Decimal(10,2) not null,
    created date not null,
    userId int not null,
    foreign key (userId) references user(Id)	
);