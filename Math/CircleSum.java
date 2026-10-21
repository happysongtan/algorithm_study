class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        boolean[] visited = new boolean[1000001]; 
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += elements[(i + j) % n];
                if (!visited[sum]) {
                    visited[sum] = true;
                    answer++;
                }
            }
        }
        return answer;
    }
}