use test;

create table cursor_test (
	c1 int auto_increment primary key, 
    c2 int default 0, 
    c3 varchar(20)
);
insert into cursor_test (c2, c3) values (11, 'test1');
insert into cursor_test (c2, c3) values (22, 'test2');
insert into cursor_test (c2, c3) values (33, 'test3');
select * from cursor_test;
select last_insert_id();	-- 최근 입력된 auto_increment 값 리턴

drop procedure sp_cursor_test;
delimiter $$
create procedure sp_cursor_test()
begin
	declare cid int default 0;				-- 커서에서 추출한 값을 저장하기 위한 변수
	declare end_row boolean default false;	-- 커서가 끝까지 루프를 돌았는지 판단할 변수
	declare record_set cursor for select c1 from cursor_test;
	-- 지정된 select문으로 record_set이라는 커서를 생성
	declare continue handler for not found set end_row = true;
	-- 커서의 끝까지 루프를 돌면 end_row 변수의 값을 true로 변경

	open record_set;		-- record_set이라는 커서를 사용하기 위해 열어줌
	lblLoop:while true do	-- 따로 조건없이 무한 루프로 돌게 함
		fetch record_set into cid;	-- 커서에 들어있는 c1데이터를 지정한 변수 cid에 저장
		if end_row then		-- 커서의 끝까지 루프를 돌았으면
			leave lblLoop;	-- 지정한 레이블(lblLoop)의 루프문을 빠져나감
		end if;	-- 빠져나가는 if문은 fetch와 실행문 사이에 있어야 함
		update cursor_test set c2 = c2 + cid where c1 = cid;
	end while;
	close record_set;		-- 열었던 커서는 닫아줌
end $$
delimiter ;
call sp_cursor_test();
select * from cursor_test;


-- c1의 값이 홀수이면 c2의 값을 5감소, 짝수이면 5증가 시키는 sp_cursor_test2 프로시저 작성
drop procedure sp_cursor_test2;
delimiter $$
create procedure sp_cursor_test2()
begin
	declare cid int default 0;
	declare end_row boolean default false;
	declare record_set cursor for select c1 from cursor_test;
	declare continue handler for not found set end_row = true;

	open record_set;
	lblLoop:while true do
		fetch record_set into cid;
		if end_row then
			leave lblLoop;
		end if;

		if cid % 2 = 0 then
			update cursor_test set c2 = c2 + 5 where c1 = cid;
		else
			update cursor_test set c2 = c2 - 5 where c1 = cid;
		end if;
	end while;
	close record_set;
end $$
delimiter ;
call sp_cursor_test2();
select * from cursor_test;

-- cursor_test 테이블의 모든 데이터를 받아와 c1이나 c2의 값이 10의 배수이면 해당 값들(c1, c2)로 c2와 c3 컬럼에
-- 값을 넣어 insert를 하고, c1과 c2의 값 모두가 홀수이면 해당 레코드의 c2값을 0으로 변경하는 update 실행
drop procedure sp_cursor_test3;
delimiter $$
create procedure sp_cursor_test3()
begin
	declare cc1 int default 0;
	declare cc2 int default 0;
	declare cc3 varchar(20) default '';
	declare end_row boolean default false;
	declare record_set cursor for select * from cursor_test;
	declare continue handler for not found set end_row = true;

	open record_set;
	lblLoop:while true do
		fetch record_set into cc1, cc2, cc3;
        -- select문으로 가져온 컬럼들의 순서와 저장할 변수의 순서를 맞춰서 대입시킴
		if end_row then
			leave lblLoop;
		end if;

		-- c1이나 c2의 값이 10의 배수이면 해당 값들(c1, c2)로 c2와 c3 컬럼에 값을 넣어 insert
        if cc1 % 10 = 0 or cc2 % 10 = 0 then
			insert into cursor_test(c2, c3) values (cc1, cc2);
        end if;

        -- c1과 c2의 값 모두가 홀수이면 해당 레코드의 c2값을 0으로 변경하는 update
        if cc1 % 2 = 1 and cc2 % 2 = 1 then
			update cursor_test set c2 = 0 where c1 = cc1;
        end if;
	end while;
	close record_set;
end $$
delimiter ;
call sp_cursor_test3();
select * from cursor_test;


-- 임시 테이블 : 잠시 동안만 사용하는 테이블로 서비스가 종료되거나 workbench가 종료되면 테이블도 사라짐(뷰와는 무관)
create temporary table tmp_test (
	c1 int auto_increment primary key, 
    c2 varchar(20) not null, 
    c3 datetime default now()
);
insert into tmp_test (c2) values ('test1');
insert into tmp_test (c2) values ('test2');
insert into tmp_test (c2) values ('test3');
insert into tmp_test (c2) values ('test4');
select * from tmp_test;








