package nastya.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class Test1 {

	@Test
	public void testVersionOfService1() {
		Service1 service1 = new Service1Impl();

		assertThat(service1.getVersion(), is("1-1"));
	}
}
