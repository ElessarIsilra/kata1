/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        System.out.println("hola mundo");


        Person p1;
        Calendar f;
        f = GregorianCalendar.getInstance();
        f.set(1964, 7, 3);
        p1 = new Person("Enrique", "Ramon", f);
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday().getTime());
        System.out.println(p1.getAge());
        System.out.println("Fin");
    }
}
