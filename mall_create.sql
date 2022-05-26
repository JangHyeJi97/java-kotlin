use test;
-- 쇼핑몰용 테이블 생성 및 셋팅 쿼리

-- 관리자 정보 테이블
create table t_admin_info  (
	ai_idx int auto_increment unique, 	-- 일련번호
	ai_id varchar(20) primary key, 		-- 아이디
	ai_pw varchar(20) not null, 		-- 비밀번호
	ai_name varchar(20) not null,		-- 이름
	ai_isuse char(1) default 'y', 		-- 사용여부
	ai_date datetime default now() 		-- 등록일
);
insert into t_admin_info (ai_id, ai_name) values ('sa', '1111', '홍길동');
select * from info t_admin_info;

-- 회원테이블 생성
create table t_member_info (
	mi_idx int auto_increment unique,
	mi_id varchar(20) primary key, 			-- 아이디
	mi_pw varchar(20) not null, 			-- 비밀번호
	mi_name varchar(20) not null, 			-- 이름
	mi_gender char(1) not null, 			-- 성별
	mi_birth char(10) not null, 			-- 생년월일
	mi_phone varchar(13) not null unique, 	-- 전화번호
	mi_email varchar(50) not null unique, 	-- 이메일
	mi_isad char(1) default 'y', 			-- 광고수신여부
	mi_point int default 0, 				-- 보유 포인트
	mi_date datetime default now(), 		-- 가입일
	mi_lastlogin datetime, 					-- 최종 로그인일자
	mi_status char(1) default 'a'			-- 상태
);
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email)
values ('test1', '1111', '홍길동', 'm', '32278', '010-1234-5678', 'hong@test.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) 
values ('test2', '1111', '전우치', 'm', '35962', '010-1234-5679', 'jeon@test.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) 
values ('test3', '1111', '임꺽정', 'm', '32706', '010-1234-5680', 'lim@test.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email)
values ('test4', '1111', '하니', 'f', '36390', '010-1234-5681', 'honey@test.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) 
values ('asdf1', '1111', '김길동', 'm', '37105', '010-1234-5682', 'kim@naver.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) 
values ('asdf2', '1111', '이길동', 'm', '37502', '010-1234-5683', 'lee@naver.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) 
values ('asdf3', '1111', '고길동', 'm', '37817', '010-1234-5684', 'go@naver.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) 
values ('asdf4', '1111', '최길동', 'm', '31951', '010-1234-5685', 'choi@naver.com');
select * from t_member_info;

-- 회원주소 테이블
create table t_member_addr (
	ma_idx int auto_increment primary key,	-- 일련번호
	mi_id varchar(20) not null, 			-- 회원 아이디
    ma_phone varchar(13) not null,			-- 
	ma_zip char(5) not null,				-- 우편번호
	ma_addr1 varchar(50) not null,			-- 주소1
    ma_addr2 varchar(50) not null,			-- 주소2
    ma_name varchar(50) not null,			-- 주소명
    ma_receiver varchar(50) not null,		-- 받는사람
	ma_basic char(1) default 'y', 			-- 기본주소여부
	ma_date datetime default now(), 		-- 등록일
    constraint fk_member_addr_mi_id foreign key (mi_id)
		references t_member_info(mi_id)		-- 외래키지정
);

insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) 
values ('test1', '12345', '강남구 삼성1동', '111-22', '집', '홍길동', 'y');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) 
values ('test1', '12346', '강남구 삼성2동', '111-23', '본가', '홍길순', 'n');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) 
values ('test2', '12347', '서울시 서대문구 아현1동', '111-24', '회사', '전우치', 'y');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) 
values ('test2', '12348', '서울시 서대문구 아현2동', '111-25', '집', '전상태', 'n');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) 
values ('test3', '12349', '경기도 시흥시 월곶동', '111-26', '집', '임꺽정', 'y');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) 
values ('test4', '12350', '부산시 연제구 연산동', '111-27', '집', '하니', 'y');
select * from t_member_addr;

-- 회원 포인트 사용내역 테이블
create table t_member_point (
	mp_idx int auto_increment primary key,	-- 일련번호
    mi_id varchar(20) not null,				-- 회원아이디
    mp_issu char(1) default 's',			-- 적립/사용 여부(s:적립, u:사용)
    mp_point int default 0,					-- 포인트
    mp_desc varchar(20) not null,			-- 적립/사용 내용(가입축하금, 상품구매(s), 구매후기(u))
    mp_num	varchar(20), 					-- 주문/후기 번호
    mp_date datetime default now(),			-- 적립/사용일자
    constraint fk_member_point_mi_id foreign key (mi_id)
		references t_member_info(mi_id)		-- 외래키지정
);

insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) 
values ('test1','s', '1000', '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) 
values ('test2','s', '1000', '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) 
values ('test3','s', '1000', '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) 
values ('test4','s', '1000', '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) 
values ('asdf1','s', '1000', '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) 
values ('asdf2','s', '1000', '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) 
values ('asdf3','s', '1000', '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) 
values ('asdf4','s', '1000', '가입축하금');
select * from t_member_point;

-- 상품관련 테이블 생성
-- 상품 대분류 테이블
create table t_product_ctgr_big(
	pcb_id char(2) primary key, 	-- 대분류 코드
    pcb_name varchar(20) not null	-- 대분류 이름
);
insert into t_product_ctgr_big values ('AA', '운동화');
insert into t_product_ctgr_big values ('BB', '구두');
insert into t_product_ctgr_big values ('CC', '슬리퍼');
select * from t_product_ctgr_big;

-- 상품 소분류 테이블
create table t_product_ctgr_small(
	pcs_id char(4) primary key, 	-- 소분류 코드
    pcb_id char(2) not null,		-- 대분류 코드
    pcs_name varchar(20) not null,	-- 소분류 이름
    constraint fk_product_ctgr_small_pcb_id foreign key(pcb_id)
		references t_product_ctgr_big(pcb_id)
);
insert into t_product_ctgr_small values ('AA01', 'AA', '런닝화');
insert into t_product_ctgr_small values ('AA02', 'AA', '농구화');
insert into t_product_ctgr_small values ('AA03', 'AA', '스니커즈');
insert into t_product_ctgr_small values ('BB01','BB', '로퍼');
insert into t_product_ctgr_small values ('BB02','BB', '윙팁');
insert into t_product_ctgr_small values ('BB03','BB', '더비');
insert into t_product_ctgr_small values ('CC01', 'CC', '블로퍼');
insert into t_product_ctgr_small values ('CC02', 'CC', '플립플랍');
select * from t_product_ctgr_small;

-- 상품 브랜드 테이블
create table t_product_brand(
	pb_id char(2) primary key,		-- 브랜드 코드
    pb_name varchar(20) not null	-- 브랜드 이름
);
insert into t_product_brand values ('b1', '나이키');
insert into t_product_brand values ('b2', '리복');
insert into t_product_brand values ('b3', '랜드로바');
insert into t_product_brand values ('b4', '락포트');
insert into t_product_brand values ('b5', '아디다스');
insert into t_product_brand values ('b6', '크록스');
select * from t_product_brand;

-- 상품 정보 테이블 
create table t_product_info(
pi_idx int unique auto_increment,  		-- 일련번호
pi_id char(7) primary key,   			-- 상품아이디
pcb_id char(2) not null,   				-- 대분류 코드
pcs_id char(4) not null,  				-- 소분류 코드
pb_id char(2) not null,   				-- 브랜드 코드
pi_name varchar(20) not null,   		-- 상품명(검색이 잦기 때문에 인덱스 걸기 좋음)
pi_model varchar(20) not null,   		-- 모델번호
pi_origin varchar(20) not null,   		-- 제조국가
pi_cost int default 0,   				-- 원가
pi_discount int default 0,   			-- 할인율
pi_price int default 0,   				-- 가격
pi_img1 varchar(50) not null,   		-- 이미지1
pi_img2 varchar(50),   					-- 이미지2
pi_img3 varchar(50),      				-- 이미지3
pi_desc varchar(50) not null,   		-- 설명이미지
pi_special varchar(4),      			-- 특별상품여부
pi_readcnt int default 0,   			-- 조회수
pi_salecnt int default 0,   			-- 판매량
pi_review int default 0,   				-- 리뷰개수
pi_score float default 0.0,   			-- 평균평점
pi_isview char(1) default 'n',    		-- 게시여부
pi_date datetime default now(),   		-- 등록일
ai_idx int not null,   					-- 관리자번호
pi_lastdate datetime default now(),     -- 최종수정일
ai_idx2 int not null,  					-- 최종수정자
constraint fk_product_pcb_id foreign key (pcb_id) references t_product_ctgr_big(pcb_id),
constraint fk_product_pcs_id foreign key (pcs_id) references t_product_ctgr_small(pcs_id), 
constraint fk_product_pb_id foreign key (pb_id) references t_product_brand(pb_id), 
constraint fk_product_ai_idx foreign key (ai_idx) references t_admin_info(ai_idx), 
constraint fk_product_ai_idx2 foreign key (ai_idx2) references t_admin_info(ai_idx)
);
create index idx_product_pi_name on t_product_info(pi_name);
-- 검색이 자주 일어나게 될 상품명에도 검색속도 향상을 위한 인덱스 생성
show index from t_product_info;
-- t_product_info 테이블에 적용된 인덱스를 검색하는 쿼리

-- 상품옵션별 재고 테이블
create table t_product_stock(
	ps_idx int auto_increment unique,	-- 일련번호
    pi_id char(7) not null,				-- 상품아이디
    ps_size int default 0,				-- 옵션-크기
    ps_color varchar(20),				-- 옵션-색상
    ps_stock int default 0,				-- 재고량
    ps_sale int default 0,				-- 판매량
    ps_isview char(1) default 'n',		-- 게시여부
    constraint fk_product_stock_pi_id foreign key (pi_id) references t_product_info(pi_id)    
);

-- 주문관련 테이블 생성
-- 장바구니 테이블
create table t_order_cart (
	oc_idx int auto_increment primary key,	-- 일련번호
	oc_ismem char(1) default 'y',			-- 회원 여부
	oc_buyer varchar(50) not null,			-- 회원ID or 세션ID
	pi_id char(7) not null,					-- 상품아이디
	ps_idx int not null,					-- 옵션별 재고 아이디
	oc_opt varchar(50) not null,			-- 옵션-문자열
	oc_cnt int default 1,					-- 수량
	oc_date datetime default now(),			-- 등록일
    constraint fk_order_cart_pi_id foreign key (pi_id) references t_product_info(pi_id),
	constraint fk_order_cart_ps_idx foreign key (ps_idx) references t_product_stock(ps_idx)
);

-- 주문 정보 테이블
create table t_order_info (
	oi_id char(12) primary key,			-- 주문번호
	oi_ismem char(1) default 'y',		-- 회원여부
	oi_buyer varchar(50) not null,		-- 회원ID or 주문자명
	oi_bpw varchar(20), 				-- 비회원용 비밀번호
	oi_bphone varchar(13) not null,		-- 주문자 전화번호
	oi_bemail varchar(50) not null,		-- 주문자 이메일
	oi_rname varchar(20) not null,		-- 수취인명
	oi_rphone varchar(13) not null,		-- 배송지 전화번호
	oi_rzip char(5) not null,			-- 배송지 우편번호
	oi_raddr1 varchar(50) not null,		-- 배송지 주소1
	oi_raddr2 varchar(50) not null,		-- 배송지 주소2
	oi_memo varchar(50),				-- 메모
	oi_payment char(1) default 'a',		-- 결제방법
	oi_pay int default 0,				-- 결제액
	oi_upoint int default 0,			-- 사용 포인트
	oi_spoint int default 0,			-- 적립금
	oi_invoice varchar(50),				-- 송장번호
	oi_status char(1) default 'b',		-- 주문상태
	oi_date datetime default now(),		-- 주문일
	ai_idx int not null,				-- 관리자번호
	oi_lastdate datetime default now(), -- 최종수정일
    constraint fk_order_info_ai_idx foreign key (ai_idx) references t_admin_info(ai_idx)
);

-- 주문 상세 정보 테이블
create table t_order_detail (
	od_idx int auto_increment primary key,	-- 일련번호
	oi_id char(12) not null,				-- 주문번호
	pi_id char(7) not null,					-- 상품아이디
	od_size int not null,					-- 사이즈
	od_color varchar(20),					-- 색상
	od_cnt int default 0,					-- 수량
	od_price int default 0,					-- 단가
	od_pname varchar(20) not null,			-- 상품명
	od_pimg varchar(50) not null,			-- 상품 이미지
    constraint fk_order_detail_oi_id foreign key (oi_id) references t_order_info(oi_id),
    constraint fk_order_detail_pi_id foreign key (pi_id) references t_product_info(pi_id)
);

-- 구매 후기 테이블
create table t_review_list (
rl_idx int unique,				-- 글번호
oi_id char(12) not null,		-- 주문번호
pi_id char(7) not null,				-- 상품 아이디
mi_id varchar(20) not null,		-- 회원아이디
rl_pname varchar(100) not null,	-- 상품명 및 옵션
rl_title varchar(100) not null,	-- 제목
rl_content text not null,		-- 내용
rl_reply int default 0,			-- 댓글개수
rl_img varchar(50),				-- 이미지
rl_score float default 0, 		-- 평점
rl_good int default 0,			-- 좋아요
rl_bad int default 0,			-- 싫어요
rl_read int default 0,			-- 조회수
rl_ip varchar(15) not null,		-- ip주소
rl_date datetime default now(),	-- 작성일
primary key(oi_id, pi_id, mi_id), -- 여러 컬럼을 기본키로 지정할 경우 아랫쪽에서 일괄적으로 지정해야 함
constraint fk_review_list_oi_id foreign key(oi_id) references t_order_info(oi_id),
constraint fk_review_list_pi_id foreign key(pi_id) references t_product_info(pi_id),
constraint fk_review_list_mi_id foreign key(mi_id) references t_member_info(mi_id)
);

-- 구매후기 좋아요/싫어요 테이블
-- 구매 후기 좋아요/싫어요 테이블
create table t_review_gnb (
	rg_idx int auto_increment unique, 	-- 일련번호
	mi_id varchar(20) not null, 		-- 회원ID
	rl_idx int not null, 				-- 후기 글번호
	rg_gnb char(1) default 'g', 		-- 추천여부
	rg_date datetime default now(), 	-- 등록일
	primary key(mi_id, rl_idx), 
	constraint fk_review_gnb_mi_id foreign key(mi_id) references t_member_info(mi_id), 
	constraint fk_review_gnb_rl_idx foreign key(rl_idx) references t_review_list(rl_idx)
);

-- 구매후기 댓글 테이블
create table t_review_reply (
	rr_idx int auto_increment primary key,	-- 댓글번호
    rl_idx int not null,					-- 후기글번호
    mi_id varchar(20) not null,				-- 회원아이디
    rr_content varchar(200) not null,		-- 내용
    rr_ip varchar(15) not null,				-- ip주소
    rr_date datetime default now(),			-- 작성일
	constraint fk_review_reply_mi_id foreign key(mi_id) references t_member_info(mi_id), 
	constraint fk_review_reply_rl_idx foreign key(rl_idx) references t_review_list(rl_idx)
);

-- qna 테이블
create table t_qna_list (
	ql_idx int primary key,					-- 글번호
    mi_id varchar(20) not null,				-- 회원ID
    qi_ctgr char(1) default 'a',			-- 질문 불류
    qi_title varchar(100) not null,			-- 질문 제목
    ql_content text not null,				-- 질문내용
    ql_img1 varchar(50),					-- 이미지1
    ql_img2 varchar(50),					-- 이미지2
    ql_img3 varchar(50),					-- 이미지3
    ql_qdate datetime default now(),		-- 질문 작성일
    ql_isanswer char(1) default 'n',		-- 답변여부
    ql_ai_idx int,							-- 답변 관리자 번호
    ql_answer text,							-- 답변내용
    ql_satis char(1) default 'a',			-- 만족도
	ql_adate datetime,						-- 답변 작성일
    constraint fk_qna_list_mi_id foreign key(mi_id) references t_member_info(mi_id) 
);

-- 설문조사 관련 테이블
-- 설문 조사 질문
create table t_poll_question (
	pq_idx int primary key, 				-- 일련번호
	pq_start varchar(10),					-- 설문 시작일
	pq_end varchar(10),						-- 설문 종료일
    pq_question varchar(200) not null,		-- 질문 내용
    pq_dup int default 1,					-- 중복여부
    pq_status char(1) default 'a',			-- 설문상태
    pq_isview char(1) default 'n',			-- 게시여부
    pq_date datetime default now(),			-- 등록일
    ai_idx int not null,					-- 관리자 번호
	constraint fk_poll_question_ai_idx foreign key(ai_idx) references t_admin_info(ai_idx) 
);

-- 설문조사 보기 테이블
create table t_poll_exam (
	pe_idx int auto_increment primary key,		-- 일련번호
	pq_idx int not null,						-- 설문번호 
    pe_num int default 1,						-- 보기번호
	pe_exam varchar(100) not null,				-- 보기 내용
    pe_selcnt int default 0,					-- 선택한 횟수(해당 보기를 선택한 회원의 수)
    constraint fk_poll_exam_pq_idx foreign key(pq_idx) references t_poll_question(pq_idx) 
);

-- 설문조사 결과 테이블
create table t_poll_result (
	pr_idx int auto_increment unique,		-- 일련번호
    mi_id varchar(20) not null,				-- 회원ID
    pq_idx int not null,					-- 설문번호
    pe_idx int not null,					-- 선택번호
    pr_date datetime default now(),			-- 설문참여일
    primary key(mi_id, pq_idx, pe_idx),
	constraint fk_poll_result_mi_id foreign key(mi_id) references t_member_info(mi_id),
	constraint fk_poll_result_pq_idx foreign key(pq_idx) references t_poll_question(pq_idx),
    constraint fk_poll_result_pe_idx foreign key(pe_idx) references t_poll_exam(pe_idx) 
);

create table t_schedule_info (
	si_idx int auto_increment primary key,		-- 일련번호
    mi_id varchar(20) not null,					-- 회원아이디
    si_date char(10) not null,					-- 날짜 (yyyy-mm-dd)
    si_time char(5) not null,					-- 시간 (hh:mm)
    si_content varchar(50) not null,			-- 내용
    si_regdate datetime default now(),			-- 등록일
    constraint fk_schedule_info_mi_id foreign key(mi_id) references t_member_info(mi_id)
);

-- 임시게시판 테이블
create table t_tmp (
	t_idx int primary key,		-- 글번호
    mi_id varchar(20),			-- 회원아이디
    t_title varchar(100) not null,	-- 제목
    t_content text not null,	-- 내용
    t_read int default 0,		-- 조회수
	t_ip varchar(15) not null,	-- ip주소
    t_date datetime default now(),	-- 등록일
    constraint fk_tmp_mi_id foreign key(mi_id)
		references t_member_info(mi_id)
);

create table fileupload (
    fi_idx int auto_increment unique, 	-- 일련번호
	fi_name varchar(20) not null,		-- 이름
	fi_birth char(6) not null,			-- 생년월일
	fi_picture varchar(500) null, 		-- 증명사진
    fi_resume varchar(500) null,		-- 이력서
    fi_document varchar(500) null  		-- 증빙서류
);
insert into fileupload (fi_name, fi_birth, fi_picture, fi_resume, fi_document) 
values ('홍길동', '880504', '증명사진.jpg', '쇼핑몰_명세서.xlsx', '학사관리_명세서.xlsx');

select* from fileupload;

