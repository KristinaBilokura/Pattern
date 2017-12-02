package PatternSingleton;
public class Singleton {
    private Singleton() { }
    private static Singleton SingletonInstance = null;
    public synchronized static Singleton getInstance()
    {
        if (SingletonInstance == null)
        {
            SingletonInstance = new Singleton();
        }
        return SingletonInstance;
    }
    public String message(String line)
    {
        System.out.println(line);
        return line;
    }

}
