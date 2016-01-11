package org.whl.annotation.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@ClassDemo(tableName = "whl_class")
public class AnnotationDemo {

    @MethodDemo(name = "WHL")
    public void test(@ParamDemo(name = "whl_param") @ParamDemo2(name = "whl_param2") String value) {

    }

    public static void main(String[] args) throws Exception {

        Method m = AnnotationDemo.class.getMethod("test", String.class);
        MethodDemo md = m.getAnnotation(MethodDemo.class);
        System.out.println(md.name());

        Annotation[][] anns = m.getParameterAnnotations();
        Annotation[] firstParamAnns = anns[0];
        Annotation p1 = firstParamAnns[0];
        Annotation p2 = firstParamAnns[1];
        if (p1 instanceof ParamDemo) {
            System.out.println(((ParamDemo) p1).name());
        }

        if (p2 instanceof ParamDemo2) {
            System.out.println(((ParamDemo2) p2).name());
        }

        ClassDemo cd = AnnotationDemo.class.getAnnotation(ClassDemo.class);
        System.out.println(cd.tableName());
    }

}
