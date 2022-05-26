use test;
use mall;
create table t_upload(
u_idx int auto_increment primary key,    -- 일련번호
u_name varchar(20) not null,       
u_birth   char(10) not null, 
u_file1 varchar(20) not null,       
u_file2   varchar(20) not null,    
u_file3 varchar(20) not null,
u_date datetime default now()
);
insert into t_upload (u_name, u_birth, u_file1, u_file2, u_file3 ) values('', '', '', '', '');
select * from t_upload;
select * from t_tmp;
update t_tmp set t_title = '', t_content= '' where mi_id = '' and t_idx = '';

update t_tmp set t_read = t_read + 1 where mi_id = '' and si_idx = '';

select * from t_product_ctgr_big;
select * from t_product_ctgr_small where pcb_id = '';
select * from t_product_info;
select * from t_product_brand;
select * from t_product_stock;
select * from t_order_cart;

select a.*, b.pcb_name, c.pcs_name, d.pb_name 
from t_product_info a, t_product_ctgr_big b, t_product_ctgr_small c, t_product_brand d where a.pcb_id = b.pcb_id and 
a.pcs_id = c.pcs_id and a.pb_id = d.pb_id and a.pi_isview = 'y' and a.pi_id = 'AA01101';



insert into t_product_info (pi_id, pcb_id, pcs_id, pb_id, pi_name, pi_model, 
pi_origin, pi_cost, pi_discount, pi_price, pi_img1, pi_desc, pi_isview, 
pi_date, ai_idx, ai_idx2) values ('AA01101', 'AA', 'AA01', 'b1', '좋은 신발', 'js', 
'한국', 100000, 0, 130000, 'AA01101_1.jpg', 'AA01101desc.jpg', 'y', now(), 1, 1);

select a.pi_id, a.pi_name, a.pi_img1, a.pi_price, a.pi_discount, a.pi_special,
sum(b.ps_stock) stock
from t_product_info a, t_product_stock b where a.pi_id = b.pi_id and a.pi_isview = 'y' group by b.pi_id;

select count(a.pi_id) from t_product_info a, t_product_stock b
 where a.pi_id = b.pi_id and a.pi_isview = 'y' group by b.pi_id;

insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '250', 'black', 100, 0, 'y');
insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '255', 'black', 100, 0, 'y');
insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '260', 'black', 100, 0, 'y');
insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '265', 'black', 100, 0, 'y');
insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '270', 'black', 100, 0, 'y');
insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '250', 'white', 100, 0, 'y');
insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '255', 'white', 100, 0, 'y');
insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '260', 'white', 100, 0, 'y');
insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '265', 'white', 100, 0, 'y');
insert into t_product_stock (pi_id, ps_size, ps_color, ps_stock, ps_sale, ps_isview)
values ('AA01101', '270', 'white', 100, 0, 'y');

select * from t_product_stock where pi_id = '' and ps_isview = 'y' order by ps_size, ps_color;
select * from t_review_list where pi_id = '' order by rl_idx desc;

insert into t_order_cart (oc_ismem, oc_buyer, pi_id, ps_idx, oc_opt, oc_cnt) values ('', '', '', '', '', ''); 

select oc_idx from t_order_cart where pi_id = '' and ps_idx = '' and oc_ismem = '' and oc_buyer = '';
update t_order_cart set oc_cnt = oc_cnt + '' where oc_idx = '';

select a.*, b.pi_img1, b.pi_name from t_order_cart a, t_product_info b where a.pi_id = b.pi_id and a.oc_ismem = '' and a.oc_buyer = ''
order by a.pi_id;

update t_order_cart set oc_cnt = oc_cnt + '' where oc_idx = '';

delete from t_order_cart 
where oc_ismem = '' and oc_buyer = '' and (oc_idx = '' or oc_idx = '' or oc_idx = '') ;

select oc_idx, oc_cnt from t_order_cart where oc_buyer = '' and pi_id = '' and ps_idx = '';

select a.pi_id, b.pi_img1, b.pi_name, a.ps_idx, a.oc_opt, a.oc_cnt, b.pi_discount, b.pi_price
from t_order_cart a, t_product_info b
where a.pi_id = b.pi_id and (a.oc_idx = ? or a.oc_idx = ? or ... );

select pi_img1, pi_name, ps_idx , pi_discount, pi_price from t_product_info 
where pi_id = '' and (a.oc_idx = ? or a.oc_idx = ? or ... );

select ma_zip, ma_addr1, ma_addr2 , ma_name, ma_receiver, ma_basic from t_member_addr where mi_id = '';

select oi_id from t_order_info where oi_id like '' order by oi_date desc limit 0, 1; 
-- 주문번호 받는 쿼리

insert into t_order_info(oi_id, oi_ismem, oi_buyer, oi_bpw, oi_bphone, oi_bemail, oi_rname, oi_rphone
, oi_rzip, oi_raddr1, oi_raddr2, oi_memo, oi_payment, oi_pay, oi_upoint, oi_spoint, oi_status
) values('', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');

select a.pi_id, a.ps_idx, a.oc_opt, a.oc_cnt, b.pi_discount, b.pi_price, b.pi_img1, b.pi_name
from t_order_cart a, t_product_info b
where a.pi_id = b.pi_id and (oc_idx = 27 or oc_idx = 28 or oc_idx = 29);

insert into t_order_detail(oi_id, pi_id, od_size, od_color, od_cnt, od_price, od_pname, od_pimg
) values ('', '', '', '', '', '', '', '');

update t_product_stock set ps_stock = ps_stock - '', ps_sale = ps_sale + '' where ps_idx = '';
update t_product_info set pi_salecnt = pi_salecnt + '' where pi_id = '';

select * from t_order_info a, t_order_detail b where a.oi_id = b.oi_id and a.oi_id = '';
select * from t_order_info;
select * from t_order_detail;
select * from t_product_info;
select * from t_order_cart;
select * from t_member_addr;

select adddate(now(), -7);

select * from t_order_info a, t_order_detail b
where a.oi_id = b.oi_id and oi_ismem = 'y' and oi_buyer = ''
order by a.oi_date desc, b.pi_id, b.od_size;


select a.oi_id from t_order_info a, t_order_detail b 
where a.oi_id = b.oi_id and oi_ismem = 'y'  and oi_buyer = 'test1' and oi_date >= adddate(now(), -15) 
order by a.oi_date desc, b.pi_id, b.od_size;

select a.oi_id from t_order_info a, t_review_list b where a.oi_id = b.oi_id 
and a.oi_buyer = '' and a.oi_date > ''
order by a.oi_date desc, b.pi_id;

select a.*, b.*, ifnull(c.rl_idx, 0) rl_idx from t_order_info a left join t_order_detail b on a.oi_id = b.oi_id 
left join t_review_list c on a.oi_id = c.oi_id
where a.oi_id = '220408AUK104';

select b.* from t_order_info a, t_order_detail b 
where a.oi_id = b.oi_id and a.oi_buyer = '' and od_idx = '';

select * from t_review_list;
select ifnull(max(rl_idx) + 1, 1) from t_review_list;
insert into t_review_list(rl_idx, oi_id, mi_id, pi_id, ps_idx, rl_pname, rl_title, rl_content
, rl_img, rl_score, rl_ip) values ('', '', '', '', '', '', '', '', '', '', '');

select * from t_review_list a, t_order_detail b  where a.oi_id = b.oi_id and a.ps_idx = b.ps_idx and a.rl_idx = '';

select * from t_review_list;

select rl_idx from t_review_gnb where mi_id = '' and( rl_idx = '' or rl_idx = '');

insert into t_review_gnb(mi_id, rl_idx, rg_gnb) values ('', '', '');

select * from t_review_gnb;

update t_review_list set rl_read = rl_read + 1 where rl_idx = ?;

select * from t_free_reply where fl_idx = ?;

insert into t_free_reply(mi_id, fl_idx, fr_content, fr_ip) values ('', '', '', '');

update t_free_list set fl_reply = fl_reply + 1 where fl_idx= '';
select * from t_free_list;

update t_free_reply set fr_content = '' where mi_id = '' and fr_idx = '';
select * from t_free_reply;
delete from t_free_reply  where mi_id = '' and fr_idx = '';

create table test (
	idx int primary key,
    
    name varchar(20)
);
select * from test;
delete from test;