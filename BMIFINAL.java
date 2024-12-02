public class BMI {
    public static void main(String[] args) {
        
        double  height = 1.62;
        double  weight = 50;
        double BMIResult = weight / (height * height);
        System.out.println("BMIRESULT:" + BMIResult);
        System.out.print("WEIGHT TYPES: ");

        if (BMIResult < 18.5) {
            System.out.println("UNDERWEIGHT");
        } 
        else if  (BMIResult>= 18.5 && BMIResult < 25.0) {
            System.out.println("NORMAL");
        } 
         else  if (BMIResult >= 25.0 && BMIResult< 30.0) {
            System.out.println("OVERWEIGHT");
        } 
         else if  (BMIResult >= 30.0) {
            System.out.println("OBESE");
        }
    }
}

