package net.phreebie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*        String s0 = "om";//"Br.hadac.va uva_ca |";
        SentenceBuilder sb = new SentenceBuilder();
        sb.addString(s0);
        Sentence s = sb.build();
        s.print();

        String r = "\"http://www.sanskrit-lexicon.uni-koeln.de/scans/WILScan/2014/web/webtc/getword.php?key=BfhadaSva&filter=slp1&noLit=off&transLit=slp1<META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=utf-8\">\n" +
                "<!--filter=slp1<br>,filterin=slp1-->\n" +
                "<h1>&nbsp;Bf</h1>\n" +
                "<table class='display'>\n" +
                "<tr><td><span style='background-color:beige'>&nbsp;<span class='sdata'>Bf(Y) BfY</span><span class='lnum'> [Cologne record ID=28819]</span><span class='hrefdata'> [Printed book page <a href='../webtc/servepdf.php?page=625' target='_Blank'>625</a>]</span></span>\n" +
                "<br/> <span class='sdata'>Bf(Y) BfY</span>  r. 1st cl. (<span class='sdata'>Barati-te</span>) (<span class='sdata'>qu Y</span>) <span class='sdata'>quBfY</span> r. 3rd  cl. (<span class='sdata'>viBartti viBfte</span>) <br/><span style=''>1 To nourish, to cherish, to foster, to maintain. </span><br/><span style=''>2 To fill. </span><br/><span style=''>3 To hold or support.  </span>\n" +
                "</td></tr></table>\n" +
                "\"";
*/



        String s0 = "Br.hadac.va uv_ca |";
        String s1 = "a_si_d ra_ja_ nalo na_ma vi_rasenasuto bali_ |";
        String s2 = "upapanno gun.air is.t.ai ru_pava_n ac.vakovidah. ||1||";

        String s3 = "atis.t.han manujendra_n.a_m. mu_rdhni devapatir yatha_ |";
        String s4 = "upary upari sarves.a_m a_ditya iva tejasa_ ||2||";

        SentenceBuilder sb = new SentenceBuilder();
        sb.addString(s0);
        sb.addString(s1);
        sb.addString(s2);
        sb.addString(s3);
        sb.addString(s4);
        Sentence s = sb.build();
        s.print();

    }
}
