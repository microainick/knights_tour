import java.util.Scanner;
import java.awt.Point;

public class Show
{
  public void show(Point p)
  {

    System.out.println("\n\nHere is your requested starting position\n");

    double x = p.getX();
    double y = p.getY();
    int ax = (int)x;
    int ay = (int)y;
    System.out.printf("\n    _______________________________________________________________\n");
      //rowNum = 8;
      for (int j=7, rowNum = 7; j > ay; j--, rowNum--)
      {
        System.out.printf("   |       |       |       |       |       |       |       |       |\n");
        System.out.printf(" %d |       |       |       |       |       |       |       |       |\n", rowNum);
        //rowNum--;
        System.out.printf("   |_______|_______|_______|_______|_______|_______|_______|_______|\n");
      }
      //int rowNum = 7 - ay;
      System.out.printf("   |       |       |       |       |       |       |       |       |\n");
      System.out.printf(" %d |", ay);
      //rowNum--;
      for (int k = 0; k < ax; k++)
      {
        System.out.printf("       |");
      }
      System.out.printf("   ♞   |");
      for (int l = ax; l < 7; l++)
      {
        System.out.printf("       |");
      }
      System.out.printf("\n   |_______|_______|_______|_______|_______|_______|_______|_______|\n");
      //printf("\n   |_____|_____|_____|_____|_____|_____|_____|_____|\n");

      //rowNum = 7 - ay;
      for (int i = (ay-1); i > -1; i--)
      {
        System.out.printf("   |       |       |       |       |       |       |       |       |\n");
        System.out.printf(" %d |       |       |       |       |       |       |       |       |\n", i);
        //printf(" %d |     |     |     |     |     |     |     |     |\n", rowNum);
        //rowNum--;
        System.out.printf("   |_______|_______|_______|_______|_______|_______|_______|_______|\n");
        //printf("   |_____|_____|_____|_____|_____|_____|_____|_____|\n");
      }
      System.out.printf("\n       0       1       2       3       4       5       6       7  \n");
  } //end method

}
