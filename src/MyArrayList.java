import java.util.StringJoiner;

public class MyArrayList<E>{
    private static final int INIT_SIZE = 10;
    private static Object [] myArray = new Object[INIT_SIZE];
    private int index = 0;

    public void add(Object value){
        if (index == myArray.length)
            changeSize();
        myArray[index++] = value;
   }

   private void changeSize(){
       System.out.println("Change size array, index: " + index);
       Object [] newMyArray = new Object[myArray.length * 2];
       System.arraycopy(myArray, 0, newMyArray, 0, myArray.length);
       myArray = newMyArray;
   }

   public void remove(int index){
       for (int i = index; i < myArray.length - 1; i++) {
           myArray[i] = myArray[i + 1];
           myArray[myArray.length - 1] = null;
       }
    }

    public void clear(){
        myArray = new Object[0];
    }

   public int size(){
        return myArray.length;
    }
    public E get(int index){
        return (E) myArray[index];
    }

}
