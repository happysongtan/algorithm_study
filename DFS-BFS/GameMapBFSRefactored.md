## 풀이 문제
- [주소](https://campus.programmers.co.kr/tryouts/216489/challenges?language=java)

## 풀이 아이디어
-방문여부를 파악하는 visited를 선언해준다
-각 방향을 관리하는 X,Y를 배열로 선언하여 관리한다.
-Queue에 x,y,count 를 저장하기 위해 Queue를 int 배열로 선언한다
-queue를 하나씩 꺼내고 꺼낸 좌표를 기준으로 x와 y를 이동시킨 후 조건에 만족하면 queue.offer하고 조건을 만족하지 않으면 넘어간다
-해당 반복문을 끝낸뒤 count를 반환하거나 원하는 좌표를 못찾으면 -1을 리턴한다.

## 시간 복잡도
-O(N)

## 느낀점
-기존에는 각방향을 직접 넣어줬다면 배열로 관리하여 훨씬 쉽게 리팩토링 하였다.
