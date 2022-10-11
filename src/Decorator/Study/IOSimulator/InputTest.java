package Decorator.Study.IOSimulator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        // 자바 파일처리 방식은 데코레이터 패턴을 사용한다!
        try {
            InputStream in =
                    new LowerCaseInputStream(
                        new BufferedInputStream(
                            new FileInputStream("src/Decorator/Study/IOSimulator/text.txt")
                    )
            );

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace(); // 오류 메시지 출력
        }
    }
}
