class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set=new HashSet<>();     
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                Character curr=board[i][j];
                if(curr!='.'){
                    if(!set.add(curr+"in row"+i)||!set.add(curr+"in col"+j)||!set.add(curr+"in box"+(i/3)+"-"+(j/3))) {
                    return false;
                    }
                }
            }
        }
        return true;
    }
}