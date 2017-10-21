package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration2 {
	
	@Bean
	public AccountDao accountDao() {
		AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public AccountDao AccountDaoJdbcImpl() {
		AccountDaoJdbcImpl bean = new AccountDaoJdbcImpl();
		return bean;
	}
	
	@Bean (autowire=Autowire.BY_NAME)
	public AccountService accountService() {
		AccountServiceImpl bean = new AccountServiceImpl();
		return bean;
	}
}
