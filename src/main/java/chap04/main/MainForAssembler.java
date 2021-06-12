package chap04.main;

import java.io.IOException;

public class MainForAssembler {
    public static void main(String[] args) throws IOException{
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while (true){
//            System.out.println("입력");
//            String command = reader.readLine();
//            if(command.equalsIgnoreCase("q")){
//                System.out.println("종료");
//                break;
//            }
//
//            if(command.startsWith("new")){
//                processNewCommand(command.split(" "));
//                continue;
//            }else if(command.startsWith("change")){
//                processChangeCommand(command.split(" "));
//                continue;
//            }
//            printHelp();
//        }
//    }
//
//    private static void printHelp() {
//        System.out.println();
//        System.out.println("잘못된 명령어 사용법");
//
//    }
//
//    private static void processChangeCommand(String[] arg) {
//        if(arg.length!=4){
//            printHelp();
//            return;
//        }
//        ChangePasswordService changPwdSvc = assembler.getChangePasswordService();
//        try {
//            changPwdSvc.changePassword(arg[1],arg[2],arg[3]);
//            System.out.println("암호변경");
//        }catch (Exception e){
//            System.out.println("존재하지않은 이메일입니다");
//        }
//    }
//
//    private  static Assembler assembler = new Assembler();
//
//    private static void processNewCommand(String[] arg) {
//
//        if(arg.length!=5)
//        {
//            System.out.println(arg.length);
//            printHelp();
//            return;
//        }
//
//
//        MemberReegisterService regSvc= assembler.getMemberRegisterService();
//        RegisterRequest req = new RegisterRequest();
//        req.setEmail(arg[1]);
//        req.setName(arg[2]);
//        req.setPassword(arg[3]);
//        req.setConfirmPassword(arg[4]);
//
//        if(!req.isPasswordEqualToConfirmPassword()){
//            System.out.println("암호가 틀림");
//            return;
//        }
//        try {
//            regSvc.regist(req);
//            System.out.println("등록완료");
//        }catch (DuplicationMemberException e){
//            System.out.println("이미 존재하는 이메일입니다");
//        }
   }


}
