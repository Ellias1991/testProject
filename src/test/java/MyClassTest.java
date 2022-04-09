import lesson6.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyClassTest {

    @Test
    void main() {
    }

    @Test
     public void arrayAfter4() {
        int []in=new int[]{1,2,3,4,5,6,7};
        int []out=new int[]{5,6,7};
        Assertions.assertArrayEquals(out, MyClass.arrayAfter4(in));

    }


    @Test
   public void arrayHasOnly1And4() {
    int[]in = new int[]{1,2,6,4,6};
    Assertions.assertFalse(MyClass.ArrayHasOnly1And4(in));
    }
}