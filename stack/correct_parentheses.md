#풀이 문제
- https://school.programmers.co.kr/learn/courses/30/lessons/12909

##풀이 아이디어
-문자를 배열로 변환하여 저장
-괄호의 열고 닫음을 stack으로 관리
-")"괄호가 먼저올 경우를 대비해여 예외처리

##시간 복잡도
-O(n)

##느낀점
-처음에 배열로 선언하고 풀었으나 charAt을 사용하여 배열선언 없이 진행
-length를 처음에 썻으나 문자열의 경우 기능을 실행하는 length()가 필요함을 배움
-배열: length 속성임
-문자열: length() 메서드
