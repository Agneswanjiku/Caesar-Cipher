public class CaesarCipher {
    private int mKey;
    private String mWord;

    public CaesarCipher(String word, int key){
        mKey = key;
        mWord = word;

    }
    public int getKey(){
        return mKey;
    }
    public String getWord(){
        return mWord;
    }
    public String indexOfWord(){
        int[] index=  new int[mWord.length()];
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] charUserWord = mWord.toCharArray();

        for (int i = 0; i<charUserWord.length; i++){
            for(int j=0; j<alphabet.length; j++){
                if(charUserWord[i]==alphabet[j]){
                    index[i] = j;
                    index[i] = index[i] + mKey;
                    if (index[i] >25){
                        index[i] = index[i] - 25;

                    }
                }

            }
        }
        char[] letters = new char[mWord.length()];
        for (int k = 0; k<index.length;k++){
            letters[k] = alphabet[index[k]];

        }
        String finalWord = new String(letters);
        return finalWord;

    }
    public String decryptedWord(){
        String decryption = mWord;
        return decryption;
    }


}