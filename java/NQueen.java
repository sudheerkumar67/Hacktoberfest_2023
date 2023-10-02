import java.util.*;

class NQueen {
    public static void saveBoard(char[][] Board, List<List<String>> AllBoards) {
        List<String> newBor = new ArrayList<>();
        String brbr = "";
        for (int r = 0; r < Board.length; r++) {
            brbr = "";
            for (int c = 0; c < Board[0].length; c++) {
                if (Board[r][c] == 'Q')
                    brbr += 'Q';
                else
                    brbr += '.';
            }
            newBor.add(brbr);
        }
        AllBoards.add(newBor);
    }

    public static boolean issafe(char[][] Board, int col, int row) {
        // hori
        for (int c = 0; c < Board[0].length; c++) {
            if (Board[row][c] == 'Q')
                return false;
        }
        // vert
        for (int r = 0; r < Board.length; r++) {
            if (Board[r][col] == 'Q')
                return false;
        }
        // upleft
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (Board[r][c] == 'Q')
                return false;
        }
        // upright
        r = row;
        for (int c = col; c < Board.length && r >= 0; c++, r--) {
            if (Board[r][c] == 'Q')
                return false;
        }
        // dwleft
        r = row;
        for (int c = col; r < Board[0].length && c >= 0; c--, r++) {
            if (Board[r][c] == 'Q')
                return false;
        }
        // dwright
        r = row;
        for (int c = col; r < Board.length && c < Board[0].length; c++, r++) {
            if (Board[r][c] == 'Q')
                return false;
        }
        return true;
    }

    public static void helper(List<List<String>> AllBoards, char[][] Board, int col) {
        if (col == Board[0].length) {
            saveBoard(Board, AllBoards);
            return;
        }
        for (int i = 0; i < Board.length; i++) {
            if (issafe(Board, col, i)) {
                Board[i][col] = 'Q';
                helper(AllBoards, Board, col + 1);
                Board[i][col] = '.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> AllBoards = new ArrayList<>();
        char[][] Board = new char[n][n];

        helper(AllBoards, Board, 0);
        return AllBoards;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solveNQueens(n));
    }
}