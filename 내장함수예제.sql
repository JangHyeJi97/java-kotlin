-- 내장함수예제.sql

-- 문자열 관련 함수 예제
select ascii('A');								-- 65
select char_length('abcd 가나다라');				-- 9
select length('abcd 가나다라');					-- 17
select concat('ab', '가나다', 'cd');				-- ab가나다cd
select concat_ws('-', '010', '1234', '5678');	-- 010-1234-5678
select elt(2, 'ab', 'cd', 'ef');				-- cd
select field('cd', 'ab', 'cd', 'ef');			-- 2
select find_in_set('ef', 'ab,cd,ef,gh'); 		-- 3
select instr('abcdef', 'bc'); 					-- 2
select instr('abcdef', 'zz'); 					-- 0
select locate('bc', 'abcdef'); 					-- 2
select locate('zz', 'abcdef'); 					-- 0
select format(3.141592, 3); 					-- 3.142
select format(3.141592, 10); 					-- 3.1415920000
select bin(31), hex(31), oct(31); 				-- 11111 / 1F / 37
select insert('abcdefghij', 3, 4, '@#'); 		-- ab@#ghij
select left('abcdefghij', 4); 					-- abcd
select lcase('abCD가나'); 						-- abcd가나
select lpad('abcd', 7, '#'); 					-- ###abcd
select ltrim('   abc   '); 						-- abc   
select mid('abcdefg', 4, 3); 					-- def
select repeat('ab', 3); 						-- ababab
select replace('abcdefghij', 'cd', 'zz'); 		-- abzzefghij
select replace('abcdefghcd', 'cd', 'zz'); 		-- abzzefghzz
select reverse('abcde'); 						-- edcba
select right('abcdefghij', 4); 					-- ghij
select rpad('abcd', 7, '#'); 					-- abcd###
select rtrim('   abc   '); 						-- '   abc'
select concat('::', space(5), '::'); 			-- ::     ::
select substr('abcdefghij', 4, 3); 				-- def
select substring('abcdefghij', 4, 3); 			-- def
select substring_index('cafe.naver.com', '.', 2); -- cafe.naver
select substring_index('cafe.naver.com', '.', -2); -- naver.com
select trim('   abc   '); 						-- abc
select ucase('abCD가나'); 						-- ABCD가나


-- 수학 관련 함수 예제
select abs(-10); -- 10
select ceiling(3.14), ceil(3.14); -- 4 / 4
select conv('11', 16, 10); -- 17
select floor(7.8); -- 7
select mod(10, 3), mod(10.1, 3); -- 1 / 1.1
select 10 % 3, 10.1 % 3, 10 mod 3, 10.1 mod 3; -- 1 / 1.1 / 1 / 1.1
select pow(3, 4), power(3, 4); -- 81 / 81
select rand(), floor(rand() * 10); 	-- 0이상 1미만의 난수 | 0 ~ 9 사이의 난수
select round(7.8); -- 8
select sign(10), sign(0), sign(-10); -- 1 / 0 / -1
select truncate(123.456, 2), truncate(123.456, 0), truncate(123.456, -2);
 -- 123.45 / 123 / 100


-- 날짜/시간 관련 함수 예제
select adddate('2022-01-30', interval 7 day);	-- 2022-02-06
select date_add('2022-01-30', interval -7 day);	-- 2022-01-23
select adddate('2020-01-30', interval 1 month);	-- 2020-02-29
select addtime('2022-12-31 23:59:59', '1:1:1');	-- 2023-01-01 01:01:00
select addtime('23:59:59', '1:1:1');			-- 25:01:00
select addtime('2022-12-31 23:59:59', '-1:1:1');-- 2022-12-31 22:58:58
select addtime('23:59:59', '1:1');				-- 25:00:59
select addtime('23:59:59', '1');				-- 24:00:00
select subtime('2022-12-31 23:59:59', '1:1:1');	-- 2022-12-31 22:58:58
select subtime('23:59:59', '1:1:1');			-- 22:58:58
select subtime('2022-12-31 23:59:59', '-1:1:1');-- 2023-01-01 01:01:00
select subtime('23:59:59', '1:1');				-- 22:58:59 (시와 분으로 연산)
select subtime('23:59:59', '1:1');				-- 22:58:59 (하나만 있으면 초로 연산)

select curdate(), current_date(), current_date;	-- 2022-02-08 2022-02-08 2022-02-08
select curtime(), current_time(), current_time;	-- 10:50:00 10:50:00 10:50:00
select now(), sysdate(), localtime(), localtimestamp();	-- 2022-02-08 10:51:55 모두 동일

select year(now()), month(now()), day(now());		-- 2022  2  8
select hour(now()), minute(now()), second(now());	-- 10  57  44
select date(now()), time(now());			-- 2022-02-08    11:01:01
select left(now(), 10), right(now(), 8);	-- 2022-02-08    11:01:01
select datediff('2021-12-27', now()), datediff('2022-06-24', now());	-- -43   136
select timediff('23:59:59', curtime()), timediff('00:00:00', curtime());
-- 12:40:23    -11:19:36
select dayofweek(now());		-- 3
select monthname(now());		-- February
select dayofyear(now());		-- 39
select last_day(now());			-- 2022-02-28
select makedate(2022, 100);		-- 2022-04-10
select maketime(12, 34, 56);	-- 12:34:56
select period_add(202201, 8);	-- 202209
select period_diff(202312, 202202);	-- 22
select quarter(now());			-- 1
select time_to_sec('01:01:01');	-- 3661


use test;
-- 시스템 정보 함수 예제
select database(), schema();
select * from t_member_info;
select found_rows();	-- 8 (위의 select문 결과에서 레코드 개수를 출력)
select version();		-- 8.0.28

