import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int chon;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        System.out.println("nhap chon");
        chon= scanner.nextInt();
        switch (chon){
            case 1:
                if (n%2==0){
                    System.out.println("la so chan");
                }else {
                    System.out.println(" la so le");
                }
                break;
            case 2:
                if (n%7==0){
                    System.out.println("la so chia het cho 7");
                }else {
                    System.out.println("khong phai la so chia het cho 7");
                }break;
            case 3:
                for (int i=1;i<n;i++){
                    double j=Math.sqrt(i);
                    if (i==Math.pow(j,2)){
                        System.out.println("cac so chinh phuong nho hon n la : "+i);
                    }
                }
            default:
                System.out.println("lenh khong dung");
        }
    }
}