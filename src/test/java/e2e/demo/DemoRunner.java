package e2e.demo;

import cucumber.api.CucumberOptions;
import e2e.BaseAPITest;

/**
 * @author sgnaneshwar
 */

@CucumberOptions(features = "classpath:e2e/demo/demo.feature")
public class DemoRunner extends BaseAPITest {
}
