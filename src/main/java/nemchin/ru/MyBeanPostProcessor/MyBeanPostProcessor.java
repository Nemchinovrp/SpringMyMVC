package nemchin.ru.MyBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obiect, String arg1)
			throws BeansException {
		
		System.err.println("postProcessorAfterInitialization: " + obiect);
		
		return obiect;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		return arg0;
	}

		
}
