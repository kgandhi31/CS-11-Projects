package TeacherConference;


public class Teacher {
    public String name;
    public int years;
    public boolean onThurs;
    public boolean onFri;
    public String gradeLevel;
    public String district;
    
    public Teacher(String n, int y, boolean t, boolean f, String g, String d){
        name = n;
        years = y;
        onThurs =t;
        onFri = f;
        gradeLevel = g;
        district = d;
    }
}
