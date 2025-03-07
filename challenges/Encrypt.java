import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Encrypt {

    private final char[] SYMBOLS;
    private List<>

    {
        SYMBOLS = new char[94];

    }

    public static void main(String[] args) {

    }

    public String [] toEncrypt(String[] inputs){

        // first step
        for(int i = 0; i<inputs.length; i++){
            for (int j = 32; j<= 126; j++){
                if(inputs[i].toCharArray()[j-32] == (char) j){
                    inputs[i].toCharArray()[j-32] = (char) (j+3);
                }
            }
        }
        return inputs;
    }
    public void checkPlace(String[] inputs){

        for(String input : inputs){



        }

    }
}
