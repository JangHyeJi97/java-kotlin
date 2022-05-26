use test;

-- 회원 기본 정보 목록(아이디, 암호, 이름, 전화, 포인트, 기본주소)
create view v_member_info as 
	select a.mi_id, a.mi_pw, a.mi_name, a.mi_phone, a.mi_point, b.ma_zip, b.ma_addr1, b.ma_addr2 
	from t_member_info a, t_member_addr b 
	where a.mi_id = b.mi_id and b.ma_basic = 'y' order by a.mi_id;
select * from v_member_info;

-- 회원별 구매액 목록(아이디, 이름, 총 구매액, 구매횟수) : v_member_order_list
-- 구매기록이 없어도 회원정보를 보여주는 목록으로 생성
create view v_member_order_list as 
	select a.mi_id, a.mi_name, ifnull(sum(b.oi_pay), 0) total, count(b.oi_id) cnt
	from t_member_info a left join t_order_info b on a.mi_id = b.oi_buyer 
	group by a.mi_id, a.mi_name;
select * from v_member_order_list;

-- 분류, 브랜드별 상품목록 : v_product_list
-- 상품ID, 대분류ID/명, 소분류ID/명, 브랜드명, 상품명, 단가, 할인율
create view v_product_list as 
	select a.pi_id, b.pcb_id, b.pcb_name, c.pcs_id, c.pcs_name, d.pb_name, a.pi_name, 
		a.pi_img1, a.pi_price, a.pi_discount, a.pi_isview, a.pi_salecnt, a.pi_review, a.pi_score  
	from t_product_info a, t_product_ctgr_big b, t_product_ctgr_small c, t_product_brand d 
	where a.pcb_id = b.pcb_id and a.pcs_id = c.pcs_id and a.pb_id = d.pb_id;
select * from v_product_list;

-- v_product_list를 이용하여 게시중인 상품들의 상품아이디, 대분류명, 소분류명, 상품명, 할인율, 할인가(10원 단위) 출력
select pi_id, pcb_name, pcs_name, pi_name, concat(pi_discount, '%') dc, 
if(pi_discount > 0, truncate(pi_price * (1 - pi_discount / 100), -1), pi_price) dcprice 
from v_product_list where pi_isview = 'y';

insert into t_product_info (pi_id, pcb_id, pcs_id, pb_id, pi_name, pi_model, pi_origin, pi_cost, 
	pi_discount, pi_price, pi_img1, pi_desc, pi_isview, ai_idx, ai_idx2)
values ('AA02101', 'AA', 'AA02', 'b1', '에어조던', 'AirJordern', '중국', '100000', '15', '200000', 
	'AA02101_1.jpg', 'AA02101_d.jpg', 'y', 1, 1);
select * from t_product_info;


-- 상품별 판매량 및 판매액 목록 : v_product_sale_list
-- 상품ID, 상품명, 판매량, 판매액, 주문횟수
create view v_product_sale_list as
	select pi_id, od_pname, sum(od_cnt) salecnt, sum(od_price * od_cnt) total, count(oi_id) cnt 
	from t_order_detail group by pi_id, od_pname;
select * from v_product_sale_list;


-- 회원의 연도 및 월별 가입자 수 목록 : v_member_monthly
-- 연도, 월, 가입자 수
create view v_member_monthly as 
	select year(mi_date), month(mi_date), count(mi_id) 
	from t_member_info group by year(mi_date), month(mi_date);
select * from v_member_monthly;


-- 연도, 월, 일별 판매액과 주문 건수 목록 : v_order_monthly
create view v_order_monthly as 
	select year(oi_date) saleyear, month(oi_date) salemonth, day(oi_date)saleday, 
		sum(oi_pay) salepay, count(oi_id) salecnt 
	from t_order_info group by year(oi_date), month(oi_date), day(oi_date);
select * from v_order_monthly;
-- 2022년 3월달의 총 판매액과 주문 건수
select saleyear, salemonth, sum(salepay) pay, sum(salecnt) cnt from v_order_monthly 
where saleyear = 2022 and salemonth = 3 group by saleyear, salemonth;









