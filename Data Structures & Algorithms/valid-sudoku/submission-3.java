class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }if(set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                HashSet<Character> set=new HashSet<>();
                int boxStartRow=(i/3)*3;
                int boxStartCol=(j/3)*3;
                for(int k=0;k<9;k++){
                    int r=boxStartRow+k/3;
                    int c=boxStartCol+k%3;
                    if(board[r][c]=='.'){
                    continue;
                    }if(set.contains(board[r][c])){
                    return false;
                    }
                    set.add(board[r][c]);
                }
                }
            }
        return true;
    }
}
