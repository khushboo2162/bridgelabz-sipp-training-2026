create database covid_db;
SHOW DATABASES;
use covid_db;
create table covid_cases (
      id int  auto_increment  primary key ,
       country varchar(100),
       state varchar(100),
        confirmed int ,
        recovered int ,
        death int ,
         report_date date );
         
       
show tables ;
 describe covid_cases;
 
INSERT INTO covid_cases
(country, confirmed, recovered, death, report_date)
VALUES
('India', 100, 50, 2, '2020-03-15');


 update covid_cases  set confirmed= 120 where country ='india' and report_date ='2020-03-15';
 SET SQL_SAFE_UPDATES = 0;
DELETE FROM covid_cases
WHERE state = 'IN';
ALTER TABLE covid_cases
ADD vaccination_rate FLOAT;
 SELECT * FROM covid_cases;
    
 