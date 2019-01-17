package resourcesystem;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.resourcesystem.entity.ResourceStockEntity;
import com.lovo.resourcesystem.service.ResourceStockService;

public class ResourceStockTest {

	ClassPathXmlApplicationContext app = null;

	@Before
	public void before() {

		app = new ClassPathXmlApplicationContext("application.xml");
	}

	@Test
	public void resourceStockAdd() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");
		ResourceStockEntity b = new ResourceStockEntity();
		b.setPlateNumber("ae86");
		b.setState("在线");
		a.resourceStockAdd(b);
	}
	
	@Test
	public void resourceStockDelete() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");
		a.resourceStockdelete(1);
	}
	
	@Test
	public void resourceStockFind() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");	
		System.out.println(a.resourceStockFind());	
	}
	
	@Test
	public void resourceStockFind1() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");	
		System.out.println(a.resourceStockFind1("出勤", 1));
	}
	
	@Test
	public void resourceStockRevise() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");	
		a.resourceStockRevise("出勤", 2);
	}
	
	
}
