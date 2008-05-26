package test.annotationtransformer;

import org.testng.internal.annotations.IAnnotationTransformer2;
import org.testng.internal.annotations.IConfiguration;
import org.testng.internal.annotations.ITest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ConfigurationTransformer implements IAnnotationTransformer2 {

  public void transform(ITest annotation, Class testClass,
      Constructor testConstructor, Method testMethod) {
    // TODO Auto-generated method stub
    
  }

  public void transform(IConfiguration annotation, Class testClass,
      Constructor testConstructor, Method testMethod)
  {
    if (annotation.getBeforeTestMethod()) {
      System.out.println("disabling " + testMethod + " "
          + testMethod.hashCode() 
          + " " + annotation.hashCode());
      annotation.setEnabled(false);
    }
  }

}
