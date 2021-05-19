package shared;

import java.io.Serializable;

public class Sample implements Serializable
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

    public void setType(String type)
    {
        this.type = type;
    }

    public void setResult(String result)
    {
        this.result = result;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    @Override public String toString()
    {
        return "Sample{" + "type='" + type + '\'' + ", result='" + result + '\''
            + ", priority=" + priority + '}';
    }
}
