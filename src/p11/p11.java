package p11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

public class p11 {
	
	@Repeatable(Meals.class)
	@Target(ElementType.TYPE)
	@interface Meal {
	    String starter() default "";
	    String mainCourse();			//	特別注意這裡沒有default，所以一定要宣告出來，其他兩個有default就可宣告也可不宣告
	    String dessert() default "";
	}

	@Target(ElementType.TYPE)
	public @interface Meals {
	    Meal[] value();
	}
}

/*
package java.lang.annotation;

public enum ElementType {
    TYPE, // 適用 class, interface, enum
    FIELD, // 適用 field
    METHOD, // 適用 method
    PARAMETER, // 適用 method 上之 parameter
    CONSTRUCTOR, // 適用 constructor
    LOCAL_VARIABLE, // 適用區域變數
    ANNOTATION_TYPE, // 適用 annotation 型態
    PACKAGE // 適用 package
}
*/

/*
Which two are valid usages of the annotation?
哪兩個是註解的有效用法？

A. @Meal(mainCourse = "pizza", starter = "snack", dessert = "pudding")
   public class Main {}

B. @Meal(mainCourse = null)	//	不得使用null
   public class Main {}

C. @Meal(starter = "snack", dessert = "ice cream")	//	mainCourse沒有帶default，所以需要被指定宣告
   public class Main {}

D. @Meal(mainCourse = "pizza")
   @Meal(dessert = "pudding")	//	雖然 @Meal 是可重複的，但每個 @Meal 都需要有 mainCourse 指定，第二個 @Meal 沒有指定 mainCourse。
   public class Main {}

E. @Meals({
       @Meal(mainCourse = "pizza"),
       @Meal(mainCourse = "salad")
   })
   public class Main {}
*/
