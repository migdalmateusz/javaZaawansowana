package Exc7;

public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine(5);

//        System.out.println(magazine.isLoaded());
        magazine.loadBullet("bullet");
        magazine.loadBullet("bullet");
        magazine.loadBullet("bullet");
        magazine.loadBullet("bullet");
        magazine.loadBullet("bullet");
        System.out.println(magazine.isLoaded());
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
    }


}
