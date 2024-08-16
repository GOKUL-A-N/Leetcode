class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(checkBoard(board,word,i,j,r,c,0)) return true;
            }
        }
        return false;
    }

    private boolean checkBoard(
        char[][] board,String word,int i,int j,int r,int c,int curr
    ){
        if(curr >= word.length()) return true;
        if(
            i<0 || j < 0 || i >= r || j>= c || board[i][j] != word.charAt(curr)
        ) return false;
        boolean exists = false;
        if(board[i][j] == word.charAt(curr))
        {
            board[i][j] += 100;
          exists=checkBoard(board,word,i+1,j,r,c,curr+1) ||
                 checkBoard(board,word,i-1,j,r,c,curr+1) ||
                 checkBoard(board,word,i,j+1,r,c,curr+1) ||
                 checkBoard(board,word,i,j-1,r,c,curr+1);
        board[i][j] -= 100;
        }
        return exists;
    }
}