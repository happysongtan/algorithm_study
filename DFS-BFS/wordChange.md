#풀이 문제
- [주소](https://school.programmers.co.kr/learn/courses/30/lessons/43163)

##풀이 아이디어
-시작 단어와 진행 횟수를 queue에 선언, boolean을 활용하여 방문 여부 확인<br>
-queue 안에 있는 Object를 단어와 횟수로 나눠서 현재 단어 상태와 횟수를 이용<br>
-현재 단어가 일치하지 않으면 canConvert로 이동 canConvert에서 동일하게 Object로 나눠서 현재 상태의 단어와 words의 단어를 비교하여 queue에 넣을지 판단<br>

##시간 복잡도
-O(N^2 * M)  
-N: words 갯수
-M: 단어 길이

##느낀점
-앞서서 BFS의 문제를 풀어봐서 해결 방식을 찾는데 오래 걸리지 않음<br>
-queue에 Object를 사용하고, 분리할때 Object 내부 요소들은 자료형의 재정의가 필요함, 다음에는 클래스를 만들어서 관리하면 더 좋을 것 같음.<br>
-count는 1일때만 유효하고 2이상이 넘어가면 반복이 무의미 하므로 break를 걸어줌<br>
