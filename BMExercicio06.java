import java.util.Scanner;

class BMExercicio06 {
    public static void main(String[] args) {
        
        Scanner control = new Scanner(System.in);

        int number;

        do{

            System.out.print("Insira um numero de 1 a 7 ou 0 para sair: ");
            number = control.nextInt();

            if(number == 0){
                System.out.println("Saindo...");
            }
            else if(number == 1){
                System.out.println("Domingo!");
            }
            else if(number == 2){
                System.out.println("Segunda!");
            }
            else if(number == 3){
                System.out.println("Terca!");
            }
            else if(number == 4){
                System.out.println("Quarta!");
            }
            else if(number == 5){
                System.out.println("Quinta!");
            }
            else if(number == 6){
                System.out.println("Sexta!");
            }
            else if(number == 7){
                System.out.println("Sabado!");
            }
            else {
                System.out.println("Valor invalido!");
            }

        } while(number != 0);
        
        control.close();
    }
}
