package chap05.spring;

import org.springframework.stereotype.Component;

@Component("infoPrinter") //@Component 애노테이션에 값을 주었는지에 따라 빈으로 등록할 때 사용할 이름이 결정됌
public class MemberInfoPrinter {
    private MemberDao memberDao;
    private MemberPrinter printer;

    public void printMemberInfo(String email){
        Member member = memberDao.selectByEmail(email);
        if(member == null){
            System.out.println("데이터 없음\n");
            return;
        }
        printer.print(member);
        System.out.println();
    }

    public void  setMemberDao(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    public void setPrinter(MemberPrinter printer){
        this.printer = printer;
    }
}
