import java.util.Scanner;

class BMExercicio07 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int x;
        int y = 0;

        System.out.println("Insira um numero: ");
        x = number.nextInt();

        System.out.print(x);

        do {
            int resto = x % 2;

            if(resto == 0){
                y = x / 2;
            }
            else{
                y = 3 * x + 1;
            }

            System.out.print("->" + y );

            x = y;

        } while(y != 1);

        number.close();
    }
}
