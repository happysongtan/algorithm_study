
#풀이 문제
- [주소](https://school.programmers.co.kr/learn/courses/30/lessons/12906)

##풀이 아이디어
-겹치지 않는 원소를 저장하기 위해 list선언 

-이전값을 비교하기위해 prev로 값 저장

-현재값과 이전값의 비교후 list에 추가

-배열을 list.size()로 선언

-값을 걸러낸 list를 answer배열에 입력

##시간 복잡도
-O(n)

##느낀점
-이전 값을 비교하는것을 -1로 설정하면 값이 -1일경우 에러 발생하여 순서를 prev로 설정하는 것이 아닌 첫번째 요소를 넣는것으로 해결 가능

- 배열을 선언할때 list.size()로 리스트의 길이만큼 선언가능
