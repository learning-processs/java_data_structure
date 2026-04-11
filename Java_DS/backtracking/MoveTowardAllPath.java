package backtracking;

import java.util.ArrayList;

public class MoveTowardAllPath {
    public static void main(String[] args) {
        boolean board[][] = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };
        System.out.println(allPath("", board , 0, 0));
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
}
