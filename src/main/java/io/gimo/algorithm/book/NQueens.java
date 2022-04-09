package io.gimo.algorithm.book;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    private List<char[][]> boards = new ArrayList<>();
    private int width;

    private List<List<String>> solveNQueens(int n) {
        this.width = n;
        char[][] board = new char[n][n];
        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = '.';
            }
        }
        backtrack(board, 0);
        return convertRes(boards);
    }

    private List<List<String>> convertRes(List<char[][]> boards) {
        List<List<String>> ret = new ArrayList<>(width);
        for (char[][] board : boards) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < width; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < width; j++) {
                    row.append(board[i][j]);
                }
                result.add(row.toString());
            }
            ret.add(result);
        }
        return ret;
    }

    private void backtrack(char[][] board, int row) {
        if (row == width) {
            boards.add(cloneBoard(board));
            return;
        }
        for (int col = 0; col < width; col++) {
            // 判断是否符合八皇后要求
            if (!isValid(board, row, col)) {
                continue;
            }
            board[row][col] = 'Q';
            backtrack(board, row + 1);
            board[row][col] = '.';
        }
    }

    private char[][] cloneBoard(char[][] board) {
        char[][] copy = new char[width][width];
        for (int i = 0; i < width; i++) {
            System.arraycopy(board[i], 0, copy[i], 0, width);
        }
        return copy;
    }

    private boolean isValid(char[][] board, int row, int col) {
        for (int i = 0 ; i < row; i ++ ) {
            if ('Q' == board[i][col]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0 ; i --, j --) {
            if ('Q' == board[i][j]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < width ; i --, j ++) {
            if ('Q' == board[i][j]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        NQueens queen = new NQueens();
        queen.solveNQueens(8);
    }

}
