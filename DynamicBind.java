import java.util.Scanner;

public class DynamicBind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1:Cat 2:Duck 3:Puppy 선택> ");
        int no = sc.nextInt();

        Base base;
        switch (no) {
            case 1:
                base = new Cat();
                break;
            case 2:
                base = new Duck();
                break;
            case 3:
                base = new Puppy();
                break;
            default:
                System.out.println("잘못된 번호입니다: " + no);
                sc.close();
                return;
        }

        base.Start();
        base.Stop();

        sc.close();
    }
}
