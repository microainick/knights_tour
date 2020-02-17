import java.awt.Point;


public class Node  //spot on the board
{
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  int[][] board = new int[8][8];

  int count = 0;
  private boolean markedB = false;
  private int markedI = 0;

  private int available_int;
  // moved to already = selected
  private boolean selected = false;
  //# of places available to move to
  //private Integer available;

  int[] intArray = new int[8];

  //constructor
  public Node(Point p)
  {
    double ax = p.getX();
    double ay = p.getY();
    //available_int = set_available_int(get_available_moves_count());
    set_available_int(get_available_moves_count(p));

  }

  public boolean get_markedB(){
      return markedB;
  }

  public void set_markedB(){
      selected = true;
  }

  public int get_available_int(){
      return available_int;
  }

  public void set_available_int(int i)
  {
      available_int = i;
  }

  public void set_markedI(int i, int j)
  {
      board[i][j] = 1;
  }

  public int get_markedI(int i, int j){
     return board[i][j];
  }

  //public void set_available_array(Point p) {}

/*

  public Node[] get_available_array(Point p)
  {
    Node[] nodeArray = new Node[8];
    int count;
    double x = p.getX();
    double y = p.getY();
    int i = (int)x;
    int j = (int)y;

    //int ax = (int)p.getX();
    //int ay = (int)p.getY();

    8 possible moves

    (i-2; j+ 1);x0
    (i-1; j+ 2);x1
    (i+ 1; j+ 2);x2
    (i+ 2; j+ 1);x3

    (i+ 2; j-1);x4
    (i+ 1; j-2);x5
    (i-1; j-2);x6
    (i-2; j-1);x7


    if ( 0 >= (i-2) > 8  && 0 >= (j+ 1) )
    {
      nodeArray[0].set_markedB();
      nodeArray[0].set_markedI();
    }
    if ( 0 >= ( (i-1) && (j+ 2) ) > 8)
    {
      nodeArray[1].set_markedB();
      nodeArray[1].set_markedI();
    }
    if ( 0 >= ( (i+ 1) && (j+ 2) ) > 8)
    {
      nodeArray[2].set_markedB();
      nodeArray[2].set_markedI();

    }
    if ( 0 >= ( (i+ 2) && (j+ 1) ) > 8)
    {
      nodeArray[3].set_markedB();
      nodeArray[3].set_markedI();

    }

    if ( 0 >= ( (i+ 2) && (j-1) ) > 8)
    {
      nodeArray[4].set_markedB();
      nodeArray[4].set_markedI();

    }
    if ( 0 >= ( (i+ 1) && (j-2) ) > 8)
    {
      nodeArray[5].set_markedB();
      nodeArray[5].set_markedI();

    }

    if ( 0 >= ( (i-1) && (j-2) ) > 8)
    {
      nodeArray[6].set_markedB();
      nodeArray[6].set_markedI();

    }

    if ( 0 >= ( (i-2) && (j-1) ) > 8)
    {
      nodeArray[7].set_markedB();
      nodeArray[7].set_markedI();

    }

    return available;
  }

  */

  public boolean get_selected()
  {
      return selected;
  }

  public void set_selected()
  {
      selected = true;
  }


  public int get_available_moves_count(Point p)
  {
      //Node[] nodeArray = new Node[8];

      double x = p.getX();
      double y = p.getY();
      int i = (int)x;
      int j = (int)y;

      //int ax = (int)p.getX();
      //int ay = (int)p.getY();
      count = 0;

      if (0 <= (i-2) && (i-2) < 8 && 0 <= (j+1) && (j+1) < 8 && this.get_markedI(i-2,j+1) == 0 ) {count++;}

      if (0 <= (i-1) && (i-1) < 8 && 0 <= (j+2) && (j+2) < 8 && this.get_markedI(i-1,j+2) == 0) {count++;}

      if (0 <= (i+1) && (i+1) < 8 && 0 <= (j+2) && (j+2) < 8 && this.get_markedI(i+1,j+2) == 0) {count++;}

      if (0 <= (i+2) && (i+2) < 8 && 0 <= (j+1) && (j+1) < 8 && this.get_markedI(i+2,j+1) == 0) {count++;}

      if (0 <= (i+2) && (i+2) < 8 && 0 <= (j-1) && (j-1) < 8 && this.get_markedI(i+2,j-1) == 0) {count++;}

      if (0 <= (i+1) && (i+1) < 8 && 0 <= (j-2) && (j-2) < 8 && this.get_markedI(i+1,j-2) == 0) {count++;}

      if (0 <= (i-1) && (i-1) < 8 && 0 <= (j-2) && (j-2) < 8 && this.get_markedI(i-1,j-2) == 0) {count++;}

      if (0 <= (i-2) && (i-2) < 8 && 0 <= (j-1) && (j-1) < 8 && this.get_markedI(i-2,j-1) == 0) {count++;}

      return count;
    }

    public int[] find_move(Point p)
    {
      double x = p.getX();
      double y = p.getY();
      int i = (int)x;
      int j = (int)y;

      if (0 <= (i-2) && (i-2) < 8 && 0 <= (j+1) && (j+1) < 8 && this.get_markedI(i-2,j+1) == 0)
      {
        Point p0 = new Point(i-2,j+1);
        intArray[0] = this.get_available_moves_count(p0);
      }

      if (0 <= (i-1) && (i-1) < 8 && 0 <= (j+2) && (j+2) < 8 && this.get_markedI(i-1,j+2) == 0)
      {
        Point p1 = new Point(i-1,j+2);
        intArray[1] = this.get_available_moves_count(p1);
      }

      if (0 <= (i+1) && (i+1) < 8 && 0 <= (j+2) && (j+2) < 8 && this.get_markedI(i+1,j+2) == 0)
      {
        Point p2 = new Point(i+1,j+2);
        intArray[2] = this.get_available_moves_count(p2);
      }

      if (0 <= (i+2) && (i+2) < 8 && 0 <= (j+1) && (j+1) < 8 && this.get_markedI(i+2,j+1) == 0)
      {
        Point p3 = new Point(i+2,j+1);
        intArray[3] = this.get_available_moves_count(p3);
      }

      if (0 <= (i+2) && (i+2) < 8 && 0 <= (j-1) && (j-1) < 8 && this.get_markedI(i+2,j-1) == 0)
      {
        Point p4 = new Point(i+2,j-1);
        intArray[4] = this.get_available_moves_count(p4);
      }

      if (0 <= (i+1) && (i+1) < 8 && 0 <= (j-2) && (j-2) < 8 && this.get_markedI(i+1,j-2) == 0)
      {
        Point p5 = new Point(i+1,j-2);
        intArray[5] = this.get_available_moves_count(p5);
      }

      if (0 <= (i-1) && (i-1) < 8 && 0 <= (j-2) && (j-2) < 8 && this.get_markedI(i-1,j-2) == 0)
      {
        Point p6 = new Point(i-1,j-2);
        intArray[6] = this.get_available_moves_count(p6);
      }

      if (0 <= (i-2) && (i-2) < 8 && 0 <= (j-1) && (j-1) < 8 && this.get_markedI(i-2,j-1) == 0)
      {
        Point p7 = new Point(i-2,j-1);
        intArray[7] = this.get_available_moves_count(p7);
      }

/*
      int position = this.getIndexOfLargest(intArray[]);
      if (position = 0)
      {
        System.out.println("\n\n position 0\n\n");
        // set location for point i.e. the next move
      }
      if (position = 1)
      {

      }
      if (position = 2)
      {

      }
      if (position = 3)
      {

      }
      if (position = 4)
      {

      }
      if (position = 5)
      {

      }
      if (position = 6)
      {

      }
      if (position = 7)
      {

      }
*/
      return intArray;
    }



}
