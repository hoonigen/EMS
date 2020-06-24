use spring_boot;
drop table user;
create table user(
username varchar(20) not null,
password varchar(20) not null,
role varchar(20) not null,
status varchar(15) not null,
CONSTRAINT username_pk primary key(username)
);
insert into user values("nidhin","nidhin#1996","admin","active");
insert into user values("john","john@369","operator","active");
insert into user values("jacob","jacob#619","view","active");
insert into user values("aloshi","aloshi@2010","operator","active");
insert into user values("ivan","ivan#1995","admin","active");
commit;