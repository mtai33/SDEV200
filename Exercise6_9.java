public class Exercise6_9 {
    public static void main(String[] args) {
        System.out.println("\nFeet     Meters     |     Meters     Feet\n" +
        "----------------------------------------------");

        double foot = 1; double meter = 20;
        
        for (int i = 1; i <= 10; foot++, meter+= 5, i++){
            System.out.printf("%4.1f%10.3f%20.1f%10.3f\n", foot, footToMeter(foot), meter, meterToFoot(meter));
        }
    }
    public static double footToMeter(double foot){
      return 0.305 * foot;
    }
    
    public static double meterToFoot(double meter){
      return (1 / 0.305) * meter;
    }
}