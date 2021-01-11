CREATE TABLE EMPLOYEE (
    ID NVARCHAR(30) PRIMARY KEY ,
    FIRST_NAME NVARCHAR(100) NOT NULL,
    LAST_NAME NVARCHAR(100) NOT NULL
);

CREATE TABLE TASK (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	TASK_CODE NVARCHAR(50) NOT NULL UNIQUE,
    NAME NVARCHAR(100) NOT NULL,
    DESCRIPTION NVARCHAR(500),
    START_DATE DATE NOT NULL,
    END_DATE DATE NOT NULL,
    MAIN_TASK_ID NVARCHAR(50) NOT NULL,
    STATUS INT DEFAULT 1,
    EMPLOYEE_ID NVARCHAR(30),
    FOREIGN KEY (EMPLOYEE_ID) references EMPLOYEE(ID)
);