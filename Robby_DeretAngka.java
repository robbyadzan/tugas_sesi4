public class Robby_DeretAngka {
    public static void main(String[] args) {
        
        int n = 9;
        
        
        int[] deret = new int[n];
        
       
        deret[0] = 1;
        deret[1] = 1;
        deret[2] = 2; 
        
        
        for (int i = 3; i < n; i++) {
            deret[i] = deret[i-1] + deret[i-2] + deret[i-3]; 
        }
        
        
        for (int i = 0; i < n; i++) {
            System.out.print(deret[i] + " ");
        }
    }
}
