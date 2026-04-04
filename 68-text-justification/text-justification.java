import java.util.*;
import java.util.regex.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<List<String>> lines = new ArrayList<>();
        findLines(words, 0, maxWidth, lines);
        
        List<String> result = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            result.add(formatLine(lines.get(i), maxWidth, i == lines.size() - 1));
        }
        return result;
    }

    private void findLines(String[] words, int index, int maxWidth, List<List<String>> lines) {
        if (index >= words.length) return;

        List<String> currentLine = new ArrayList<>();
        int currentLength = 0;

        while (index < words.length && currentLength + words[index].length() + currentLine.size() <= maxWidth) {
            currentLength += words[index].length();
            currentLine.add(words[index]);
            index++;
        }
        
        lines.add(currentLine);
        findLines(words, index, maxWidth, lines);
    }

    private String formatLine(List<String> line, int maxWidth, boolean isLast) {
        if (line.size() == 1 || isLast) {
            String joined = String.join(" ", line);
            return String.format("%-" + maxWidth + "s", joined);
        }

        int totalChars = 0;
        for (String w : line) totalChars += w.length();
        
        int totalSpaces = maxWidth - totalChars;
        int gapCount = line.size() - 1;
        int spacePerGap = totalSpaces / gapCount;
        int extraSpaces = totalSpaces % gapCount;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.size(); i++) {
            sb.append(line.get(i));
            if (i < gapCount) {
                int spacesToAppend = spacePerGap + (i < extraSpaces ? 1 : 0);
                sb.append(" ".repeat(spacesToAppend));
            }
        }
        return sb.toString();
    }
}
