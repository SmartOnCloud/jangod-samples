package org.jangod.samples.forms;

import org.jangod.samples.forms.Gender.GenderProvider;

import com.smartoncloud.jangod.form.CharField;
import com.smartoncloud.jangod.form.ChoiceField;
import com.smartoncloud.jangod.form.Form;

/**
 * 
 * @author igor.mihalik
 */
public class PersonForm extends Form {

    @CharField(label = "Name: ")
    private String name;

    @CharField(label = "Surname: ")
    private String surname;
    
    @CharField(label = "Age: ")
    private Integer age;
    
    @ChoiceField(options=GenderProvider.class)
    private Gender gender;

    
    @Override
    public String toString() {
        return "Name: "+name+", Surname: "+surname+", age: "+age+", gender: "+gender;
    }

    /***************** getters/setters ********************/
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
}
