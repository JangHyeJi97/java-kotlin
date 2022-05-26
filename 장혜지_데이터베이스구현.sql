create database DBtest;

use DBtest;	

create table t_member (
	m_idx int auto_increment unique,		-- 일련번호
	m_id varchar(20) primary key, 			-- 아이디
	m_pwd varchar(20) not null, 			-- 비밀번호
	m_name varchar(10) not null, 			-- 이름
	m_date datetime default now() 			-- 가입일
);

-- 회원 15명의 정보
insert into t_member (m_id, m_pwd, m_name) 
values ('test1', '1111', '김일남');
insert into t_member (m_id, m_pwd, m_name) 
values ('test2', '1112', '김이남');
insert into t_member (m_id, m_pwd, m_name) 
values ('test3', '1113', '김삼남');
insert into t_member (m_id, m_pwd, m_name) 
values ('test4', '1114', '김사남');
insert into t_member (m_id, m_pwd, m_name) 
values ('test5', '1115', '김오남');
insert into t_member (m_id, m_pwd, m_name) 
values ('test6', '1116', '김육남');
insert into t_member (m_id, m_pwd, m_name) 
values ('test7', '1117', '김칠남');
insert into t_member (m_id, m_pwd, m_name) 
values ('test8', '1118', '김팔남');
insert into t_member (m_id, m_pwd, m_name) 
values ('test9', '1119', '김구남');
insert into t_member (m_id, m_pwd, m_name) 
values ('test10', '1120', '김일녀');
insert into t_member (m_id, m_pwd, m_name) 
values ('test11', '1121', '김이녀');
insert into t_member (m_id, m_pwd, m_name) 
values ('test12', '1122', '김삼녀');
insert into t_member (m_id, m_pwd, m_name) 
values ('test13', '1123', '김사녀');
insert into t_member (m_id, m_pwd, m_name) 
values ('test14', '1124', '김오녀');
insert into t_member (m_id, m_pwd, m_name) 
values ('test15', '1125', '김육녀');
select * from t_member;

-- 회원테이블에 회원정보 수정 프로시저 작성
drop procedure if exists sp_member_update;
delimiter $$	
create procedure sp_member_update(u_midx int, u_mdate datetime)
begin
	update t_member set m_date = u_mdate where m_idx = u_midx;
end $$
delimiter ;
call sp_member_update(1, adddate(now(), interval -1 month));
call sp_member_update(2, adddate(now(), interval -1 month));
call sp_member_update(3, adddate(now(), interval -1 month));
call sp_member_update(4, adddate(now(), interval -1 month));
call sp_member_update(5, adddate(now(), interval -1 month));
call sp_member_update(11, adddate(now(), interval 1 month));
call sp_member_update(12, adddate(now(), interval 1 month));
call sp_member_update(13, adddate(now(), interval 1 month));
call sp_member_update(14, adddate(now(), interval 1 month));
call sp_member_update(15, adddate(now(), interval 1 month));
select * from t_member;

-- 각 월별 회원 가입자 수를 구하는 쿼리 작성
select m_date, count(*)
from t_member
group by month(m_date);

-- 가장 최근 가입한 10명을 추출하는 쿼리 작성
select m_name, m_date		
from t_member order by m_date desc limit 10;

	







