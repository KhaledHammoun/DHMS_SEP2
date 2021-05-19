package shared;

public class Ward
{
    private String wardsName;
    private int roomNumber;

    public Ward(String wardsName, int roomNumber)
    {
        this.wardsName = wardsName;
        this.roomNumber = roomNumber;
    }

    public String getWardsName()
    {
        return wardsName;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }
}