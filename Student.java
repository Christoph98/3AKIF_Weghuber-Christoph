public class Student
{
    private String name;
    private int alter;
    private boolean Matura;
    private boolean mannlich;
    private String Religion;
    
    public Student()
    {
        setName("Thomas");
        setAlter(40);
        setMannlich(true);
    }

    public Student(String name, int alter, boolean mannlich)
    {
        setName(name);
        setAlter(alter);
        setMannlich(mannlich);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public void setMannlich(boolean mannlich)
    {
        this.mannlich = mannlich;
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

    public boolean getMannlich()
    {
        return mannlich;
    }

    public void printStudent()
    {
        System.out.println("Student:\t" + name + "\t" + alter + "\t" + mannlich);
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
