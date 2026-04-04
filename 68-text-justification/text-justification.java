import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < words.length) {
            int lineLength = words[i].length();
            int last = i + 1;
            
            while (last < words.length && lineLength + 1 + words[last].length() <= maxWidth) {
                lineLength += 1 + words[last].length();
                last++;
            }
            
            StringBuilder sb = new StringBuilder();
            int numWords = last - i;
            
            if (last == words.length || numWords == 1) {
                for (int j = i; j < last; j++) {
                    sb.append(words[j]);
                    if (j < last - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } else {
                int totalSpaces = maxWidth - (lineLength - (numWords - 1));
                int spaceBetween = totalSpaces / (numWords - 1);
                int extraSpaces = totalSpaces % (numWords - 1);
                
                for (int j = i; j < last - 1; j++) {
                    sb.append(words[j]);
                    int spacesToApply = spaceBetween + (j - i < extraSpaces ? 1 : 0);
                    for (int s = 0; s < spacesToApply; s++) sb.append(" ");
                }
                sb.append(words[last - 1]);
            }
            
            res.add(sb.toString());
            i = last;
        }
        
        return res;
    }
}
