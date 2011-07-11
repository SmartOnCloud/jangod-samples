package org.jangod.samples.helloworld;

public class CoffeArticle {

    private final String image;
    private final String title;
    private final String text;

    public CoffeArticle(String image, String title, String text) {
	this.image = image;
	this.title = title;
	this.text = text;
    }

    public String getImage() {
	return image;
    }

    public String getTitle() {
	return title;
    }

    public String getText() {
	return text;
    }

}
