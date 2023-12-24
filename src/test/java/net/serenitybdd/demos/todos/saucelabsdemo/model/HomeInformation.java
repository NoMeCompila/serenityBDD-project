package net.serenitybdd.demos.todos.saucelabsdemo.model;

public class HomeInformation {

    private final String appLogo;


    public HomeInformation(String appLogo) {
        this.appLogo = appLogo;
        //this.products = products;
    }

    public String getAppLogo(){
        return appLogo;
    }
}
