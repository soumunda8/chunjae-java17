package sec3;

public class SystemEx1 {

    // 보안관리자 설정하여 특정 조건이 되면 시스템 종료
    public static void main(String[] args) {

        /* java 11 이전 버전에서 사용하던 방법
        System.setSecurityManager(new SecurityManager(){

            @Override
            public void checkExit(int status) {
                if(status != 5) {
                    throw  new SecurityException();
                }
            }

        });
        */

        for(int i = 0; i < 5; i++) {
            try {
                // 비밀번호 확인 로직
                System.out.println(i);
            } catch (SecurityException e) {
                System.exit(i);
                System.out.println("종료");
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }

    }

}