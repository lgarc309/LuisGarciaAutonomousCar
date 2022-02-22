/**
 * 
 */
package Sequence;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author luisgarcia
 *
 */
public class AwsS3Storage extends AutoCarComputer implements SelfCheckCapable {
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "AwsS3Storage";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

}
