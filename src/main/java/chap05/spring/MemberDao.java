package chap05.spring;


import chap05.config.ManualBean;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@ManualBean
@Component //스프링이 직접 클래스를 검색해서 빈으로 등록해주는 기능
public class MemberDao {
    private static long nextId = 0;


    private final Map<String, Member> map = new HashMap<>(); //Java Map은 리스트나 배열처럼 순차적으로 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다.

    public Member selectByEmail(String email){
        return map.get(email); //키값을 통해 email 가져오기
    }

    public void insert(Member member){
        member.setId(++nextId);
        map.put(member.getEmail(),member);
    }

    public void update(Member member){
        map.put(member.getEmail(),member);
    }

    public Collection<Member> selectAll(){
        return map.values();
    }
}
