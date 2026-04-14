package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveTowardAllPath {
    public static void main(String[] args) {
        boolean board[][] = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };
        System.out.println(allPath("", board , 0, 0));



        int [][] path = new int[board.length][board[0].length];
        allPathPrint("", board , 0, 0 , path,1);

    }

    static ArrayList<String> allPath(String processed, boolean maze[][], int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(!maze[r][c]){
            return new ArrayList<>();
        }

        maze[r][c] = false;
        if (r < maze.length - 1) {
            list.addAll(allPath(processed + 'D', maze, r + 1, c)); // Down rec call
        }

        if (r > 0) {
            list.addAll(allPath(processed + 'U', maze, r - 1, c)); // Up rec call
        }

        if (c < maze[0].length - 1) {
            list.addAll(allPath(processed + 'R', maze, r, c + 1)); // right rec call
        }

        if (c > 0) {
            list.addAll(allPath(processed + 'L', maze, r, c - 1)); // left rec call

        }
        
        maze[r][c] = true;
        return list;
    }




     static void allPathPrint(String processed, boolean maze[][], int r, int c , int[][] path , int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[]arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
           allPathPrint(processed + 'D', maze, r + 1, c , path , step+1); // Down rec call
        }

        if (r > 0) {
            allPathPrint(processed + 'U', maze, r - 1, c, path , step+1); // Up rec call
        }

        if (c < maze[0].length - 1) {
            allPathPrint(processed + 'R', maze, r, c + 1, path , step+1); // right rec call
        }

        if (c > 0) {
            allPathPrint(processed + 'L', maze, r, c - 1, path , step+1); // left rec call

        }
        
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
