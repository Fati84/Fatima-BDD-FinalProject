package tek.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.core.snippets.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ("classpath:features"),
        glue = "tek.bdd.steps",
        tags = "@Smoke",
        dryRun =false,
        plugin  = {
        "pretty",
        "html:target/html_report/index.html",
        "json:target/jsonReports/report.json"
}

)
public class TestRunner {
}