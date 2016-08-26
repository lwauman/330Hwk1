public class lwauman_hwk1{
    public interface Check<T>{
        public boolean test(T item);
    }
    public static class Negative<T> implements Check<T>{
        @Override
        public boolean test(T item) {
            if(item == null)
                return false;
            Class itemClass = item.getClass();
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
    public static class PerfectSquare<T> implements Check<T>{
        @Override
        public boolean test(T item) {
            if(item == null)
                return false;
            Class itemClass = item.getClass();
            if(itemClass.equals(Integer.class))
                return ((Integer)item).doubleValue()/2 % 1 == 0;
            else if(itemClass.equals(Double.class))
                return Math.sqrt((Double)item) % 1 == 0;
            else if(itemClass.equals(Float.class)){
                return Math.sqrt((Float)item) % 1 == 0;
            }
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
    public static <T> boolean contains(T[] input, Check<T> function){
        for(T item : input)
            if(function.test(item))
                return true;
        return false;
    }
    public static void main(String[] args) {
        Integer[] iarr = {100, null, 37, 49, -6};
        Integer[] iarr2 = {23, 37, 17};
        Double[] iarr3 = {100.0, null, 37.1, 49.2, -1.3};
        Double[] iarr4 = {23.0, 37.2, 17.3};
        Long[] iarr5 = {100L, null, 37L, 49L, -6L};
        Long[] iarr6 = {23L, 37L, 17L};
        Byte[] iarr7 = {100, null, 37, 49, -6};
        Byte[] iarr8 = {23, 37, 17};
        Short[] iarr9 = {100, null, 37, 49, -6};
        Short[] iarr10 = {23, 37, 17};
        Float[] iarr11 = {100.0f, null, 37.1f, 49.2f, -1.3f};
        Float[] iarr12 = {23.0f, 37.2f, 49.1f};
        String[] iarr13 = {"apple"};
        System.out.println("        Contains Negative Tests");
        System.out.println("Integer Array (true expected).  Result: "+contains(iarr, new Negative()));
        System.out.println("Integer Array (false expected). Result: "+contains(iarr2, new Negative()));
        System.out.println("Double Array (true expected).   Result: "+contains(iarr3, new Negative()));
        System.out.println("Double Array (false expected).  Result: "+contains(iarr4, new Negative()));
        System.out.println("Long Array (true expected).     Result: "+contains(iarr5, new Negative()));
        System.out.println("Long Array (false expected).    Result: "+contains(iarr6, new Negative()));
        System.out.println("Byte Array (true expected).     Result: "+contains(iarr7, new Negative()));
        System.out.println("Byte Array (false expected).    Result: "+contains(iarr8, new Negative()));
        System.out.println("Short Array (true expected).    Result: "+contains(iarr9, new Negative()));
        System.out.println("Short Array (false expected).   Result: "+contains(iarr10, new Negative()));
        System.out.println("Float Array (true expected).    Result: "+contains(iarr11, new Negative()));
        System.out.println("Float Array (false expected).   Result: "+contains(iarr12, new Negative()));
        System.out.println("String Array (false expected).  Result: "+contains(iarr13, new Negative()));
        System.out.println("");
        System.out.println("        Contains PerfectSquare Tests");
        System.out.println("Integer Array (true expected).  Result: "+contains(iarr, new PerfectSquare()));
        System.out.println("Integer Array (false expected). Result: "+contains(iarr2, new PerfectSquare()));
        System.out.println("Double Array (true expected).   Result: "+contains(iarr3, new PerfectSquare()));
        System.out.println("Double Array (false expected).  Result: "+contains(iarr4, new PerfectSquare()));
        System.out.println("Long Array (true expected).     Result: "+contains(iarr5, new PerfectSquare()));
        System.out.println("Long Array (false expected).    Result: "+contains(iarr6, new PerfectSquare()));
        System.out.println("Byte Array (true expected).     Result: "+contains(iarr7, new PerfectSquare()));
        System.out.println("Byte Array (false expected).    Result: "+contains(iarr8, new PerfectSquare()));
        System.out.println("Short Array (true expected).    Result: "+contains(iarr9, new PerfectSquare()));
        System.out.println("Short Array (false expected).   Result: "+contains(iarr10, new PerfectSquare()));
        System.out.println("Float Array (true expected).    Result: "+contains(iarr11, new PerfectSquare()));
        System.out.println("Float Array (false expected).   Result: "+contains(iarr12, new PerfectSquare()));
        System.out.println("String Array (false expected).  Result: "+contains(iarr13, new PerfectSquare()));
        /*
        System.out.println("");
        System.out.println("        Contains Prime Tests");
        System.out.println("Integer Array (true expected).  Result: "+contains(iarr, new PerfectSquare()));
        System.out.println("Integer Array (false expected). Result: "+contains(iarr2, new PerfectSquare()));
        System.out.println("Double Array (true expected).   Result: "+contains(iarr3, new PerfectSquare()));
        System.out.println("Double Array (false expected).  Result: "+contains(iarr4, new PerfectSquare()));
        System.out.println("Long Array (true expected).     Result: "+contains(iarr5, new PerfectSquare()));
        System.out.println("Long Array (false expected).    Result: "+contains(iarr6, new PerfectSquare()));
        System.out.println("Byte Array (true expected).     Result: "+contains(iarr7, new PerfectSquare()));
        System.out.println("Byte Array (false expected).    Result: "+contains(iarr8, new PerfectSquare()));
        System.out.println("Short Array (true expected).    Result: "+contains(iarr9, new PerfectSquare()));
        System.out.println("Short Array (false expected).   Result: "+contains(iarr10, new PerfectSquare()));
        System.out.println("Float Array (true expected).    Result: "+contains(iarr11, new PerfectSquare()));
        System.out.println("Float Array (false expected).   Result: "+contains(iarr12, new PerfectSquare()));
        System.out.println("String Array (false expected).  Result: "+contains(iarr13, new PerfectSquare()));
        System.out.println("");
        */
    }
}

