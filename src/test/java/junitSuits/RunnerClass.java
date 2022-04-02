package junitSuits;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;
//import org.junit.platform.suite.api.IncludeTags;
//import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

@SelectPackages({"packageA","packageB","junits"})
@IncludeTags({"Sanity"})

public class RunnerClass {

}
