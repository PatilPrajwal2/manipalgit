package org.openqa.selenium;

public @interface By {

	static Object xpath(String string);

	static Object name(String string);

	static Object id(String string);

}
