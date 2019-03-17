class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        Map <Character, Character> mapa = new HashMap<>();
        Map <Character, Character> mapb = new HashMap<>();
        
        List<String> list = new ArrayList<>();
        boolean curr = false;
        
        for (int i = 0; i < words.length; i++) {
            curr = false;
            for(int j = 0; j < words[i].length(); j++){
                
                if (words[i].length() != pattern.length()) {
                   break; 
                }
                
                if (mapa.get(pattern.charAt(j)) == null && mapb.get(words[i].charAt(j)) == null) {
                    mapa.put(pattern.charAt(j), words[i].charAt(j));
                    mapb.put(words[i].charAt(j), pattern.charAt(j));
                }
                else {
                    if(mapa.containsKey(pattern.charAt(j)) && 
                      words[i].charAt(j) == mapa.get(pattern.charAt(j)) &&
                        mapb.containsKey(words[i].charAt(j)) && 
                      pattern.charAt(j) == mapb.get(words[i].charAt(j)))
                      {
                        continue;
                        
                    }
                    else {
                        curr = true;
                        break;
                    }
                }
            }
            if(!curr) {
                list.add(words[i]);
            }
            mapa.clear();
            mapb.clear();
        }
        return list;
        
    }
}
