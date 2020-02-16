

// I am not a windows user
// so I got help making sure my program runs on garbage windows machines.
// this code comes from https://stackoverflow.com/users/2469257/dyndrilliac

public class Clear
{
  public final static void clearConsole()
  {
    try
    {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }
    catch (final Exception e)
    {
        //  Handle any exceptions.
    }
  }
}
