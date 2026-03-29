#풀이 문제
- [주소](https://school.programmers.co.kr/learn/courses/30/lessons/42587#)

##풀이 아이디어
-Queue에 배열로 인덱스와 priorities를 저장

-비교할값을 target으로 잡고 poll

-boolean으로 for중에 큰값이 있는지 없는지를 판단

-큐에서 꺼내며 우선순위 비교 후 출력 순서를 count로 관리하고 원하는 location이 확인되면 순서를 반환해준다

##시간 복잡도
-O(n^2) 각 요소마다 큐 전체를 검사하기 때문

##느낀점
-정렬을 한번하는 문제로 착각하여 시간이 걸림.

-Queue를 점검할때 Queue안에 큰값이 있으면 바로 뒤로 보내는것이 아닌 braek를 걸어주고 후에 boolean을 통해 관리하는 법을 배움

-count를 사용하여 for문을 한번더 돌리는 수고없이 순서를 확인해 값을 색출함

-Queue의 값을 배열로 선언하여 사용할 수 있음 Queue<int[]> queue=new LinkedList<>();
