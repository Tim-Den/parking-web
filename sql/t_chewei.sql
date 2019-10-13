CREATE TABLE t_chewei(
	id INT not null AUTO_INCREMENT,
	hao VARCHAR(20) NOT NULL,
	info VARCHAR(20) NOT NULL,
	quyu VARCHAR(20) NOT NULL,
	chepai VARCHAR(20),
	adate VARCHAR(20),
	PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into t_chewei values(id=1, hao='A12', info='A12', quyu='A区', chepai='皖HK1068', adate='2019-10-12')