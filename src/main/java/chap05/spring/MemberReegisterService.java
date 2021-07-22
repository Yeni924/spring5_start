package chap05.spring;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class MemberReegisterService {
    @Autowired
    private final MemberDao memberDao;



    //생성자를 통해 의존 객체를 주입 받음, 주입 받은 객체를 필드에 할당
    public MemberReegisterService(MemberDao memberDao){
        this.memberDao=memberDao;
    }

    public Long regist(RegisterRequest req){ //RegisterRequest  커맨드 객체 , 스프링은 커맨드 객체의 setter를 이용해 값을 담아주는 기능을한다.
        Member member = memberDao.selectByEmail(req.getEmail());
        if(member!=null){
            throw new DuplicationMemberException("dup email"+req.getEmail());
        }

        Member newMember = new Member(req.getEmail(),req.getPassword(),req.getName(), LocalDateTime.now()); //이메일, 패스워드, 이름, 시간 등을 newmember에 담아서
        memberDao.insert(newMember); //member객체에 insert한다.
        return newMember.getId();
    }

}
