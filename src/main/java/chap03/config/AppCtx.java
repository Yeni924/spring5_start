package chap03.config;

import chap03.spring.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration //스프링 설정 클래스
public class AppCtx {

//    @Bean //MemberDao라는 이름으로 스프링에 주입
//    public MemberDao memberDao(){
//        return new MemberDao();
//    }
//
//    @Bean
//    public MemberReegisterService memberRegSvc(){
//        return new MemberReegisterService(memberDao());
//    }
//
//    @Bean
//    public ChangePasswordService changePwdSvc(){
//        ChangePasswordService pwdSvc = new ChangePasswordService();
//        pwdSvc.setMemberDao(memberDao());
//        return pwdSvc;
//    }
//
//    @Bean
//    public MemberPrinter memberPrinter() {
//        return new MemberPrinter();
//    }
//
//    @Bean//두개 이상의 인자를 받는 생성자를 사용하는 경우
//    public MemberListPrinter listPrinter() {
//        return new MemberListPrinter(memberDao(), memberPrinter());
//    }
//
//    @Bean
//    public MemberInfoPrinter infoPrinter(){
//        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//        infoPrinter.setMemberDao(memberDao());
//        infoPrinter.setPrinter(memberPrinter());
//        return infoPrinter;
//    }
}
