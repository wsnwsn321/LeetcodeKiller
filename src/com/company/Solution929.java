package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution929 {
    public static void main(String[] args) {
        //String[] a =new String[]{"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com","fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com","r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com","r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com","r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com","fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com","fg.r.u.uzj+fek@kziczvh.com"};
        String[] a =new String[]{"r.cyo.g+d.h+b.ja@tgsg.z.com"};

        numUniqueEmails(a);
    }
    public static int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();
        for(int i=0;i<emails.length;++i){
            String e = emails[i];
            int findAt = e.indexOf('@');
            while(e.indexOf('+')<findAt&&e.indexOf('+')!=-1){
                e=e.substring(0,e.indexOf("+"))+e.substring(findAt);
                findAt = e.indexOf('@');
            }
            while(e.indexOf('.')<findAt&&e.indexOf('.')!=-1){
                e=e.substring(0,e.indexOf("."))+e.substring(e.indexOf(".")+1);
                findAt = e.indexOf('@');
            }
            result.add(e);

        }
        return result.size();
    }
}
