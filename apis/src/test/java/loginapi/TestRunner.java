package loginapi;
import com.intuit.karate.junit5.Karate;

public class TestRunner {
	@Karate.Test
	Karate getAPITest() {
		return Karate.run("simple").relativeTo(getClass());
	}
	@Karate.Test
	Karate postAPITest() {
		return Karate.run("postapi").relativeTo(getClass());
	}
	@Karate.Test
	Karate putAPITest() {
		return Karate.run("apichaining").relativeTo(getClass());
	}
	@Karate.Test
	Karate deleteAPITest() {
		return Karate.run("deleteuser").relativeTo(getClass());
	}
}
