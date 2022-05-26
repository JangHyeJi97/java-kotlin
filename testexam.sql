create schema testexam;

use testexam;

create table t_product (
	tp_idx int auto_increment unique, 	-- 일련번호
	tp_id char(5) primary key,			-- 상품ID
    tp_name varchar(20) not null,		-- 상품명
	tp_price varchar(10) not null,			-- 가격
	tp_picture varchar(500) null 		-- 이미지
);
insert into t_product (tp_id, tp_name, tp_price)
value ('00001', '아주 좋은 분무기', 25000);
insert into t_product (tp_id, tp_name, tp_price)
value ('00002', '몸에 좋은 채소 Set', 35000);
insert into t_product (tp_id, tp_name, tp_price)
value ('00003', '목욕용 클리너 Set', 55000);
insert into t_product (tp_id, tp_name, tp_price)
value ('00004', '화장품 Set', 100000);
insert into t_product (tp_id, tp_name, tp_price)
value ('00005', '엄청 선명한 모니터', 400000);
insert into t_product (tp_id, tp_name, tp_price)
value ('00006', '종합 비타민(500정)', 45000);
select* from t_product;