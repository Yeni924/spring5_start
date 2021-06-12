package chap04.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;

public class MemberListPrinter {
    private MemberDao memberDao;
    private MemberPrinter printer;

//    public MemberListPrinter(MemberDao memberDao, MemberPrinter printer){
//        this.memberDao = memberDao;
//        this.printer = printer;
//    }

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(m -> printer.print(m));

    }

    @Autowired
    public void setMemberDao(MemberDao memberDao){
        this.memberDao = memberDao; }

    @Autowired
    public void  setPrinter(MemberPrinter printer){
        this.printer = printer;
    }


}



