package net.serenitybdd.demos.todos.saucelabsdemo;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/cucumber/sauceDemoFeatures")
public class TestSauceDemo {}
