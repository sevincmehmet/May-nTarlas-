import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int satir;
        int sutun;

        Scanner inp = new Scanner(System.in);
        System.out.println("Tarlanın satır boyutunu giriniz : ");
        satir = inp.nextInt();

        System.out.println("Tarlanın sütun boyutunu giriniz : ");
        sutun = inp.nextInt();

        MineSweeper m1 = new MineSweeper(satir,sutun);

        m1.run();

        inp.close();
    }
}