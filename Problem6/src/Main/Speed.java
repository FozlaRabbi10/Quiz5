package Main;
import java.util.Scanner;

public class Speed {
	
	public static int calculate(double m) {
		int speed[] = {1,10,20,40};
		int length = 3;
		int ans = 0;
		double T = 60.0;
		for(int start = 0; start < 4; start++) {
			double at = m* (speed[start]*speed[start] / length);
			if(at <= T) {
				ans = Math.max(ans, speed[start]);
			}
		}
		System.out.println("gretest speed is : " + ans);
		return ans;
	}
}
