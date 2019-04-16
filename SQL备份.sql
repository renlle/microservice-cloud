CREATE TABLE dept(
	dept_no BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	dept_name VARCHAR(60),
	db_source VARCHAR(60)
);

INSERT INTO dept (dept_name,db_source) VALUES('开发部',DATABASE());
INSERT INTO dept (dept_name,db_source) VALUES('人事部',DATABASE());
INSERT INTO dept (dept_name,db_source) VALUES('财务部',DATABASE());
INSERT INTO dept (dept_name,db_source) VALUES('市场部',DATABASE());
INSERT INTO dept (dept_name,db_source) VALUES('运维部',DATABASE());

SELECT * FROM dept;