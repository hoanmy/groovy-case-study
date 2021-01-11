insert into EMPLOYEE(ID, FIRST_NAME, LAST_NAME) values ('E001', 'Alibaba', 'Dickson');
insert into EMPLOYEE(ID, FIRST_NAME, LAST_NAME) values ('E002', 'John', 'Samson');
insert into EMPLOYEE(ID, FIRST_NAME, LAST_NAME) values ('E003', 'Mark', 'Kent');

insert into TASK(TASK_CODE, NAME, DESCRIPTION, START_DATE, END_DATE, MAIN_TASK_ID, EMPLOYEE_ID) values ('HVDS-101', 'Create table ', 'H task urgent', DATE'2021-01-10', DATE'2021-01-11', 'HVDS-101', 'E001');
insert into TASK(TASK_CODE, NAME, DESCRIPTION, START_DATE, END_DATE, MAIN_TASK_ID) values ('HVDS-102', 'Inset data', 'H task urgent', DATE'2021-01-10', DATE'2021-01-11', 'HVDS-101');
insert into TASK(TASK_CODE, NAME, DESCRIPTION, START_DATE, END_DATE, MAIN_TASK_ID) values ('HVDS-103', 'Drop table', 'H task urgent', DATE'2021-01-10', DATE'2021-01-11', 'HVDS-101');
