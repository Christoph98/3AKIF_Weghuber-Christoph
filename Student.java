public class Student
{
    private String name;
    private int alter;
    private boolean Matura;
    private String Religion;
    
    public Student(String neuName, int neuAlter, String neuReligion, boolean neuMatura)
    {
        setName (neuName);
        setAlter (neuAlter);
        setReligion (neuReligion);
        setMatura (neuMatura);
    }

    public void setName(String neuname)
    {
        neuname = name;
    }

    public void setAlter(int neualter)
    {
        neualter = alter;
    }
    
    public void setMatura(boolean neuMatura)
    {
        Matura = neuMatura;
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
        return Matura;
    }
    
    public String Religion()
    {
        return Religion;
    }

    public void setReligion(String neuReligion)
    {
        Religion = neuReligion;
    }
}
