package shared;

public class Sample
{
    private String type;
    private String result;
    private int priority;

    public Sample(String type, String result, int priority)
    {
        this.type = type;
        this.result = result;
        this.priority = priority;
    }

    public String getType()
    {
        return type;
    }

    public String getResult()
    {
        return result;
    }

    public int getPriority()
    {
        return priority;
    }
}
