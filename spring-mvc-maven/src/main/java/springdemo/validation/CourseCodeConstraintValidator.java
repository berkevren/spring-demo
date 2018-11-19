package springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

   public String[] coursePrefixes;

   public void initialize(CourseCode courseCode) {
      coursePrefixes = courseCode.value();
   }

   public boolean isValid(String theCode, ConstraintValidatorContext context) {

      boolean result = false;

      if (theCode != null) {

         for (String tempPrefix : coursePrefixes) {
            result = theCode.startsWith(tempPrefix);

            if (result)
               break;
         }

         return result;
      }
      return true;
   }
}
