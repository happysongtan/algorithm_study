##풀이 문제
- [주소](https://www.acmicpc.net/problem/1406)

##풀이 아이디어
-리스트 선언 후 cursor위치를 변수로 저장 <br>
-각 입력 사항에 맞는 명령을 if로 실행<br>
-L: cursor 왼쪽 -> 오른쪽 이동<br>
-D: cursor 오른쪽 -> 왼쪽 이동<br>
-B: 왼쪽 문자 삭제<br>
-P: 왼쪽에 문자 추가<br>

##시간 복잡도
-최악의 경우 O(N^2)

##느낀점
-cuesor 위치를 선정하고 입력값에 따른 if를 실행한다.<br>
-list를 활용하였는데 stack을 이용하여 코드의 속도를 개선해야함.<br>
