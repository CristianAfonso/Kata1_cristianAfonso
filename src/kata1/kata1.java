/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;
import static java.util.Calendar.MONTH;

public class kata1 {
    public static void main(String[] args) {
        Person cristian = new Person("Cristian Afonso", LocalDate.of(1997,Month.SEPTEMBER,25));
        System.out.println(cristian.toString());
    }
}
