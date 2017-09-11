package net.phreebie;

import java.util.HashMap;

public class SLP1 {
    public static HashMap<String, String> dev2slp = new HashMap<>();
    public static HashMap<String, String> lat2slp = new HashMap<>();
    public static HashMap<String, String> sw2slp = new HashMap<>();
    public static HashMap<String, String> slp2lat = new HashMap<>();

    static{
        dev2slp.put("अ","a");

        lat2slp.put("a","a");slp2lat.put("a","a");      sw2slp.put("a","a");
        lat2slp.put("ā","A");slp2lat.put("A","ā");      sw2slp.put("a_","A");

        lat2slp.put("i","i");slp2lat.put("i","i");      sw2slp.put("i","i");
        lat2slp.put("ī","I");slp2lat.put("I","ī");      sw2slp.put("i_","I");

        lat2slp.put("u","u");slp2lat.put("u","u");      sw2slp.put("u","u");
        lat2slp.put("ū","U");slp2lat.put("U","ū");      sw2slp.put("u_","U");

        lat2slp.put("ṛ","f");slp2lat.put("f","ṛ");      sw2slp.put("r.","f");
        lat2slp.put("ṝ","F");slp2lat.put("F","ṝ");      sw2slp.put("r._","F");

        lat2slp.put("ḷ","x");slp2lat.put("x","ḷ");      sw2slp.put("l.","x");
        lat2slp.put("ḹ","X");slp2lat.put("X","ḹ");      sw2slp.put("l._","X");
//--------------------------------------------------------
        lat2slp.put("e","e");slp2lat.put("e","e");      sw2slp.put("e","e");
        lat2slp.put("ē","e");                           sw2slp.put("e_","e");
        lat2slp.put("ai","E");slp2lat.put("E","ai");    sw2slp.put("ai","E");
        lat2slp.put("āi","E");                          sw2slp.put("a_i","E");

        lat2slp.put("o","o");slp2lat.put("o","o");      sw2slp.put("o","o");
        lat2slp.put("ō","o");                           sw2slp.put("o_","o");
        lat2slp.put("au","O");slp2lat.put("O","au");    sw2slp.put("au","O");
        lat2slp.put("āu","O");                          sw2slp.put("a_u","O");
//--------------------------------------------------------
        lat2slp.put("ṅ","~");slp2lat.put("~","ṅ");      sw2slp.put("n.","~");

        lat2slp.put("ṁ","M");slp2lat.put("M","ṁ");      sw2slp.put("m.","M");
//--------------------------------------------------------
        lat2slp.put("ḣ","H");slp2lat.put("H","ḣ");      sw2slp.put("h.","H");
        lat2slp.put("k","k");slp2lat.put("k","k");      sw2slp.put("k","k");
        lat2slp.put("kh","K");slp2lat.put("K","kh");    sw2slp.put("kh","K");
        lat2slp.put("g","g");slp2lat.put("g","g");      sw2slp.put("g","g");
        lat2slp.put("gh","G");slp2lat.put("G","gh");    sw2slp.put("gh","G");
        lat2slp.put("ṅ","N");slp2lat.put("N","ṅ");      sw2slp.put("n_","N");
//--------------------------------------------------------
        lat2slp.put("c","c");slp2lat.put("c","c");      sw2slp.put("c","c");
        lat2slp.put("ch","C");slp2lat.put("C","ch");    sw2slp.put("ch","C");
        lat2slp.put("j","j");slp2lat.put("j","j");      sw2slp.put("j","j");
        lat2slp.put("jh","J");slp2lat.put("J","jh");    sw2slp.put("jh","J");
        lat2slp.put("ñ","Y");slp2lat.put("Y","ñ");      sw2slp.put("n~","Y");
//--------------------------------------------------------
        lat2slp.put("ṭ","w");slp2lat.put("w","ṭ");      sw2slp.put("t.","w");
        lat2slp.put("ṭh","W");slp2lat.put("W","ṭh");    sw2slp.put("t.h","W");
        lat2slp.put("ḍ","q");slp2lat.put("q","ḍ");      sw2slp.put("d.","q");
        lat2slp.put("ḍh","Q");slp2lat.put("Q","ḍh");    sw2slp.put("d.h","Q");
        lat2slp.put("ṇ","R");slp2lat.put("R","ṇ");      sw2slp.put("n.","R");
//--------------------------------------------------------
        lat2slp.put("t","t");slp2lat.put("t","t");      sw2slp.put("t","t");
        lat2slp.put("th","T");slp2lat.put("T","th");    sw2slp.put("th","T");
        lat2slp.put("d","d");slp2lat.put("d","d");      sw2slp.put("d","d");
        lat2slp.put("dh","D");slp2lat.put("D","dh");    sw2slp.put("dh","D");
        lat2slp.put("n","n");slp2lat.put("n","n");      sw2slp.put("n","n");
//--------------------------------------------------------
        lat2slp.put("p","p");slp2lat.put("p","p");      sw2slp.put("p","p");
        lat2slp.put("ph","P");slp2lat.put("P","ph");    sw2slp.put("ph","P");
        lat2slp.put("b","b");slp2lat.put("b","b");      sw2slp.put("b","b");
        lat2slp.put("bh","B");slp2lat.put("B","bh");    sw2slp.put("bh","B");
        lat2slp.put("m","m");slp2lat.put("m","m");      sw2slp.put("m","m");
//--------------------------------------------------------
        lat2slp.put("y","y");slp2lat.put("y","y");      sw2slp.put("y","y");
        lat2slp.put("r","r");slp2lat.put("r","r");      sw2slp.put("r","r");
        lat2slp.put("l","l");slp2lat.put("l","l");      sw2slp.put("l","l");
        lat2slp.put("v","v");slp2lat.put("v","v");      sw2slp.put("v","v");
//--------------------------------------------------------
        lat2slp.put("ç","S");slp2lat.put("S","ç");      sw2slp.put("c.","S");
        lat2slp.put("ṣ","z");slp2lat.put("z","ṣ");      sw2slp.put("s.","z");
        lat2slp.put("s","s");slp2lat.put("s","s");      sw2slp.put("s","s");
        lat2slp.put("h","h");slp2lat.put("h","h");      sw2slp.put("h","h");
    }

    public static String convertSw2slp(String s){
        StringBuilder result = new StringBuilder();

        int i = 0;
        int len = s.length();
        while(i < s.length()){
            if ((len>i+2)&&(sw2slp.get(s.substring(i,i+3))!=null)){
                result.append(sw2slp.get(s.substring(i,i+3)));
                //System.out.println("3:"+s.substring(i,i+3)+"="+sw2slp.get(s.substring(i,i+3)));
                i=i+3;
            } else {
                if ((len>i+1)&&(sw2slp.get(s.substring(i,i+2))!=null)){
                    result.append(sw2slp.get(s.substring(i,i+2)));
                    //System.out.println("2:"+s.substring(i,i+2)+"="+sw2slp.get(s.substring(i,i+2)));
                    i=i+2;
                } else {
                    if ((len>i)&&(sw2slp.get(s.substring(i,i+1))!=null)){
                        result.append(sw2slp.get(s.substring(i,i+1)));
                        //System.out.println("1:"+s.substring(i,i+1)+"="+sw2slp.get(s.substring(i,i+1)));
                        i=i+1;
                    } else {
                        result.append(s.substring(i,i+1));
                        //System.out.println("0:"+s.substring(i,i+1));
                        i=i+1;
                    }
                }
            }
        }

        return result.toString();
    }
}
