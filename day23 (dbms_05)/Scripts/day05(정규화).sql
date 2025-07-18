-- 1번 : 정규화

-- 학생 정보 테이블(정규화되지 않은 일반 테이블)
/*
 * 학번(Stu_id)   이름(stu_name) 전공(stu_major) 과목코드(stu_course_code) 과목명(stu_course_name)
 * 001           홍길동         컴공            cs101               데이터베이스
 * 001           홍길동         컴공            cs202               알고리즘
 * 002           김철수         경영학           bus202              경영이론
 * 
 * 
 * 과목코드 / 과목명 PK로 설정 후 분리
 * 부모 : 과목
 * */

-- 학생 정보 테이블 생성
CREATE TABLE TBL_STU1(
	STU_ID NUMBER,
	STU_NAME VARCHAR2(100),
	STU_MAJOR VARCHAR2(100),
	STU_COURSE_CODE VARCHAR2(100),
	STU_COURSE_NAME VARCHAR2(100)	
);

-- 테이블 만든 후 반드시 테이블 조회
SELECT * FROM TBL_STU1;

-- PK 제약조건 추가
ALTER TABLE TBL_STU1 
ADD CONSTRAINT PK_STU PRIMARY KEY(STU_ID);

-- 데이터 삽입
INSERT INTO TBL_STU1
--VALUES(001, '홍길동', '컴퓨터 공학', 'CS101', '데이터베이스');
--VALUES(001, '홍길동', '컴퓨터 공학', 'CS101', '알고리즘'); -- PK 중복 불가능이므로 오류발생
--VALUES(002, '김철수', '경영학', 'BUS202', '경영이론');

-- 데이터 삽입 후 반드시 테이블 조회
SELECT * FROM TBL_STU1;

-- 특정 학번의 학생 정보 조회(학번 2)

SELECT * 
FROM TBL_STU1
WHERE STU_ID = 2;

-- 특정 과목명에 해당하는 학생 정보조회(과목명 데이터베이스)

SELECT * 
FROM TBL_STU1
WHERE STU_COURSE_NAME = '데이터베이스';

-- 학번2인 학생의 전공을 데이터사이언스로 변경

--ALTER TABLE TBL_STU
--RENAME STU_MAJOR 경영학 TO 데이터사이언스;
UPDATE TBL_STU1
SET STU_MAJOR = '데이터사이언스'
WHERE STU_ID = 2;

-- 변경된 결과만 확인

SELECT *
FROM TBL_STU1
WHERE STU_ID = 2;

-- 컬럼 추가 STU_ADDRESS VARCHAR2(100)
ALTER TABLE TBL_STU1
ADD STU_ADDRESS VARCHAR2(100);

SELECT * FROM TBL_STU1;

-- 학번1인 학생에게 주소 추가
--INSERT INTO TBL_STU(STU_ADDRESS)
--VALUES('서울시 강남구 역삼동, 12345')
--WHERE STU_ID = 1;
-- 한 행을 전체 추가하는것이기에 이건 불가능, UPDATE 사용

-- 컬럼값 수정
UPDATE TBL_STU1
SET STU_ADDRESS = '서울시 강남구 역삼동, 12345'
WHERE STU_ID = 1;

SELECT * FROM TBL_STU1;

INSERT INTO TBL_STU1
VALUES(3,'홍길동', '컴퓨터 공학', 'CS202', '알고리즘', '서울시 강남구 역삼동, 1234');

-- 1차정규화 : 원자값, 반복제거
-- 학생 정보 테이블 : 학번(PK), 이름, 전공, 주소

CREATE TABLE TBL_STU1_1NF(
	STU_ID NUMBER,
	STU_NAME VARCHAR2(100),
	STU_MAJOR VARCHAR2(100),
	STU_ADDRESS VARCHAR2(100)
);

SELECT * FROM TBL_STU1_1NF;

-- 과목 테이블 : 과목번호(PK), 과목코드, 과목명
CREATE TABLE TBL_SUBJECT_1NF(
	SUBJECT_ID NUMBER,
	SUBJECT_CODE VARCHAR2(10),
	SUBJECT_NAME VARCHAR2(100)
);

SELECT * FROM TBL_SUBJECT_1NF;
SELECT * FROM TBL_STU1;

INSERT INTO TBL_STU1_1NF
--VALUES(1, '홍길동', '컴퓨터 공학', '서울시 강남구 역삼동, 1234');
VALUES(2, '김철수', '데이터사이언스', '서울시 송파구 잠실동, 2345');
SELECT * FROM TBL_STU1_1NF;

--DROP TABLE TBL_STU1_1NF;
--WHERE STU_ID = 2;

INSERT INTO TBL_SUBJECT_1NF
--VALUES(1, 'CS101', '데이터베이스');
--VALUES(2, 'BUS202', '경영이론');
--VALUES(3, 'CS202', '알고리즘');

SELECT * FROM TBL_SUBJECT_1NF;

-- 각 테이블의 PK 설정
ALTER TABLE TBL_STU1_1NF
ADD CONSTRAINT PK_STU_ID PRIMARY KEY(STU_ID);
SELECT * FROM TBL_STU1_1NF;

ALTER TABLE TBL_SUBJECT_1NF 
ADD CONSTRAINT PK_SUBJECT_ID PRIMARY KEY(SUBJECT_ID);
SELECT * FROM TBL_SUBJECT_1NF;

SELECT * FROM TBL_STU1;

-- 1차 정규화 완료
-- 학생테이블 : 학번(PK), 이름, 전공, 주소
-- 과목테이블 : 과목번호(PK), 과목코드, 과목명
SELECT * FROM TBL_STU1_1NF;
SELECT * FROM TBL_SUBJECT_1NF;

-- 1차 정규화 - 원자값으로 남겨야한다
--DROP TABLE TBL_STU1_1NF;
CREATE TABLE TBL_STU1_1NF(
	STU_ID NUMBER,
	STU_NAME VARCHAR2(100),
	STU_MAJOR VARCHAR2(100),
	STU_ADDRESS VARCHAR2(100),
	STU_ADDRESS_CODE NUMBER,
	CONSTRAINT PK_STU1_1NF PRIMARY KEY(STU_ID)
);

DROP TABLE TBL_STU1_1NF;

SELECT * FROM TBL_STU1_1NF;

INSERT INTO TBL_STU1_1NF
--VALUES(1, '홍길동', '컴퓨터 공학', '서울시 강남구 역삼동', '1234');
VALUES(2, '김철수', '데이터사이언스', '서울시 송파구 잠실동', '2345');

SELECT * FROM TBL_STU1_1NF;
SELECT * FROM TBL_SUBJECT_1NF;

-- 학생 테이블과 과목 테이블 분리되었으므로 FK 관계 생각한다
-- 학생테이블기준 : 1명의 학생은 여러 과목을 수강할 수 있다 (1:N)
-- 과목테이블기준 : 하나의 과목은 여러 학생이 들을 수 있다 (1:M)
-- 다 대 다 관계(N:M) → 중간 테이블이 필요하다

SELECT * FROM TBL_STU1;

-- 수강테이블 만들기부터 2차정규화 시작(중간테이블)
-- 중간테이블에서는 보통 칼럼이 많이 들어가진 않고, 한두개만 더 추가하는데서 그친다
-- 수강테이블 TBL_ENROLL_2NF
-- 학번(FK), 과목번호(FK) => PK(조합키), 부분종속 제거 생각!
-- 

CREATE TABLE TBL_ENROLL_2NF (
	STU_ID NUMBER,
	SUBJECT_ID NUMBER,
	CONSTRAINT PK_ENROLL PRIMARY KEY(STU_ID, SUBJECT_ID),
	CONSTRAINT FK_ENROLL_STU FOREIGN KEY(STU_ID) REFERENCES TBL_STU1_1NF(STU_ID),
	CONSTRAINT FK_ENROLL_SUBJECT FOREIGN KEY(SUBJECT_ID) REFERENCES TBL_SUBJECT_1NF(SUBJECT_ID)
);

SELECT * FROM TBL_ENROLL_2NF;

INSERT INTO TBL_ENROLL_2NF
--VALUES(1, 1);
--VALUES(1, 2);
--VALUES(2, 2);

-- 2차정규화(부분종속제거)
-- 조합키를 가진 테이블에서 일부키에만 종속되는 컬럼이 있을 경우 분리
-- 현재는 이미 중간테이블로 분리했기 때문에 2차 정규화까지 완료된 상태!
-- 2차 정규화 완료

-- TBL_ENROLL_2NF는 복합키만 있고 다른 종속되는 컬럼이 없음
-- TBL_STU_1NF, TBL_SUBJECT_1NF는 단일 PK 기준으로 종속 문제 없음

----------------------------------------------------------------

-- 3차정규화(이행종속제거)
-- PK가 아닌 다른 컬럼에 종속되는 컬럼이 존재시 제거해야한다

SELECT * FROM TBL_STU1;
SELECT * FROM TBL_STU1_1NF; -- 주소 테이블 추가
SELECT * FROM TBL_SUBJECT_1NF; 
SELECT * FROM TBL_ENROLL_2NF;

-- 학생정보테이블과 주소테이블로 분리
CREATE TABLE TBL_ADDRESS_3NF(
	ADDRESS_CODE NUMBER,
	ADDRESS_ADDR VARCHAR2(100),
	CONSTRAINT PK_ADDRESS_3NF PRIMARY KEY(ADDRESS_CODE)
);

SELECT * FROM TBL_ADDRESS_3NF;

CREATE TABLE TBL_STU1_3NF(
	STU_ID NUMBER,
	STU_NAME VARCHAR2(100),
	STU_MAJOR VARCHAR2(100),
	STU_ADDRESS_CODE NUMBER,
	STU_ADDRESS2 VARCHAR2(100),
	CONSTRAINT PK_STU_3NF PRIMARY KEY(STU_ID),
	CONSTRAINT FK_STU_ADDRESS FOREIGN KEY(STU_ADDRESS_CODE) REFERENCES TBL_ADDRESS_3NF(ADDRESS_CODE)
);

SELECT * FROM TBL_STU1_3NF;

-- 최종 전체 구조 정리
-- 학생 테이블(TBL_STU1_3NF)
-- STU_ID(PK), STU_NAME, STU_MAJOR, STU_ADDRESS_CODE(우편번호 FK), STU_ADDRESS2(상세주소)

-- 주소 테이블(TBL_ADDRESS_3NF)
-- ADDRESS_CODE(PK), ADDRESS_ADDR(일반주소 시 구 동)

-- 과목 테이블(TBL_SUBJECT_1NF)
-- SUBJECT_ID(PK), SUBJECT_CODE, SUBJECT_NAME (PK는 조합키도 고려가능, SUBJECT_CODE에만 PK도 고려가능)

-- 수강 테이블(TBL_ENROLL_2NF)
-- STU_ID(FK), SUBJECT_ID(FK) → 조합키 PK

/*
DROP TABLE TBL_ENROLL_2NF;
DROP TABLE TBL_STU1_1NF;
DROP TABLE TBL_SUBJECT_1NF;
DROP TABLE TBL_STU1_3NF;
DROP TABLE TBL_ADDRESS_3NF;
*/
