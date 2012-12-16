package junit.tutorial;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(SlowTests.class)
@SuiteClasses(SlowAndFastTest.class)
public class CategoriesTests {

}
