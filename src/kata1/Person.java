package kata1;

import java.time.LocalDate;

/**
 *
 * @author can97
 */
public class Person {
    public final String name;
    public final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return years(LocalDate.now().toEpochDay() - birthdate.toEpochDay());
    }

    @Override
    public String toString() {
        return getName() + " tiene " + getAge() + " años.";
    }
    
    
    private int years(long days) {
        return (int) days/365;
    }
    
}
