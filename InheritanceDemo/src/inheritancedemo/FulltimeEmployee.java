/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author SK
 */
@Entity
//@DiscriminatorValue("FULLTIME")
public class FulltimeEmployee extends Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(String name, double salary) {
        super.setName(name);
        this.salary = salary;
    }
    
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
