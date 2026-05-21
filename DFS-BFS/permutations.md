## 풀이 문제
- [주소](https://leetcode.com/problems/permutations/description/)

## 풀이 아이디어
-이중리스트 반환을 원함으로 이중리스트 선언
-기존 dfs문제에서 추가를 add로 넣고 dfs를 나가면서 remove를 해준다
-리스트의 길이가 nums.length가 되면 이중 리스트에 추가해주고 종료한다.

## 시간 복잡도
-O(N!)

## 느낀점
-이중리스트를 사용하는데 익숙하지 않아서 이중 리스트 자료를 다루는데 공부를 더 해야곘다.
-종료 조건에 -1을 하는것과, 종료조건을 temp의 length로 관리해야한다.
