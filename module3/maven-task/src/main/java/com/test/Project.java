package com.test;

//dependency on Apache commons-collections
import org.apache.commons.collections.Predicate;

class Project {

  public static void test() {
    System.out.println("test");
      }
  
  public static void main(String[] args) {
    System.out.println("Hellow MTN");
	  
int month = 3;
String monthString;
switch (month) {
    case 1:  monthString = "Январь";
             break;
    case 2:  monthString = "Февраль";
             break;
    case 3:  monthString = "Март";
             break;
    case 4:  monthString = "Апрель";
             break;
    case 5:  monthString = "Май";
             break;
    case 6:  monthString = "Июнь";
             break;
    case 7:  monthString = "Июль";
             break;
    case 8:  monthString = "Август";
             break;
    case 9:  monthString = "Сентябрь";
             break;
    case 10: monthString = "Октябрь";
             break;
    case 11: monthString = "Ноябрь";
             break;
    case 12: monthString = "Декабрь";
             break;
    default: monthString = "Не знаем такого";
             break;
}
mInfoTextView.setText(monthString);

}
