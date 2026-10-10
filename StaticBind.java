import java.util.Scanner;

public class StaticBind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1:Cat 2:Duck 3:Puppy 선택> ");
        int no = sc.nextInt();

        switch (no) {
            case 1:
                Cat cat = new Cat();
                cat.Start();
                cat.Stop();
                break;
            case 2:
                Duck duck = new Duck();
                duck.Start();
                duck.Stop();
                break;
            case 3:
                Puppy puppy = new Puppy();
                puppy.Start();
                puppy.Stop();
                break;
            default:
                System.out.println("잘못된 번호입니다: " + no);
        }

        sc.close();
    }
}
