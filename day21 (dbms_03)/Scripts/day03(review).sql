-- 1. 복습 쿼리문

-- 1. 직원들 중 봉급이 5000 이상인 직원들의 모든 정보 조회하기
-- 2. 직원들 중 부서번호가 30번인 직원들의 이름과 입사일 조회하기
-- 3. 직원들 중 성이 Smith인 직원들의 이름과 봉급 조회하기
-- 4. 직원들 중 봉급이 3000미만이거나 10000이상인 직원들의 이름과 봉급 조회하기
-- 5. 직원들 중 이름이 A로 시작하는 직원들의 이름과 성을 직원명으로, 
--    이메일을 koreait.com을 붙여서 이메일이라는 별칭으로 출력하기
-- 6. 직원들 중 성에 o가 포함되고 이름이 4글자인 직원들의 이름과 성, 부서번호 조회하기
-- 7. 직원들 중 이름이 J로 시작하고 성이 n으로 끝나는 직원들의 이름과 성 조회하기

SELECT *
FROM employees;

-- 1. 직원들 중 봉급이 5000 이상인 직원들의 모든 정보 조회하기
SELECT *
FROM employees
WHERE SALARY >= 5000
ORDER BY salary ASC;

-- 2. 직원들 중 부서번호가 30번인 직원들의 이름과 입사일 조회하기
SELECT first_name||' '||last_name 이름, hire_date 입사일	-- 3)
FROM employees											-- 1)
WHERE DEPARTMENT_ID = 30;								-- 2)

-- 3. 직원들 중 성이 Smith인 직원들의 이름과 봉급 조회하기
SELECT first_name||' '||last_name 이름, SALARY 봉급	-- 3)
FROM employees										-- 1)
WHERE last_name = 'Smith';							-- 2)
--ORDER BY 

-- 4. 직원들 중 봉급이 3000미만이거나 10000이상인 직원들의 이름과 봉급 조회하기
SELECT first_name||' '||last_name 이름, salary 봉급
FROM employees
WHERE salary < 3000 OR SALARY >= 10000
--ORDER BY salary;

-- 5. 직원들 중 이름이 A로 시작하는 직원들의 이름과 성을 직원명으로, 
--    이메일을 koreait.com을 붙여서 이메일이라는 별칭으로 출력하기
SELECT first_name||' '||last_name 직원명, email||'@'||'koreait.com' 이메일
FROM employees
WHERE FIRST_NAME LIKE 'A%';

-- 6. 직원들 중 성에 o가 포함되고 이름이 4글자인 직원들의 이름과 성, 부서번호 조회하기
SELECT first_name||' '||last_name 이름, Manager_id 부서번호
FROM employees
WHERE last_name LIKE '%o%'AND first_name LIKE '____';

SELECT first_name||' '||last_name 이름, Manager_id 부서번호
FROM employees
WHERE last_name LIKE '%o%' AND LENGTH(first_name) = 4;



-- 7. 직원들 중 이름이 J로 시작하고 성이 n으로 끝나는 직원들의 이름과 성 조회하기
SELECT first_name||' '||last_name 이름
FROM employees
WHERE first_name LIKE 'J%' AND last_name LIKE '%n';








