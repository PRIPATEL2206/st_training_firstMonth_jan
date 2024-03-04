package ctMetaProcessing;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface CompileTimeComputed {
    String value();
}
