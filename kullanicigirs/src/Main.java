import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner girdi = new Scanner(System.in);
    String id, sifre, ysifre;
    int secim;

    System.out.print("Kullanıcı Adınızı Giriniz: ");
    id=girdi.nextLine();
    System.out.print("Şifrenizi Giriniz: ");
    sifre=girdi.nextLine();
    if (id.equals("Tolga") &&(sifre.equals("123"))){
        System.out.println("Oturumunuz Açildı.");
    }
    else {
        System.out.print("Kullanıcı Adınız veya Şifreniz Yanlış");
        System.out.println("Şifrenizi Sıfırlamak İstiyor Musunuz? \n1-Evet \n2-Hayır");
    }
        secim=girdi.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Yeni Şifrenizi Oluşturunuz");
                ysifre = girdi.nextLine();
                if (sifre.equals(ysifre)){
                    System.out.print("Yeni Şifre Eskisiyle Aynı olamaz");
                }
                else
                    System.out.print("Şifreniz oluşturuldu");
                break;
            case 2:
                System.out.println("Tekrar Şifrenizi Deneyin");
            default:
                System.out.print("İşleminiz Tamamlandı");
                break;
        }

    }

}
