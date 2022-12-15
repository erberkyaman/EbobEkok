import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int i=1,control=0,ebob=0,ekok=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayı : ");
        int n1 = input.nextInt();

        System.out.print("İkinci Sayı : ");
        int n2 = input.nextInt();
        if (n1<n2){
            control=n1;
        }else {
            control=n2;
        }

        while(i<=control){
            if (n1%i==0 && n2%i==0){
                ebob=i;

            }
            i++;
        }
        i = 1;
        while(i <=(n1*n2)){
            if (i%n1==0 && i%n2==0){
                ekok=i;
                break;
            }
            i++;
        }

        System.out.println("Girdiğiniz Sayıların Ebob'u :"+ebob);
        System.out.print("Girdiğiniz Sayıların Ekok'u : "+ekok);
    }
}
