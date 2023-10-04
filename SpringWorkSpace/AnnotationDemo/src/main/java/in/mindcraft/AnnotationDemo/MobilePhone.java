package in.mindcraft.AnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobilePhone {
	private int mid;
	
	private String make;
	
	@Autowired
	private MemoryCard mry;

	public MobilePhone() {
		super();
		mid=101;
		make="Samsung";
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println(mid+ " " +make);
		mry.show();
		
	}
	
}
