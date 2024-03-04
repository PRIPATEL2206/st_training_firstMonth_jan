package ctMetaProcessing;

import javax.annotation.processing.*;
import javax.lang.model.*;
import javax.lang.model.element.*;
import java.util.*;

@SupportedAnnotationTypes("CompileTimeComputed")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class FactorialProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(CompileTimeComputed.class)) {
            if (element.getKind() == ElementKind.METHOD) {
                ExecutableElement method = (ExecutableElement) element;
                int value = Integer.parseInt(method.getAnnotation(CompileTimeComputed.class).value());
                long factorial = calculateFactorial(value);
                System.out.println("Compile-time factorial computation: " + value + "! = " + factorial);
            }
        }
        return true;
    }

    private long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
