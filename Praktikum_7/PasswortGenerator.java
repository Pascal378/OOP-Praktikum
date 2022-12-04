package Praktikum_7;

public class PasswortGenerator {
    private String password;

    //Create password from String
    public void erstellePasswort(String sentence) {
        String newPass = "";
        int generatedChars = 0;

        for (int i = 0; i < sentence.length(); i++) {
            
            //Check if first char is letter and add if so, then check every other letter if it is the beginning of a word and add it
            if (i == 0 && Character.isLetter(sentence.charAt(i))) {
                if ((generatedChars + 1) % 2 == 1) newPass += Character.toLowerCase(sentence.charAt(i));
                else newPass += Character.toUpperCase(sentence.charAt(i));

                generatedChars++;

            } else if (Character.isLetter(sentence.charAt(i)) && !Character.isLetter(sentence.charAt(i - 1))) {
                if ((generatedChars + 1) % 2 == 1) newPass += Character.toLowerCase(sentence.charAt(i));
                else newPass += Character.toUpperCase(sentence.charAt(i));

                generatedChars++;
            }

        }

        this.password = newPass;
    }

    //Return the password
    public String getPassword() {
        return this.password;
    }
}

