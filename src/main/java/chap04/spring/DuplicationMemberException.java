package chap04.spring;

public class DuplicationMemberException extends RuntimeException {
 public DuplicationMemberException(String message){
        super(message); //super 키워드는 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수 - RuntimeException 메세지 참조;
    }
}
