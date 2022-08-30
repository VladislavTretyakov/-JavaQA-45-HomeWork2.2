public class Main {
    public static void main(String[] args) {

        int balance = 300; // Сумма на счету
        int pain = 1001; // Пополнение счета
        int onePoint = 100; // Колличество у.е. за один дополнительную у.е.
        if (pain > 1000) {
            System.out.println(pain / onePoint);
            System.out.println(balance + pain);
        } else {
            System.out.println(balance + pain);
        }

    }
}
