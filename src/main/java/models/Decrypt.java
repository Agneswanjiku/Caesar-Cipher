 package models;

public class Decrypt { //decrypt class

    private String mInputString; //creating instances in the decrypt.java class
    private int mShift;

    public Decrypt(String mInputString, int mShift) { //constructor
        this.mInputString = mInputString;
        this.mShift = mShift;
    }

    public String getmInputString(){

        return mInputString;
    }

    public int getmShift(){
        return mShift;
    }

    public static String decrypt(Decrypt decrypt){

        if(decrypt.mShift > 26){
            decrypt.mShift = decrypt.mShift % 26;
        }
        else if(decrypt.mShift < 0) {
            decrypt.mShift = (decrypt.mShift % 26) + 26;
        }

        String outputString = "";
        int length = decrypt.mInputString.length();
        for (int i = 0; i < length ; i++) {
            char cc = decrypt.mInputString.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char)(cc+decrypt.mShift);
                    if(c>'z'){
                        outputString += (char)(cc + (26-decrypt.mShift));
                    }
                    else {
                        outputString += c;
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc+decrypt.mShift);
                    if(c>'Z'){
                        outputString += (char)(cc + (26-decrypt.mShift));
                    }
                    else {
                        outputString += c;
                    }
                }
            }
            else{
                outputString += cc;
            }
        }
        return outputString;
    }
}