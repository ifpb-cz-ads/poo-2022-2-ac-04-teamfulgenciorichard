class BMExercicio08 {
    public static void main(String[] args) {
        final int multiplo = 3;

        int number;

        for(number = 1; number <= 100; number++){

            if(number % multiplo == 0){
                System.out.println(number);
            }
            
        }
    }
}
