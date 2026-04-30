##풀이 문제
- [주소](https://school.programmers.co.kr/learn/courses/30/lessons/12927)

##풀이 아이디어
-우선순위 큐를 활용하여, 항상 최댓값만 -1 을 실시후 반복한다.

##시간 복잡도
-O(N log N)

##느낀점
-정렬로 문제를 풀었지만, 우선순위큐를 활용하는게 가독성이나 성능적 측면에서 개선되어 코드를 수정하였다.<br>
-PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder()); -> 최대 힙(내림차순) 사용

