## 풀이 문제
- 주소

## 풀이 아이디어
- 퀵 정렬을 직접 구현함
- 입력받을 배열을 StringTokenizer로 받고 nextToken으로 값을 넣어준다.
- 기준을 pivot으로 잡고 start,end,target을 매개변수로 잡는 quick를 선언해준다
- quick는 pivot의 기준을 잡고 target과 값의 크기에 따라서 pivot을 조정해주는 역할을 한다
- 퀵정렬을 직접적을 수행하는 함수를 선언하고 start,end에 따라서 값을 swap한다.
- quick이 끝나 정렬이 끝나면 target-1을 출력하여 값을 도출한다.

## 시간 복잡도
-O(NlogN)

## 느낀점
- sort함수를 사용하지 않고 직접 구현하는데 있어서, pivot의 기준과 start와 end를 이동시키는 구현이 어려웠다.
- 다시 풀면서 구조를 파악해야 한다.
-
