## 풀이 문제
- 주소

## 풀이 아이디어
-Queue를 활용하는 문제
-Queue에 입력받은 count까지의 숫자들을 넣어준다
-while문 조건이 queue.size()>1임으로 앞에 if문을 활용하여 queue.size가 1인경우를 예외 처리해준다
-queue.size를 확인하여 카드를 뽑거나 마지막 카드라면 출력해준다
-동일하게 size를 확인하여 카드를 뒤에 넣거나 마지막 카드라면 출력


## 시간 복잡도
-O(N)

## 느낀점
-처음에는 0보다 큰걸로 잡았으나 중간에 0인 경우 null을 가져오는 오류가 있어서 while문의 조건을 변경하고 if을 사용하여 예외를 처리함.
-Deque를 선언하지만 사용을 queue처럼 사용하는 문법을 사용함
-선언은 Deque<Intger> queue= new ArrayDeque<>()
-사용은 queue.add(),queue.poll(),
