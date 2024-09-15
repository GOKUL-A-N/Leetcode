class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmail = new HashSet<>();
        for(String email:emails){
            String formatted = getFormattedEmail(email);
            uniqueEmail.add(formatted);
        }
        return uniqueEmail.size();
    }

    public String getFormattedEmail(String email){
        String[] arr = email.split("@");
        String localName = arr[0];
        String domainName = arr[1];

        String[] arrLocalwithPlus = localName.split("\\+");
        localName = arrLocalwithPlus[0];

        localName = localName.replace(".","");

        return localName+"@"+domainName;
    }
}