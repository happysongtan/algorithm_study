# algorithm_study

#풀이 문제
- [주소](https://school.programmers.co.kr/learn/courses/30/lessons/42748)

##풀이 아이디어
-Arrays.copyOfRange를 사용하여 원하는 범위의 배열을 복사
-복사한 배열을 정렬후 answer에 넣음

##시간 복잡도
-O(m*nlogn) m=commands 개수

##느낀점
-처음 설계는 배열을 직접 자르고 비교를 하였는데 추후 Arrays.copyOfRange를 사용하여 간단하게 문제를 재설계함
-copyOfRange는 대상 배열, start index,end index로 구성한다
-Arrays.copyOfRange는 start index가 사용자 입력은 1부터 시작하기 때문에 start index를 -1을 해줘야한다

