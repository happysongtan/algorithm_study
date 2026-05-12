##풀이 문제
- [주소](https://campus.programmers.co.kr/tryouts/216479/challenges)

##풀이 아이디어
-동일 인물이 동일 인물 신고는 무시를 HasgSet을 이용해서 중복을 제거해준다.
-중복제거한 report를 공백을 기준으로 나눠 reporter와 reportedUser로 나눠준다.
-신고 횟수를 저장할 hashmap과 메일 횟수를 측정할mailCount를 선언해준다
-먼저 hashmap안에 신고당한 유저와 횟수를 ++ 해준다.
-정지시키는 기준인 k를 넘는 것을 기준으로 메일을 보내야하는 mailCount를 갱신한뒤 mailCount를 answer에 반환한다.

##시간 복잡도
- O(N + M)

##느낀점
-hashmap의 문법이 아직 숙달되지 않아서 기본으로 사용하는 것이 아니라 두개 이상의 map을 관리하는 것이 어려웠다.
-중복을 제거하는 것이 HashSet을 알고있었지만 활용을 바로 적용하지 못했다. 
