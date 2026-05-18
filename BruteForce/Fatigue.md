## 풀이 문제
- [주소](https://campus.programmers.co.kr/tryouts/216490/challenges)

## 풀이 아이디어
-방문 횟수를 확인하는 visited 선언
-전역 변수로 최대값을 저장할 answer 선언
-긱 요소들이 전부 탐색을 해야함으로 visited를 true를 실행, dfs 실행,false로 변경하여 visited를 관리해준다 

## 시간 복잡도
-O(N!)

## 느낀점
- 처음에는 visited를 true로만 처리해서 한 경로 탐색이 끝난 뒤 다른 경로에 값이 반영되지 않았다.
- DFS에서 모든 경우의 수를 탐색하려면 탐색이 끝난 뒤 visited를 다시 false로 되돌려야 한다는 것을 알게 되었다.
