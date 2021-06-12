package chap04.spring;

import lombok.Data;

//회원가입 처리할때 필요한 데이터
@Data
public class RegisterRequest {
    private String email;
    private String password;
    private String confirmPassword;
    private String name;


    public boolean isPasswordEqualToConfirmPassword(){
        return password.equals(confirmPassword);
    }

}
