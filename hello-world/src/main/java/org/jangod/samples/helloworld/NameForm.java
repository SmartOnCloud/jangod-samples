package org.jangod.samples.helloworld;

import com.smartoncloud.jangod.form.CharField;
import com.smartoncloud.jangod.form.Form;

/**
 * 
 * @author igor.mihalik
 */
public class NameForm extends Form {

    @CharField(label = "Name: ")
    private String name;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

}
