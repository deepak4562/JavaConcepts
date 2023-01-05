package InterViewQuestions;

public class TestInterview01 {
    static void show(String str){
        int i=0;
        int j=2;
        int k=str.length()/2;

        String result="";
        while (k>0){
            String strr=str.substring(i,j);
             result=result+strr.concat("_");
            i=j;
            j=j+2;
            k--;
        }
        System.out.println(result);


    }
    public static void main(String[] args) {
        String str="Symaghan";
        show(str);

    }
}
