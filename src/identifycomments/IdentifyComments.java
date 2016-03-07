import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IdentifyComments {
    public static void main(String[] args) throws IOException {
        StringBuffer input = new StringBuffer();
        StringBuffer output = new StringBuffer();
        InputStreamReader _inputStream = new InputStreamReader(System.in);
        BufferedReader _bufferReader = new BufferedReader(_inputStream);
        String _readLine;
        while((_readLine = _bufferReader.readLine()) != null){
        //    _readLine.replaceAll("^\\s+", "");
         //   _readLine.replaceAll("\\s+$", "");
            _readLine = _readLine.trim();
            input.append(_readLine + "\n");
            
        }
        String p = input.toString();
        Pattern _pattern = Pattern.compile("\\/\\*.*?\\*\\/|\\/\\/.*?(?=\\n)",Pattern.DOTALL);
        Matcher _match = _pattern.matcher(p);
        while (_match.find()){
            output.append(_match.group() + "\n");
        }
        System.out.print(output);
    }
}