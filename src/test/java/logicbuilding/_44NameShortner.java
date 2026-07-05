package logicbuilding;

import java.util.Arrays;

public class _44NameShortner {
    public static void main(String[] args) {
        String input = "Subham Mohit Kumar Jaiswal"; //" Subham ";
        String[] inputArr = input.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        if(inputArr.length>1){
            for(int i=0; i<inputArr.length-1; i++) {
                sb.append(inputArr[i].charAt(0));
                sb.append(". ");
            }
            sb.append(inputArr[inputArr.length-1]);
            System.out.println(sb); //S. M. K. Jaiswal
        }else{
            System.out.println(inputArr[0]); //Subham
        }


    }
}
