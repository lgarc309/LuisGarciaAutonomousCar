/**
 * 
 */
package Sequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author luisgarcia
 *
 */
public class AutoCarComputer implements GenericComponent {
	
	private String model;
	private AwsEc2Instance myAwsEc2Instance;
	private AwsS3Storage myAwsS3Storage;
	
	
	public AutoCarComputer() {
		myAwsEc2Instance = new AwsEc2Instance();
		myAwsS3Storage = new AwsS3Storage();
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Software Update";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List  getSubComponents() {
		// TODO Auto-generated method stub
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myAwsEc2Instance, myAwsS3Storage); // add all your sub components
	
		return internalComponents; }
	}
	


