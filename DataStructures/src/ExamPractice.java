
public class ExamPractice {

    
    public static void main(String[] args) {

        double[][] numbers = new double[4][4];
        numbers[0][3] = -15.98;
        
        int[] exam = {5,2,-16,10,25,30};
        //find the highest item in the array
        int foundIndex = exam[0];
        for (int i = 0; i < exam.length; i++){
            if (exam[i] > foundIndex){
                foundIndex = exam[i];
            }
        }
        System.out.println("The highest number in the array is: " + foundIndex);
        
        //write a for loop to increase by 5 all items in a 1D int array
        for (int i = 0; i < exam.length; i++){
            exam[i]+=5;
        }
        
        //write a for loop to increase by 5 to all items ending in a 5 or Zero in an 1D int array
        //use a mod: % // this divides the number at [i] by a certain number
        for (int i = 0; i < exam.length; i++){
            if (exam[i] % 5 == 0 ){
                exam[i]+=5;
            }
        }

    }//end main
    
}//end class
