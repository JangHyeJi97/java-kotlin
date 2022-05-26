use test2;
-- test가 있어 test2로 진행하였습니다.

-- 개인회원
create table t_member_personal (
	p_id varchar(20) primary key, 
    p_pw varchar(20) not null,
    p_name varchar(20) not null,
    p_phone varchar(13) not null,
    m_status varchar(2) not null
);
insert into t_member_personal (p_id, p_pw, p_name, p_phone, m_status) 
values ('user1', '1111', '일길동', '010-1111-1111','p');
insert into t_member_personal (p_id, p_pw, p_name, p_phone, m_status) 
values ('user2', '1111', '이길동', '010-2222-2222','p');
insert into t_member_personal (p_id, p_pw, p_name, p_phone, m_status) 
values ('user3', '1111', '삼길동', '010-3333-3333','p');
select * from t_member_personal;


 -- 기업회원
create table t_member_company (
	c_id varchar(20) primary key, 
    c_pw varchar(20) not null,
    c_name varchar(20) not null,
    c_ai_name varchar(20) not null,
    c_phone varchar(13) not null,
    m_status varchar(2) not null
);
insert into t_member_company (c_id, c_pw, c_name, c_ai_name, c_phone, m_status) 
values ('com6', '1111', '육길동컴퍼니', '육길동', '010-6666-6666','c');
insert into t_member_company (c_id, c_pw, c_name, c_ai_name, c_phone, m_status) 
values ('com7', '1111', '칠길동컴퍼니', '칠길동', '010-7777-7777','c');
insert into t_member_company (c_id, c_pw, c_name, c_ai_name, c_phone, m_status) 
values ('com8', '1111', '팔길동컴퍼니', '팔길동', '010-8888-8888','c');
select *from t_member_company;



