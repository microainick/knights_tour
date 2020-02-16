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

    // shows coordinates
    System.out.println(top.toString());
    top.getLocation();
    //System.out.println(top.getLocation());

    theShow.show(top);

  }

}
