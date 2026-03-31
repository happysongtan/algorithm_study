# algorithm_study

#풀이 문제
- [주소](https://school.programmers.co.kr/learn/courses/30/lessons/42584)

##풀이 아이디어
-스택에 prices가 아니라 index를 기준으로 스택을 관리함
-if 현재 스택에 있는 가격보다 price가 줄어들면 스택에서 제외 해당 index에 기간 입력
-for가 끝나도 stack에 남아있는 index 처리

##시간 복잡도
-O(n)

##느낀점
-처음에는 이중배열을 토대로 문제를 풀었음
-스택을 활용하면 불필요한 비교를 제거할수 있음을 생각함.
-시간복잡도도 개선되는 방향으로 코드를 구현함
