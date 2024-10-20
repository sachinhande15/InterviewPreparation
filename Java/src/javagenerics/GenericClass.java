package javagenerics;

import java.io.Serializable;

public class GenericClass<T> implements Serializable {


	T value;

	GenericClass(T value){
		this.value = value;
	}

	public T getValue () {
		return value;
	}
	 GenericClass(){

	 }

	public void display (){
		System.out.printf("The value is %s%n", this.value);
	}

	@Override
	public String toString () {
		return "GenericClass{" + "value=" + value + '}';
	}
}
