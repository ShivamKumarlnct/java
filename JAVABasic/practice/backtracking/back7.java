package practice.backtracking;

public class back7{
    // step6
    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
// step5
    public static boolean isSafe(int maze[][], int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 1);
    }
// step3
    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        if (x == maze.length - 1 && y == maze[0].length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        // step4
        if (isSafe(maze, x, y)) {
            if (sol[x][y] == 1)
                return false;
            sol[x][y] = 1;

            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            sol[x][y] = 0;
            return false;
        }
        return false;
    }
// step:2
    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];
        if (solveMazeUtil(maze, 0, 0, sol)==false) {
            System.out.println("Solution does not exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    public static void main(String args[]) {
        // step:1
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        solveMaze(maze);
    }
}
