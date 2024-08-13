class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0 , j = 0;
        for(int k = 0;k < commands.size() ; k++){
            switch(commands.get(k)){
                case "UP": i--;break;
                case "DOWN" : i++;break;
                case "LEFT" : j--;break;
                case "RIGHT": j++;break;
                default : continue;
            }
        }
        return i*n+j;
    }
}