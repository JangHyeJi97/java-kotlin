create database SQLtest;

use SQLtest;

-- 1.회원 테이블(t_member) 작성
create table t_member (
	m_id varchar(20) primary key, 			-- 아이디
	m_pwd varchar(20) not null, 			-- 비밀번호
	m_name varchar(10) not null, 			-- 이름
    m_phone char(13) not null,				-- 전화번호
	m_date datetime default now() 			-- 가입일
);

-- 2. 회원테이블에 회원가입 프로시저(sp_member_in)작성
drop procedure if exists sp_member_in;
delimiter $$
create procedure sp_member_in(mid varchar(20), 	mpwd varchar(20), 
	mname varchar(20), mphone varchar(13), mdate datetime)
begin
	insert into t_member (m_id, m_pwd, m_name, m_phone, m_date) 
	values (mid, mpwd, mname, mphone, mdate);
end $$
delimiter ;
call sp_member_in('test1', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test2', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test3', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test4', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test5', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test6', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test7', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test8', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test9', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test10', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test11', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test12', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test13', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test14', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test15', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test16', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test17', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test18', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test19', '1111', '홍길동', '010-9876-5435', now());
call sp_member_in('test20', '1111', '홍길동', '010-9876-5435', now());
select * from t_member;

-- 3. 회원테이블에 회원정보 수정 프로시저(sp_member_up)작성
drop procedure if exists sp_member_up;
delimiter $$	
create procedure sp_member_up(u_mid varchar(20), u_mdate datetime)
begin
	update t_member set m_date = u_mdate where m_id = u_mid;
end $$
delimiter ;
call sp_member_up('test1', adddate(now(), interval -1 month));
select * from t_member;


-- 4. 각 월별 회원가입 수를 구하는 쿼리 작성
select left (m_date, 7), count(*)
from t_member
group by month(m_date);

-- 5. 가장 최근 가입한 회원 10명의 정보를 출력하는 쿼리 작성
select m_name, m_date, m_id, m_pwd, m_phone
from t_member order by m_date desc limit 10;