package sec2;

import java.io.*;

// PrinterWriter : 출력을 버퍼, 한 줄, 한 글자, 문자열 등의 모든 단위의 파일에 쓰기 작업
public class PrintWriterEx2 {

    public static void main(String[] args) {

        try {

            File file = new File("out4.txt");
            if(!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fw);

            //writer.write("점심시간 10분전");
            writer.println("배고파 배고파~ 죽겠어~");
            writer.print(" 밥");
            writer.print(" 줘");
            writer.print("\n진짜 배고파 배고파~ 죽겠어~");

            writer.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}