/*
 * Author: Lucas Auman
 * HWK 1: Generic Review
 * CSC330-03 Fall 2016
 */
public class lwauman_hwk1{
    //every test will implement this interface
    public interface Check<T>{
        public boolean test(T item);
    }
    //checks if the item it received is less than zero. returns true/false
    public static class Negative<T> implements Check<T>{
        @Override
        public boolean test(T item) {
            if(item == null)
                return false;
            //checking class of item received
            Class itemClass = item.getClass();
            //checking for acceptable class type
            if(itemClass.equals(Integer.class))
                return (Integer)item<0;
            else if(itemClass.equals(Double.class))
                return (Double)item<0;
            else if(itemClass.equals(Float.class))
                return (Float)item<0;
            else if(itemClass.equals(Byte.class))
                return (Byte)item<0;
            else if(itemClass.equals(Short.class))
                return (Short)item<0;
            else if(itemClass.equals(Long.class))
                return (Long)item<0;
            else
                return false;
        }
    }
    //checks if the item it recieved is a perfect square. returns true/false
    public static class PerfectSquare<T> implements Check<T>{
        @Override
        public boolean test(T item) {
            if(item == null)
                return false;
            //checking class of item received
            Class itemClass = item.getClass();
            //checking for acceptable class type
            if(itemClass.equals(Integer.class))
                return Math.sqrt((Integer)item) % 1 == 0;
            else if(itemClass.equals(Double.class))
                return Math.sqrt((Double)item) % 1 == 0;
            else if(itemClass.equals(Float.class))
                return Math.sqrt((Float)item) % 1 == 0;
            else if(itemClass.equals(Byte.class))
                return Math.sqrt((Byte)item) % 1 == 0;
            else if(itemClass.equals(Short.class))
                return Math.sqrt((Short)item) % 1 == 0;
            else if(itemClass.equals(Long.class))
                return Math.sqrt((Long)item) % 1 == 0;
            else
                return false;
        }
    }
    //checks if the item it recieved is a prime number. returns true/false
    public static class Prime<T> implements Check<T>{
        @Override
        public boolean test(T item) {
            if(item == null)
                return false;
            //checking class of item recieved
            Class itemClass = item.getClass();
            //checking for acceptable class type
            if(itemClass.equals(Integer.class)){
                int num = (Integer)item;
                if(num<2)
                    return false;
                else{
                    for(int i=2; i<=num/2; i++)
                        if(num % i == 0)
                            return false;
                    return true;
                }
            }    
            else if(itemClass.equals(Double.class)){
                double num = (Double)item;
                double fraction = num % 1;
                if(num<2)
                    return false;
                //this is a shortcut for numbers containing decimals
                else if(fraction!=0)
                    return false;
                else{
                    for(int i=2; i<=num/2; i++)
                        if(num % i == 0)
                            return false;
                    return true;
                }
            }
            else if(itemClass.equals(Float.class)){
                float num = (Float)item;
                float fraction = num % 1;
                if(num<2)
                    return false;
                //this is a shortcut for numbers containing decimals
                else if(fraction!=0)
                    return false;
                else{
                    for(int i=2; i<=num/2; i++)
                        if(num % i == 0)
                            return false;
                    return true;
                }
            }
            else if(itemClass.equals(Byte.class)){
                byte num = (Byte)item;
                if(num<2)
                    return false;
                else{
                    for(int i=2; i<=num/2; i++)
                        if(num % i == 0)
                            return false;
                    return true;
                }
            }
            else if(itemClass.equals(Short.class)){
                short num = (Short)item;
                if(num<2)
                    return false;
                else{
                    for(int i=2; i<=num/2; i++)
                        if(num % i == 0)
                            return false;
                    return true;
                }
            }
            else if(itemClass.equals(Long.class)){
                Long num = (Long)item;
                if(num<2)
                    return false;
                else{
                    for(int i=2; i<=num/2; i++)
                        if(num % i == 0)
                            return false;
                    return true;
                }
            }
            else
                return false;
        }  
    }
    //this method takes a generic array and a test that implements the check interface
    //returns true/false depending on the array and test used
    public static <T> boolean contains(T[] input, Check<T> function){
        for(T item : input)
            if(function.test(item))
                return true;
        return false;
    }
    //this is an example of how you can overload the contains method so that it can
    //accept primitive arrays
    public static boolean contains(int[] input, Check<Integer> function){
        Integer[] newArray = new Integer[input.length];
        for(int i=0; i<newArray.length; i++)
            newArray[i] = input[i];
        return contains(newArray, function);
    }
    //main method. contains various arrays and uses tests
    public static void main(String[] args) {
        Integer[] arr = {null, -1, 49, 3};
        Integer[] arr2 = {6, 8, 10};
        Double[] arr3 = {null, -1.0, 49.0, 3.0};
        Double[] arr4 = {6.1, 8.2, 10.3};
        Long[] arr5 = {null, -1L, 49L, 3L};
        Long[] arr6 = {6L, 8L, 10L};
        Byte[] arr7 = {null, -1, 49, 3};
        Byte[] arr8 = {6, 8, 10};
        Short[] arr9 = {null, -1, 49, 3};
        Short[] arr10 = {6, 8, 10};
        Float[] arr11 = {null, -1.0f, 49.0f, 3.0f};
        Float[] arr12 = {6.1f, 8.2f, 10.3f};
        String[] arr13 = {"apple"};
        int[] arr14 = {-1, 49, 3};
        int[] arr15 = {6, 8, 10};
        System.out.println("    Contains Negative Tests");
        System.out.println("        True Expected");
        System.out.println("Integer Array   Result: "+contains(arr, new Negative()));
        System.out.println("Double Array    Result: "+contains(arr3, new Negative()));
        System.out.println("Long Array      Result: "+contains(arr5, new Negative()));
        System.out.println("Byte Array      Result: "+contains(arr7, new Negative()));
        System.out.println("Short Array     Result: "+contains(arr9, new Negative()));
        System.out.println("Float Array     Result: "+contains(arr11, new Negative()));
        System.out.println("int Array       Result: "+contains(arr14, new Negative()));
        System.out.println("        False Expected");
        System.out.println("Integer Array   Result: "+contains(arr2, new Negative()));
        System.out.println("Double Array    Result: "+contains(arr4, new Negative()));
        System.out.println("Long Array      Result: "+contains(arr6, new Negative()));
        System.out.println("Byte Array      Result: "+contains(arr8, new Negative()));
        System.out.println("Short Array     Result: "+contains(arr10, new Negative()));
        System.out.println("Float Array     Result: "+contains(arr12, new Negative()));
        System.out.println("String Array    Result: "+contains(arr13, new Negative()));
        System.out.println("int Array       Result: "+contains(arr15, new Negative()));
        System.out.println("");
        System.out.println("    Contains Perfect Square Tests");
        System.out.println("        True Expected");
        System.out.println("Integer Array   Result: "+contains(arr, new PerfectSquare()));
        System.out.println("Double Array    Result: "+contains(arr3, new PerfectSquare()));
        System.out.println("Long Array      Result: "+contains(arr5, new PerfectSquare()));
        System.out.println("Byte Array      Result: "+contains(arr7, new PerfectSquare()));
        System.out.println("Short Array     Result: "+contains(arr9, new PerfectSquare()));
        System.out.println("Float Array     Result: "+contains(arr11, new PerfectSquare()));
        System.out.println("int Array       Result: "+contains(arr14, new PerfectSquare()));
        System.out.println("        False Expected");
        System.out.println("Integer Array   Result: "+contains(arr2, new PerfectSquare()));
        System.out.println("Double Array    Result: "+contains(arr4, new PerfectSquare()));
        System.out.println("Long Array      Result: "+contains(arr6, new PerfectSquare()));
        System.out.println("Byte Array      Result: "+contains(arr8, new PerfectSquare()));
        System.out.println("Short Array     Result: "+contains(arr10, new PerfectSquare()));
        System.out.println("Float Array     Result: "+contains(arr12, new PerfectSquare()));
        System.out.println("String Array    Result: "+contains(arr13, new PerfectSquare()));
        System.out.println("int Array       Result: "+contains(arr15, new PerfectSquare()));
        System.out.println("");
        System.out.println("    Contains Prime Tests");
        System.out.println("        True Expected");
        System.out.println("Integer Array   Result: "+contains(arr, new Prime()));
        System.out.println("Double Array    Result: "+contains(arr3, new Prime()));
        System.out.println("Long Array      Result: "+contains(arr5, new Prime()));
        System.out.println("Byte Array      Result: "+contains(arr7, new Prime()));
        System.out.println("Short Array     Result: "+contains(arr9, new Prime()));
        System.out.println("Float Array     Result: "+contains(arr11, new Prime()));
        System.out.println("int Array       Result: "+contains(arr14, new Prime()));
        System.out.println("        False Expected");
        System.out.println("Integer Array   Result: "+contains(arr2, new Prime()));
        System.out.println("Double Array    Result: "+contains(arr4, new Prime()));
        System.out.println("Long Array      Result: "+contains(arr6, new Prime()));
        System.out.println("Byte Array      Result: "+contains(arr8, new Prime()));
        System.out.println("Short Array     Result: "+contains(arr10, new Prime()));
        System.out.println("Float Array     Result: "+contains(arr12, new Prime()));
        System.out.println("String Array    Result: "+contains(arr13, new Prime()));
        System.out.println("int Array       Result: "+contains(arr15, new Prime()));
    }
}

