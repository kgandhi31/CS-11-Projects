
public class Ex1_ArrayIntro {

    public static void main(String[] args) {

        String[] allNames = {"Bob", "Stu", "Dina", "Jasmine", "Sylvio"}; ////filled array
        int[] allGrades = {10, 11, 12, 10, 12};
        int[] test1Marks = new int[5]; ////empty array
        test1Marks[0] = 55;
        test1Marks[1] = 77;
        test1Marks[2] = 86;
        test1Marks[3] = 98;
        test1Marks[4] = 47;

        System.out.println("Marks Summary");
        for (int i = 0; i < allNames.length; i++) {
            System.out.println(allNames[i] + "  " + allGrades[i] + "  " + test1Marks[i]);
        }

        test1Marks[0] = -1;
        test1Marks[4] = -1;
        System.out.println("Rewriting the test");
        for (int i = 0; i < allNames.length; i++) {
            if (test1Marks[i] == -1) {
                System.out.println(allNames[i]);
            }
        }
        System.out.println("Full Marks Report");
        for (int i = 0; i < allNames.length; i++) {
            if (test1Marks[i] == -1) {
                test1Marks[i] = 0;
            }
            System.out.println(allNames[i] + "  " + allGrades[i] + "  " + test1Marks[i]);
        }
    }//end main

}//end class
