import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.awt.Point;


public class Driver extends Clear
{

  public static void main(String[] args) {

    //Clear theClear = new Clear();
    //theClear.
    //clearConsole();

    Prompt thePrompt = new Prompt();
    Show theShow = new Show();

    thePrompt.display();
    thePrompt.message();

    // could make this one line
    int y = thePrompt.askY();
    int x = thePrompt.askX();
    Point top = new Point(x, y);
    Node head = new Node(top);
    head.set_markedI(x,y);

    int value = head.get_available_moves_count(top);

    // shows coordinates
    System.out.println(top.toString());
    top.getLocation();
    System.out.print("\n\nThis many moves available:   ");
    System.out.println(value);
    System.out.println(" \n\n");



    theShow.show(top);

    int[] myArray = new int[8];
    myArray = head.find_move(top);
    System.out.println(Arrays.toString(myArray));
    //Driver theDriver = new Driver();
    System.out.println(getIndexOfLargest(myArray));

  }

  public static int getIndexOfLargest( int[] array )
  {
    if ( array == null || array.length == 0 ) return -1; // null or empty

    int largest = 0;
    for ( int i = 1; i < array.length; i++ )
    {
      if ( array[i] > array[largest] ) largest = i;
    }
    return largest; // position of the first largest found
  }

}
