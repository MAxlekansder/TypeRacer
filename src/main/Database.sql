create database if not exists TypeRacer;

create table if not exists TypeRacer.User (
    PlayerId INT not null primary key auto_increment,
    PlayerName varchar(100) not null,
    RegistrationDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     ChangeDate TIMESTAMP NOT NULL
                           DEFAULT CURRENT_TIMESTAMP 
                           ON UPDATE CURRENT_TIMESTAMP,
   ChangeDateTime TIMESTAMP NOT NULL
                           DEFAULT CURRENT_TIMESTAMP 
                           ON UPDATE CURRENT_TIMESTAMP

);


create table if not exists TypeRacer.SentenceGenerator (
    GeneratorId INT not null primary key auto_increment,
    SentenceName varchar(255) not null

);

