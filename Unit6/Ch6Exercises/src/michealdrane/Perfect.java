package src.michealdrane;

public class Perfect {
    public static void main(String[] args) {
        System.out.println("The Perfect Numbers are: ");
        int min = 1;
        int max = 1000;

        for(min = 1; min <= max; min++) {
            int sum = 0;
            
            for(int i = 1; i < min; i++) {
                if((min % i) == 0) {
                    sum += i;
                }
            }
            if(sum == min) {
                System.out.println(min);
            }
        }
    }
}