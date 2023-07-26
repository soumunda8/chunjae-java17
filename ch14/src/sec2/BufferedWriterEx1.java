package sec2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 출력 방식 : BufferedWriter, PrintWrite, Files, DataOutputStream
public class BufferedWriterEx1 {

    public static void main(String[] args) {

        // 파일 첨부 및 파일 가져오기 = File
        
        /*
        // 경로를 따로 설정하고 가져올 때
        String path = "d:\\park\\java\\out3.txt";
        File file = new File(path);
        */
        try {

            File file = new File("out3.txt");
            if(!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);               // 연필
            BufferedWriter writer = new BufferedWriter(fw);     // 연필 쓸 사용자
            
            // 연필을 든 사용자가 노트에 글을 씀 -> file = 노트
            writer.write("점심시간 10분전");

            writer.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
        
    }

}