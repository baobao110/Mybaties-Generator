package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.cityMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/spring/spring-config.xml"})
@Transactional
public class springTest {
	
	@Autowired
	private cityMapper city;
	
	
	@Test
	public void test() {
		
		com.domain.city a=new com.domain.city();
		a.setCityname("22");
		a.setCitynumber("33");
		a.setProvicenum("33333");
		int row=city.insert(a);
		assertEquals(1, row);
	}

}
