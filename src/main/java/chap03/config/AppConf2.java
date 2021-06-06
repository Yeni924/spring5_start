package chap03.config;

import chap03.spring.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"chap03.spring"})


public class AppConf2 {
//    @Autowired
//    private MemberDao memberDao;
//
//    @Autowired
//    private MemberPrinter memberPrinter;
    private final MemberDao memberDao;
    private final MemberPrinter memberPrinter;


    public AppConf2(MemberDao memberDao, MemberPrinter memberPrinter) {
        this.memberDao = memberDao;
        this.memberPrinter = memberPrinter;
    }


    @Bean
    public MemberReegisterService memberRegSvc(){
        return new MemberReegisterService(memberDao);
    }

    @Bean
    public ChangePasswordService changePwdSvc(){
        ChangePasswordService pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
        return pwdSvc;
    }

    @Bean
    public MemberListPrinter listPrinter(){
        return new MemberListPrinter(memberDao,memberPrinter);
    }

    public MemberInfoPrinter infoPrinter(){
        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
        infoPrinter.setMemberDao(memberDao);
        infoPrinter.setPrinter(memberPrinter);
        return infoPrinter;
    }

}
