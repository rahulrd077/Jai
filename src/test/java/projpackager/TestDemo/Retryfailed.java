package projpackager.TestDemo;

import projpackager.TestDemo.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.ITestAnnotation;

public class Retryfailed implements IAnnotationTransformer {

	public void transform(ITestAnnotation anno, Class testclass, Constructor testcons, Method testmethod) {
		// TODO Auto-generated method stub
		IRetryAnalyzer retry = anno.getRetryAnalyzer();
		 
		 if (retry == null) {
		 anno.setRetryAnalyzer(RetryfailedTestCases.class);
		 }
	}

	

}
