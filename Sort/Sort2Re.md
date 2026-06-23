## 풀이 문제
- 주소

## 풀이 아이디어
- 기존에 Sort로 풀었던 문제를 병합 정렬을 사영하여 다시 풀었음.
- 값을 출력하는 것을 BufferedWriter를 사용해서 메모리 효울을 높힘
- 정답을 저장할 A와 기존의 배열을 담을 tmp를 구분해서 선언
- 병합 정렬을 실행할 merget_sort로 1과 입력받은 size를 보냄
- merget_sort는 재귀함수로 구현하여 end와 start로 구분한다
- merget_sort 내부 middle을 선언하여 병합정렬의 기준값을 정해준다.
- merget_sort를 start,middle과 middle,end를 매개변수로 보내주고 종료 조건은 end-start<1로 정한다.
- 현재의 start와 end룰 기준으로 tep에 a룰 넣어준다
- start를 k, index1를 start index2를 middle+1로 정한다
- 다음 반복문에서 두개의 배열을 합칠때 기준은 각각의 시작점인 index1과 index2로 while문을 들어간다
- 각각의 시작점인 tmp[index1]과 tmp[index2]를 기준으로 작은값을 A에 넣어주고 정답의 index인 k룰 +1해준다
- while문이 종료되도 값이 남아있는 배열이 있을 수 있음으로 마저 정렬한뒤 출력한다.
## 시간 복잡도
- O(N log N)

## 느낀점
- 가존에는 sort함수룰 사용해서 간단하게 풀었지만 복합 정렬을 직접 구현해보니 생각보다 구조가 복잡해서 처음에는 이해하기 힘들었으니 직접 구현해보니 이해하기 수월했다
- 기존에는 StringBuilder로 출력했지만 BufferedWriter를 사용하는게 더 효율적이여서 적용해봤다. 

