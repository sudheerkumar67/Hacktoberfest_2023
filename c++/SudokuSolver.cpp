// Sudoku Solver

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isValid(vector<vector<char>>& board, int row, int col, char c){
        for(int i = 0; i < 9; i++){
            // check the row
            if(board[row][i] == c) return false;
            
            // check column
            if(board[i][col] == c) return false;
            
            // check sub-grid
            if(board[(3 * (row/3) + (i/3))][(3 * (col/3) + (i%3))] == c) return false;
        }
        return true;
    }
    bool solve(vector<vector<char>>& board){
        for(int i = 0; i < board.size(); i++){
            for(int j = 0; j < board[0].size(); j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){
                        if(isValid(board, i, j, c)){
                            board[i][j] = c;
                            
                            if(solve(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    void solveSudoku(vector<vector<char>>& board) {
        solve(board);
    }
};
int main() {
	int t;
	cin>>t;
	while(t--)
	{
    vector<vector<int>> grid(9, vector<int>(9, 0));
		
		for(int i=0;i<9;i++)
		    for(int j=0;j<9;j++)
		        cin>>grid[i][j];
		        
		Solution ob;
		ob.solveSudoku(grid);
	}
	return 0;
}
