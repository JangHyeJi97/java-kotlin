create schema test3;
-- test라는 스키마가 존재하여 test3를 새로 생성하였습니다

use test3;

create table fileupload (
    fi_idx int auto_increment unique, 	-- 일련번호
	fi_name varchar(20) not null,		-- 이름
	fi_birth char(10) not null,			-- 생년월일
	fi_picture varchar(500) null, 		-- 등록일
    fi_resume varchar(500) null,		-- 등록일
    fi_document varchar(500) null  
);