package net.serenitybdd.demos.todos.saucelabsdemo;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.junit.platform.suite.api.ConfigurationParameter;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/cucumber/sauceDemoFeatures")
public class TestSauceDemo {}

//@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(
//        features = "src/test/resources/features/cucumber/sauceDemoFeatures",
//        plugin = {"pretty", "html:src/target/serenity-reports", "json:src/target/cucumber-reports/Cucumber.json"}
//)
//public class TestSauceDemo {}