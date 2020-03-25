package estructuras;

public class Status
{
    public final static int STARTED = 1;
    public final static int IN_PROCESS = 2;
    public final static int FINISHED = 3;
    private static String name;

    public static String getName()
    {
        return name;
    }

    public static void setName(String name)
    {
        Status.name = name;
    }
}
