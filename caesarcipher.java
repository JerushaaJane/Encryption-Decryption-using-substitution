public class caesarcipher {
    public static void main(String args[]) throws java.lang.Exception {
      String msg="Hello welcome to security laboratory";
      System.out.println("Simulation of caesar cipher: ");
      System.out.println("input message : " + msg);
      System.out.println("encoded message : ");
      System.out.println(caesarcipher.encode(msg,12));
      System.out.println("Decoded message");
      System.out.println(caesarcipher.decode(caesarcipher.encode(msg,12),12));
    }
    public static String encode(String a,int offset){
        offset=offset%26+26;
        StringBuilder sb=new StringBuilder();
        for(char i:a.toCharArray()){
            if(Character.isLetter(i)){
                if(Character.isUpperCase(i)){
                    sb.append((char)('A'+(i-'A'+offset)%26));
                }
                else{
                   sb.append((char)('a'+(i-'a'+offset)%26)); 
                }
            }
            else{
                sb.append(i);
            }
        }
        return sb.toString();
    }
    public static String decode(String a,int offset){
        return encode(a,26-offset);
    }
}
