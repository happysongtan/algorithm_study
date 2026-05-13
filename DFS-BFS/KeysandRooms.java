class Solution {
    public boolean haskey(int roomsNumber,List<List<Integer>> rooms,boolean[] visited){
        visited[roomsNumber]=true;
        for(int key : rooms.get(roomsNumber)){
            if(!visited[key]){
                haskey(key,rooms,visited);
            }
        }
        return false;
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean [rooms.size()];
        haskey(0,rooms,visited);
        for(boolean v : visited){
            if(!v){
                return false;
            }
        }
        
        return true;
    }
}
