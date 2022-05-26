-- world쿼리.sql (world db를 이용한 쿼리 작업 예제 파일)
use world;
select * from city;
select * from country;

-- 인구수가 500만에서 1000만 사이인 도시들의 데이터 추출
select * from city where Population between 5000000 and 10000000;
select * from city where Population >= 5000000 and Population <= 10000000;

-- city테이블에서 나라코드를 출력하는데 중복되는 값이 없도록 출력 : 알파벳 역순을 정렬
select distinct CountryCode from city order by CountryCode desc;

-- city테이블에서 나라별 코드와 도시들의 전체 인구수와 평균 인구수, 도시의 개수를 출력
select CountryCode, sum(Population), avg(Population), count(Name) 
from city 
group by CountryCode;

-- 위의 쿼리를 이용하여 인구 수가 100만이 넘는 도시들만으로 쿼리를 작업
select CountryCode, sum(Population), avg(Population), count(Name) 
from city where Population >= 1000000 group by CountryCode;

-- 위의 쿼리를 이용하여 평균 인구 수가 50만이 넘는 나라들만 출력
select CountryCode, sum(Population) total, 
	avg(Population) average, count(Name) cnt 
from city group by CountryCode having average >= 500000;

-- 인구수가 500만 이상인 도시들 중 1000만 이상인 도시는 '거대도시', 
-- 800만 이상인 도시는 '대도시', 나머지는 '도시'로 출력(나라코드, 도시명, 인구수, 도시종류)
select CountryCode, Name, Population, 
	if(Population >= 10000000, '거대도시', 
	if(Population >= 8000000, '대도시', '도시')) kind 
from City where Population >= 5000000;

-- 목록에 관련 도시에 해당하는 레코드들을 출력(목록 : Seoul, Pusan, Inchon, Suwon)
-- 우리나라 도시들 중 목록에 해당하는 도시들의 레코드들을 출력
select * from city where CountryCode = 'kor' and 
-- Name in ('Seoul', 'Pusan', 'Inchon', 'Suwon');
(Name = 'Seoul' or Name = 'Pusan' or Name = 'Inchon' or Name = 'Suwon');

-- 우리나라 도시들 중 목록에 없는 도시들의 레코드들을 출력
select * from city where CountryCode = 'kor' and 
-- Name not in ('Seoul', 'Pusan', 'Inchon', 'Suwon');
-- Name <> 'Seoul' and Name <> 'Pusan' and Name <> 'Inchon' and Name <> 'Suwon'
not(Name = 'Seoul' or Name = 'Pusan' or Name = 'Inchon' or Name = 'Suwon');

-- 서브쿼리를 이용한 in, not in 연산
-- 도시이름들 중 'z'로 시작하는 도시들을 모두 출력
select * from city where name in 
	(select name from city where name like 'z%');
-- 도시이름들 중 'z'로 시작하지 않는 도시들을 모두 출력
select * from city where name not in 
	(select name from city where name like 'z%');


-- 조인
select * from city a inner join country b on a.countrycode = b.code 
where a.CountryCode = 'kor' and a.name like 's%';

select * from city a, country b 
where a.countrycode = b.code and a.CountryCode = 'kor' and a.name like 's%';

-- 미국의 도시들 중 인구가 100만이 넘는 도시들의 나라명, 도시명, 대륙, GNP, 인구를 출력
select b.name, a.name, b.continent, b.gnp, a.population 
from city a inner join country b on a.countrycode = b.code 
where b.code = 'usa' and a.population >= 1000000;

select * from city;
select * from country;
select * from countrylanguage;
-- 각 나라별 나라명, 모든 도시의 인구 합, 공식 언어를 출력(총 인구가 3천만 이상인 나라만 출력)
select b.name, sum(a.population) total, c.language 
from city a, country b, countrylanguage c 
where a.countrycode = b.code and c.countrycode = b.code and c.isofficial = 'T' 
group by b.code having total >= 30000000 order by b.name;

-- union으로 도시ID, 도시명, 국가코드와 국가코드, 언어, 공식언어여부를 합치는 쿼리 작성
select id, name, countrycode from city where countrycode = 'kor'
union
select countrycode, language, isofficial from countrylanguage 
where countrycode = 'kor';


