public class Student
{
    private String name;
    private int alter;
    private boolean matura;
    private String religion;
    
    public Student(String neuName, int neuAlter, String neuReligion, boolean neuMatura)
    {
        setName (neuName);
        setAlter (neuAlter);
        setReligion (neuReligion);
        setMatura (neuMatura);
    }

    public void setName(String neuName)
    {
        name = neuName;
    }

    public void setAlter(int neuAlter)
    {
        alter = neuAlter;
    }
    
    public void setMatura(boolean neuMatura)
    {
        matura = neuMatura;
    }

    public String getName()
    {
        return name;
    }

    public int getAlter()
    {
        return alter;
    }
    
    public boolean getMatura()
    {
        return matura;
    }
    
    public String religion()
    {
        return religion;
    }

    public void setReligion(String neuReligion)
    {
        religion = neuReligion;
    }
}
