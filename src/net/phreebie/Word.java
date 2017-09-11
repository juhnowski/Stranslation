package net.phreebie;


import com.gtranslate.Language;
import com.gtranslate.Translator;

import java.util.ArrayList;

public class Word {
    String text;
    String slpText;
    String translate;
    ArrayList<String> eng;
    ArrayList<String> ru;

    boolean isOriginal;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        slpText = SLP1.convertSw2slp(text);
        Connector conn = new Connector();
        translate = conn.checkWord(slpText,true);
        if (translate!=null){
            eng = parse(translate);
        }

       // toRus();
    }

    public Word(String text, boolean isOriginal){
        setText(text);
        this.isOriginal = isOriginal;
    }

    public String toString(){
        StringBuilder streng = new StringBuilder();
        streng.append("[\n");
        if (eng!=null) {
            eng.forEach((e) -> {
                streng.append(e + "\n");
            });
        }
        streng.append("]\n");
        return "{\"Text\":\""+text+"\",\"slpText\":\""+slpText+"\",\"Translate\":\""+streng.toString()+"\"}";
    }

    public ArrayList<String> parse(String r){
        ArrayList list = new ArrayList();
        String[] res = r.split("</span><br/><span style=''>");

        String last = "";
        int j;
        for (j = 0; j < res.length; j++) {
            if (j == 0) {
                String[] res1 = res[0].split("<br/><span style=''>");
                //System.out.println("+"+res1[1]);
                if(res1.length>1) {
                    list.add(res1[1]);
                    last = res1[1];
                } else {
                    list.add(res1[0]);
                    last = res1[0];
                }
            } else {
                //System.out.println("+"+res[j]);
                last = res[j];
                list.add(res[j]);
            }
        }

        String[] res2 = last.split("</span>");
        //System.out.println(""+j+"++"+res2[0]);
        list.set(j - 1, res2[0]);

/*        list.forEach((ss) -> {
            System.out.println(ss);
        });
*/
        return list;
    }

    public void toRus(){
        Translator transRu = Translator.getInstance();
        eng.forEach((s)->{
            if(s!=null) {
                ru.add(transRu.translate(s, Language.ENGLISH, Language.RUSSIAN));
            }
        });
    }
}
