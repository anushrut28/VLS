-- Creation of database user and granting all permissions to the user 

CREATE DATABASE VLS;
-- DROP DATABASE VLS;
CREATE USER 'VLS'@'localhost' IDENTIFIED BY 'VLS';
-- DROP USER 'VLS'@'localhost';
GRANT ALL ON MLP343.* TO 'VLS'@'localhost';
USE VLS;

-- Creation of learner table

CREATE TABLE LEARNER (
                        LEARNERID INT PRIMARY KEY,
                        FIRST_NAME VARCHAR(25) NOT NULL,
                        DATE_OF_BIRTH DATE NOT NULL,
                        EMAIL VARCHAR(25)
                    );

-- Creation of QUORA table which referers to the learner table.
CREATE TABLE QUORA (
                        QUESTION_ID INT PRIMARY KEY, 
                        LEARNERID INT,
                        QUESTION varchar(200) unique,
                        ASKED_BY varchar(25) not null,
                        ASKED_ON date DEFAULT (CURRENT_DATE),
                        ANSWER varchar(200) DEFAULT NULL,
                        ANSWERED_BY varchar(25) DEFAULT NULL,
                        ANSWERED_ON date DEFAULT NULL,
                        FOREIGN KEY (LEARNERID) REFERENCES LEARNER(LEARNERID)
                    );

-- insertions into learner table

INSERT INTO LEARNER VALUES  (1,"Joseph", "1989-02-27", "jhones.cherry@gmail.com"),
                            (2,"Nick","2000-01-08","nickdavis@gmail.com"),
                            (3,"Grace","1996-06-14","gracemostel@outlook.com"),
                            (4,"Fred","2000-07-20","fredtorn@gmail.com"),
                            (5,"Elvis","1992-06-13","elvis.marx@gmail.com");

-- insertions into qoura table

insert into QUORA values (1, 1, "what is export default variable_name mean", "Joseph", "2021-03-05","it's used to export defaulty in angular","Nick", "2021-03-07"),
						 (2, 5, "can we have a drop down list in Html", "Elvis", "2021-03-06","Yes, we can by using select and optiona together", "Akhil", "2021-03-10"),
						 (3, 3, "for what purpose *ng is used for", "Grace", "2021-03-25","it's used to iterate through the object to retrive the values","Smith", curdate()),
						 (4, 5, "when is ngOnInit()", "Elvis", "2021-04-05","This hook gets called once, after the ngOnChanges hook.","Jordon", curdate());