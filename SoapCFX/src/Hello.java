import javax.jws.WebService;

@WebService(targetNamespace = "http://default_package/", portName = "HelloPort", serviceName = "HelloService")
public class Hello {
	public void hello()
	{
		System.out.println("hello tarun");
	}

}
