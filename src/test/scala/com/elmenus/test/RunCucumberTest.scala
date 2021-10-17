package com.elmenus.test

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith


@RunWith(classOf[Cucumber])
@CucumberOptions(plugin = Array("pretty", "html:target/cucumber/allspecs", "json:target/cucumber/allspecs.json"), features = Array("src/specs/published"), tags = "@implemented and not @deprecated")
class RunCucumberTest {}