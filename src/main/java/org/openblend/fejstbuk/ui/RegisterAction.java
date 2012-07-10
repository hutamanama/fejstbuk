package org.openblend.fejstbuk.ui;

import org.openblend.fejstbuk.domain.User;

import java.io.Serializable;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

/**
 * @author <a href="mailto:tomaz.cerar@redhat.com">Tomaz Cerar</a>
 */
@ConversationScoped
@Named
public class RegisterAction implements Serializable {
    private String name;
    private String lastName;
    private String country;
    private String register;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }


    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }


    public void register(){
        User user = new User();
        user.setName(name);
        user.setSurname(lastName);
        user.setLocation(country);
         }
}
