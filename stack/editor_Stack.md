##풀이 문제
- [주소](https://www.acmicpc.net/problem/1406)

##풀이 아이디어
-커서를 기준으로 앞과 뒤를 상징하는 stack을 선언 <br>
-각 입력 사항에 맞는 명령을 if로 실행<br>
-L: cursor 왼쪽 -> 오른쪽 이동<br>
-D: cursor 오른쪽 -> 왼쪽 이동<br>
-B: 왼쪽 문자 삭제<br>
-P: 왼쪽에 문자 추가<br>

##시간 복잡도
-최악의 경우 O(N)

##느낀점
-cursor라는 변수 대신 stack을 두개를 이용하여 cuesor의 역할을 부여하고, 상황에 맞게 stack의 앞과 뒤를 이동시켜준다<br>
-stack의 들어있는 값을 append할 때 for문에서 stack.size를 변수 없이 사용하면, 중간에 size가 바뀌기 때문에 원하는 결과가 나오지 않는다.<br>
