class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set <String> set = new HashSet<>();
        
        for(String email : emails){
            String email_arr[] = email.split("@");
            String userid = email_arr[0];
            //String domain = email_arr[1];
            
            if(userid.contains("+")){
                userid = userid.substring(0, userid.indexOf("+"));
            }
            if(userid.contains(".")){
                userid = userid.replace(".", "");
            }
            String original = userid + "@" + email_arr[1];
            set.add(original);
        }
        return set.size();
    }
}
