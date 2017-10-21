package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgramAutoWiring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new 
				AnnotationConfigApplicationContext(BeanConfiguration2.class);
		
		AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
		
		System.out.println("Before money transfer");
		System.out.println("Account 1 Balance: " + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 Balance: " + accountService.getAccount(1).getBalance());
		
		accountService.transferMoney(1, 2, 5);
		
		System.out.println("After money transfer");
		System.out.println("Account 1 Balance: " + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 Balance: " + accountService.getAccount(1).getBalance());
	}
}
