
create database SmartHomeControlBoard
create table userData
(
username varchar(50) primary key,
password varchar(50),
email varchar(50),
[Mobile Number] int,
[Date Of Birth] date
)
create table device
(
[Device Name] varchar(50),
[Device Status] bit,
[Device ID] varchar(50) primary key,
[Port Number] int
)
create table board
(
[Board Name] varchar(50),
[Board ID] varchar(11) primary key,
)