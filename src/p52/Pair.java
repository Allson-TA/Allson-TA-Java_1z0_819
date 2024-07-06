package p52;

import java.util.function.BiFunction;

public class Pair <T>{
	final BiFunction<T, T, Boolean> validator;
	
	T left = null;
	T right = null;
	
	private Pair() {
		validator = null;
	}

	Pair(BiFunction v,T x,T y){
		validator = v;
		set(x,y);
	}

	void set(T x, T y) {
		if(!validator.apply(x, y)) throw new lllegalArgumentException();
		setLeft(x);
		setRight(y);
	}
	
	void setLeft(T x) {
		left = x;
	}
	
	void setRight(T y) {
		right  =y;
	}
	
	final boolean isValid() {
		return validator.apply(left,right);
	}
}
/*
It is required that if p instanceof Pair then p.isValid() return true.
要求如果 p 是 Pair 的實例，那麼 p.isValid() 返回 true。

Which is the smallest set of visibility changes to ensure this requirement is met?
確保滿足此要求的最小可見性更改集是什麼？

A. left and right must be private.
   left 和 right 必須是 private。

B. isValid must be public.
   isValid 必須是 public。

C. left, right, setLeft and setRight must be private.
   left, right, setLeft 和 setRight 必須是 private。

D. setLeft and setRight must be protected.
   setLeft 和 setRight 必須是 protected。
*/

