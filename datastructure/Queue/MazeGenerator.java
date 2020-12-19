package datastructure.Queue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MazeGenerator {
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter(new File("file/maze.txt"));
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                if (Math.random() < 0.3) {
                    pw.print("x");
                } else {
                    pw.print(" ");
                }
            }
            pw.println();
        }
        pw.close();
    }
}
