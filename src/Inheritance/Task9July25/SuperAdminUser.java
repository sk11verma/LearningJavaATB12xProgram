package Inheritance.Task9July25;

import com.sun.tools.javac.Main;

public class SuperAdminUser extends AdminUser{
    public static void main(String[] args) {
SuperAdminUser s=new SuperAdminUser();
s.login();
s.accessAdminPanel();
s.shutdownSystem();
    }
    void shutdownSystem()
    {
        System.out.println("Super Admin can Shutdown");
    }
}
