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
//@DiscriminatorValue("PARTTIME")
public class ParttimeEmployee extends Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(String name, int time) {
        super.setName(name);
        this.time = time;
    }
    
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
