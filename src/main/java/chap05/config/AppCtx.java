package chap05.config;

import chap05.spring.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration //스프링 설정 클래스
//@ComponentScan(basePackages = {"chap05.spring"},
//        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "spring\\..*Dao")) //spring으로 시작하고 Dao로 끝나는 정규식이 제외됌

//@ComponentScan(basePackages = {"chap05.spring"},
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "spring\\..*Dao"))

//spring으로 시작하고 Dao로 끝나는 정규식이 제외됌

//@ComponentScan(basePackages = {"chap05.spring" },
//        excludeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class )
//        })
//
//@ComponentScan(basePackages = {"chap05.spring" },
//        excludeFilters = {
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class )
//        })


@ComponentScan(basePackages = {"chap05.spring" },
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class ),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class )
        })


public class AppCtx {

    @Bean //MemberDao라는 이름으로 스프링에 주입
    public MemberDao memberDao(){
        return new MemberDao();
    }

    @Bean
    public MemberReegisterService memberRegSvc(){
        return new MemberReegisterService(memberDao());
    }

    @Bean
    public ChangePasswordService changePwdSvc(){
        ChangePasswordService pwdSvc = new ChangePasswordService();
    //    pwdSvc.setMemberDao(memberDao()); //@autowired로 자동 주입했기 때문에 지움.
        return pwdSvc;
    }


    @Bean
    public MemberPrinter printer() {
        return new MemberPrinter();
    }

    @Bean
    public MemberPrinter memberPrinter2() {
        return new MemberSummaryPrinter();
    }


    @Bean//두개 이상의 인자를 받는 생성자를 사용하는 경우
    public MemberListPrinter listPrinter() {

        return new MemberListPrinter();

        //  return new MemberListPrinter(memberDao(), memberPrinter());
    }

    @Bean
    public MemberInfoPrinter infoPrinter(){
        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
      //  infoPrinter.setMemberDao(memberDao()); //@autowired로 자동 주입했기 때문에 지움.
      //  infoPrinter.setPrinter(memberPrinter());
        return infoPrinter;
    }

}
