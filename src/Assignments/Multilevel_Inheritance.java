package Assignments;

public class Multilevel_Inheritance {
    public static void main(String[] args) {

        SuperAdmin s = new SuperAdmin();
        s.shutdownSystem();
        s.accessAdminPanel();
        s.login();
    }

}
class User{
    void login(){
        System.out.println("This is login details");
    }
}
class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("This is access Admin panel");
    }

}
class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("This is shut down system");
    }

}
