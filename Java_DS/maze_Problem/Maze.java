package maze_Problem;

// Only Go right and down
// 3 * 3 matrix
public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));

        pathPrint("", 3, 3);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }


     static void pathPrint(String processed ,int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(processed);
            return;
        }

        if(r > 1 ){
            pathPrint(processed + 'D',r - 1, c); // left rec call
        }
        if(c > 1 ){
            pathPrint(processed + 'R',r, c - 1); // right rec call

        }

    }
}
