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
    public static class Prime<T> implements Check<T>{
        @Override
        public boolean test(T item) {
            if(item == null)
                return false;
            Class itemClass = item.getClass();
            if(itemClass.equals(Integer.class)){
                int num = (Integer)item;
                if(num<2)
                    return false;
                else{
                    for(int i=2; i<=num/2; i++){
                    if(num % i == 0)
                        return false;
                    }
                    return true;
                }
            }    
            else if(itemClass.equals(Double.class))
                return Math.sqrt((Float)item) % 1 == 0;
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
    public static <T> boolean contains(T[] input, Check<T> function){
        for(T item : input)
            if(function.test(item))
                return true;
        return false;
    }
    public static void main(String[] args) {
        Integer[] iarr = {null, -1, 49, 3};
        Integer[] iarr2 = {0, 6, 8};
        Double[] iarr3 = {null, -1.0, 49.0, 3.0};
        Double[] iarr4 = {0.0, 6.1, 8.2};
        Long[] iarr5 = {null, -1L, 49L, 3L};
        Long[] iarr6 = {0L, 6L, 8L};
        Byte[] iarr7 = {null, -1, 49, 3};
        Byte[] iarr8 = {0, 6, 8};
        Short[] iarr9 = {null, -1, 49, 3};
        Short[] iarr10 = {0, 6, 8};
        Float[] iarr11 = {null, -1.0f, 49.0f, 3.0f};
        Float[] iarr12 = {0.0f, 6.1f, 8.2f};
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
        System.out.println("        Contains Perfect Square Tests");
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
        System.out.println("        Contains Prime Tests");
        System.out.println("Integer Array (true expected).  Result: "+contains(iarr, new Prime()));
        System.out.println("Integer Array (false expected). Result: "+contains(iarr2, new Prime()));
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
    }
}

