public class PasswortGenerator {
    private String password;

    //Create password from String
    public void erstellePasswort(String sentence) {
        String newPass = "";
        int generatedChars = 0;
        boolean spaceFound = true;
        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == ' ') spaceFound = true;
            //Check if first char is letter and add if so, then check every other letter if it is the beginning of a word and add it
            if (i == 0 && Character.isLetter(sentence.charAt(i))) {
                if ((generatedChars + 1) % 2 == 1) newPass += Character.toLowerCase(sentence.charAt(i));
                else newPass += Character.toUpperCase(sentence.charAt(i));
                spaceFound = false;
                generatedChars++;

            } else if (Character.isLetter(sentence.charAt(i)) && spaceFound) {
                if ((generatedChars + 1) % 2 == 1) newPass += Character.toLowerCase(sentence.charAt(i));
                else newPass += Character.toUpperCase(sentence.charAt(i));
                spaceFound = false;
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

