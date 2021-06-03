package chap02;

public class Greeter {
    private String format;

    public String greet(String guest){ //문자열 포맷을 이용해 새로운 문자 생성
        return String.format(format,guest);
    }

    public void setFormat(String format){
        this.format=format;
    }

}
