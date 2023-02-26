package co.com.prueba.saucedemo.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/",
        tags = "",
        glue = "co.com.prueba.saucedemo.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )
public class RunnerTags {
}
