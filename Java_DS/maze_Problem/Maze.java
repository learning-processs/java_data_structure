package maze_Problem;

import java.util.ArrayList;

// Only Go right and down
// 3 * 3 matrix
public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));

        pathPrint("", 3, 3);

        System.out.println(pathPrintList("", 3, 3));

        System.out.println(pathPrintDiagonal("", 3, 3));


        boolean board[][] = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };
        System.out.println(pathPrintWithObstacle("", board , 0, 0));

    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void pathPrint(String processed, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(processed);
            return;
        }

        if (r > 1) {
            pathPrint(processed + 'D', r - 1, c); // left rec call
        }
        if (c > 1) {
            pathPrint(processed + 'R', r, c - 1); // right rec call

        }

    }

    static ArrayList<String> pathPrintList(String processed, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathPrintList(processed + 'D', r - 1, c)); // left rec call
        }
        if (c > 1) {
            list.addAll(pathPrintList(processed + 'R', r, c - 1)); // right rec call

        }

        return list;
    }

    // Can Go Right , Diagonal , Down....

    static ArrayList<String> pathPrintDiagonal(String processed, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;

        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathPrintDiagonal(processed + 'D', r - 1, c - 1)); // left rec call
        }

        if (r > 1) {
            list.addAll(pathPrintDiagonal(processed + 'V', r - 1, c)); // left rec call
        }
        if (c > 1) {
            list.addAll(pathPrintDiagonal(processed + 'H', r, c - 1)); // right rec call

        }

        return list;
    }

    // MAZE WITH OBSTICALE......

    static ArrayList<String> pathPrintWithObstacle(String processed, boolean maze[][], int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        if (r < maze.length - 1) {
            list.addAll(pathPrintWithObstacle(processed + 'D', maze, r + 1, c)); // left rec call
        }
        if (c < maze[0].length - 1) {
            list.addAll(pathPrintWithObstacle(processed + 'R', maze, r, c + 1)); // right rec call

        }

        return list;
    }

}
