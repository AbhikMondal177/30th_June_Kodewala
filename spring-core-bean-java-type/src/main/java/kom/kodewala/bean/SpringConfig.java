package kom.kodewala.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
@Bean("order")
public Order createbean() {
	Order order=new Order();
	order.setOrderId(101);
	order.setItemName("Laptop");
	order.setStatus("out for delivery");
	return order;
}
}
