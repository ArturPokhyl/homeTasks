package test.java.utils;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import test.java.homeTasks.DataProvidersBase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {


    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        iTestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);
    }
}
