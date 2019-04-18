package genericityFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(Part.createRandom());
        }
    }
}
