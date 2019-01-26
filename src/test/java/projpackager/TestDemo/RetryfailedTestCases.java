package projpackager.TestDemo;
import projpackager.TestDemo.Tet;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryfailedTestCases implements IRetryAnalyzer {
	
	
	private int retryCnt = 0;
	
	private int MaxretryCnt = 2;

	public boolean retry(ITestResult result) {
		if (retryCnt < MaxretryCnt) {
			
			
		System.out.println("Retrying "+result.getName()+" Again the count is "+retryCnt+1);
		retryCnt++;
		return true;
		
		
		}
		return false;
	}

}
