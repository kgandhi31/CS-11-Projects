package GUI_OOP_Project;

public class StudentInfo {

//instance variables
    public String studentID;
    public String courseCode;
    public int english;
    public int social;
    public int math;
    public int biology;
    public int chemistry;
    public int physics;
    public int computing;
    public int gym;

//constructor methods - used to pass in variables and run instance methods
    public StudentInfo(String id, String code, int eng, int soc, int mat, int bio, int chem, int phy, int comp, int physed) {

        studentID = id;
        courseCode = code;
        english = eng;
        social = soc;
        math = mat;
        biology = bio;
        chemistry = chem;
        physics = phy;
        computing = comp;
        gym = physed;
    }

//instance methods
    public String getTotalScore() {
        int sum = (english + social + math + biology + chemistry + physics + computing + gym);
        return ("" + sum);
    }//end getSumScore

    public String getAverage() {
        int avg = ((english + social + math + biology + chemistry + physics + computing + gym) / 8);
        return ("" + avg);
    }//end getAverage

    public String getRanking() {
        int sum = ((english + social + math + biology + chemistry + physics + computing + gym));
        if (sum >= 720) {
            return "A1";
        } else if ((sum < 720) && (sum >= 640)) {
            return "A2";
        } else if ((sum < 640) && (sum >= 560)) {
            return "B1";
        } else if ((sum < 560) && (sum >= 480)) {
            return "B2";
        } else if ((sum < 480) && (sum >= 400)) {
            return "C";
        } else {
            return "Fail";
        }
    }//end getSumScore
}//end class

