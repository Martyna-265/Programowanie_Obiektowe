package pl.edu.pw.mini.zpoif.task5.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NiebezpiecznyPosilek {
    StopienRyzyka stopienRyzyka();
}
