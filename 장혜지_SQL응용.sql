create database library;

use library;

-- 1.고객 테이블 작성 - 컬럼 : 고객 아이디, 이름, 전화번호
create table lib_member (
    m_id varchar(20) primary key,			-- 고객 아이디
    m_name varchar(10) not null,			-- 고객 이름
    m_phone char(13) not null				-- 고객 전화번호
);
insert into lib_member (m_id, m_name, m_phone) values ('test1', '일길동', '010-1111-1111');
insert into lib_member (m_id, m_name, m_phone) values ('test2', '이길동', '010-2222-2222');
insert into lib_member (m_id, m_name, m_phone) values ('test3', '삼길동', '010-3333-3333');
insert into lib_member (m_id, m_name, m_phone) values ('test4', '사길동', '010-4444-4444');
insert into lib_member (m_id, m_name, m_phone) values ('test5', '오길동', '010-5555-5555');
insert into lib_member (m_id, m_name, m_phone) values ('test6', '육길동', '010-6666-6666');
insert into lib_member (m_id, m_name, m_phone) values ('test7', '칠길동', '010-7777-7777');
insert into lib_member (m_id, m_name, m_phone) values ('test8', '팔길동', '010-8888-8888');
insert into lib_member (m_id, m_name, m_phone) values ('test9', '구길동', '010-9999-9999');
select * from lib_member;

-- 2.도서정보 테이블 작성 - 컬럼 : 도서 아이디, 도서명, ISBN
create table lib_book (
    b_id varchar(10) primary key,			-- 도서 아이디
    b_name varchar(15) not null,			-- 도서 이름
    b_isbn char(6) not null					-- 도서 ISBN
);
insert into lib_book (b_id, b_name, b_isbn) values ('book1', '책1', 'AAA001');
insert into lib_book (b_id, b_name, b_isbn) values ('book2', '책2', 'AAA002');
insert into lib_book (b_id, b_name, b_isbn) values ('book3', '책3', 'AAA003');
insert into lib_book (b_id, b_name, b_isbn) values ('book4', '책4', 'AAA004');
insert into lib_book (b_id, b_name, b_isbn) values ('book5', '책5', 'AAA005');
insert into lib_book (b_id, b_name, b_isbn) values ('book6', '책6', 'AAA006');
insert into lib_book (b_id, b_name, b_isbn) values ('book7', '책7', 'AAA007');
insert into lib_book (b_id, b_name, b_isbn) values ('book8', '책8', 'AAA008');
insert into lib_book (b_id, b_name, b_isbn) values ('book9', '책9', 'AAA009');
insert into lib_book (b_id, b_name, b_isbn) values ('book10', '책10', 'AAA010');
insert into lib_book (b_id, b_name, b_isbn) values ('book11', '책11', 'AAA011');
insert into lib_book (b_id, b_name, b_isbn) values ('book12', '책13', 'AAA012');
insert into lib_book (b_id, b_name, b_isbn) values ('book13', '책13', 'AAA013');
select * from lib_book;

-- 3.대여정보 테이블 작성 - 컬럼 : 일련번호, 기타 적절한 컬럼을 배치 
-- 각 테이블 별로 필요한 제약사향 입력 
create table lib_rent (
	r_idx int auto_increment primary key,	-- 대여 일련번호
	m_id varchar(20) not null,				-- 고객 아이디
    m_name varchar(10) not null,			-- 고객 이름
	m_phone char(13) not null,				-- 고객 전화번호
    b_id varchar(20) not null,				-- 도서 아이디
    b_name varchar(10) not null,			-- 도서 이름
    b_isbn char(13) not null,				-- 도서 ISBN
    r_date datetime default now(),			-- 대여일
    constraint fk_lib_rent_r_idx foreign key (m_id) references lib_member(m_id)
);
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test1', '일길동', '010-1111-1111', 'book1', '책1', 'AAA001');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test2', '이길동', '010-2222-2222', 'book2', '책2', 'AAA002');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test3', '삼길동', '010-3333-3333', 'book3', '책3', 'AAA003');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test4', '사길동', '010-4444-4444', 'book4', '책4', 'AAA004');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test5', '오길동', '010-5555-5555', 'book5', '책5', 'AAA005');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test6', '육길동', '010-6666-6666', 'book6', '책6', 'AAA006');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test7', '칠길동', '010-7777-7777', 'book7', '책7', 'AAA007');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test8', '팔길동', '010-8888-8888', 'book8', '책8', 'AAA008');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test9', '구길동', '010-9999-9999', 'book9', '책9', 'AAA009');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test1', '일길동', '010-1111-1111', 'book10', '책10', 'AAA010');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test2', '이길동', '010-2222-2222', 'book11', '책11', 'AAA011');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test3', '삼길동', '010-3333-3333', 'book12', '책12', 'AAA012');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test4', '사길동', '010-4444-4444', 'book13', '책13', 'AAA013');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test5', '오길동', '010-5555-5555', 'book1', '책1', 'AAA001');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test6', '육길동', '010-6666-6666', 'book2', '책2', 'AAA002');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test7', '칠길동', '010-7777-7777', 'book3', '책3', 'AAA003');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test8', '팔길동', '010-8888-8888', 'book4', '책4', 'AAA004');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test9', '구길동', '010-9999-9999', 'book5', '책5', 'AAA005');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test1', '일길동', '010-1111-1111', 'book6', '책6', 'AAA006');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test2', '이길동', '010-2222-2222', 'book7', '책7', 'AAA007');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test3', '삼길동', '010-3333-3333', 'book8', '책8', 'AAA008');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test4', '사길동', '010-4444-4444', 'book9', '책9', 'AAA009');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test5', '오길동', '010-5555-5555', 'book10', '책10', 'AAA010');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test6', '육길동', '010-6666-6666', 'book1', '책1', 'AAA001');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test7', '칠길동', '010-7777-7777', 'book2', '책2', 'AAA002');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test8', '팔길동', '010-8888-8888', 'book3', '책3', 'AAA003');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test9', '구길동', '010-9999-9999', 'book4', '책4', 'AAA004');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test1', '일길동', '010-1111-1111', 'book5', '책5', 'AAA005');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test2', '이길동', '010-2222-2222', 'book1', '책1', 'AAA001');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test3', '삼길동', '010-3333-3333', 'book2', '책2', 'AAA002');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test4', '사길동', '010-4444-4444', 'book3', '책3', 'AAA003');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test5', '오길동', '010-5555-5555', 'book1', '책1', 'AAA001');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test6', '육길동', '010-6666-6666', 'book2', '책2', 'AAA002');
insert into lib_rent (m_id, m_name, m_phone, b_id, b_name, b_isbn) values ('test7', '칠길동', '010-7777-7777', 'book1', '책1', 'AAA001');
select * from lib_rent;


-- 5. 각 월별 도서대여 건수를 구하는 쿼리 작성
-- 해당연월과 대여 건수를 출력
select left(r_date, 7), count(r_idx) 
from lib_rent
group by left(r_date, 7);


-- 6. 각 도서별 대여순위 상위 10권을 구하는 쿼리작성
select b_id, count(b_id) from lib_rent 
group by b_id
having count(b_id) >= 1
limit 10;



