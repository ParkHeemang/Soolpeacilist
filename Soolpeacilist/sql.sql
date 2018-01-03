delete from members

create table members(ID varchar2(20) primary key not null,PW varchar2(20) not null, Nickname varchar2(20) not null, type varchar2(20) default 0)


create table product_(product_no varchar2(20) primary key not null, product_name varchar2(20), alcohol number(10), price number(10), volume number(10))



<!-- create table fore(product_no varchar2(20) REFERENCES product_(product_no)); -->


create table al_list_(Sequence_no number(10) primary key not null, product_no varchar2(20) references product_(product_no), member_id varchar2(20) references members(ID), score varchar2(20) default 0, time varchar2(20) not null);


insert into members values('Park', '1234','Park','AAAA');



<!-- 데이터 삭제 -->
select * from product_

<!-- 테이블 삭제 -->
drop table product_


