package org.jangod.samples.forms;

import java.util.Arrays;
import java.util.List;

import com.smartoncloud.jangod.form.OptionProvider;

public enum Gender implements OptionProvider.Option {
    MALE, FEMALE, UNKNOWN;

    @Override
    public String value() {
	return name();
    }

    @Override
    public String label() {
	return name();
    }

    @Override
    public boolean standsFor(Object object) {
	return this.equals(object);
    }

    public static class GenderProvider implements OptionProvider {
	@Override
	public List<? extends Option> getOptions() {
	    return Arrays.asList(Gender.values());
	}
    }
}
