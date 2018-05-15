
 public class ImmutableImpl {
	String name;
	Integer id;
	
	public ImmutableImpl() {
		
	}
	public ImmutableImpl(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	 void getNumber(){
		System.out.println("this is in base class");
	}
	
	
	
}
