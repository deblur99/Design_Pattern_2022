package Decorator.Study.IOSimulator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    // 문자 하나를 소문자로 바꿈
    public int read() throws IOException {
        int c = in.read(); // 문자를 정수로 받기 때문에, 소문자로 바꾸려면 explicit type casting 필요
        return (c == -1 ? c : Character.toLowerCase((char)c)); // EOF에 도달하면 -1 리턴
    }

    // 문자열의 모든 문자를 소문자로 바꿈
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            // b의 요소가 byte기 때문에, 소문자로 바꾸려면 char로 explicit type casting 필요
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result; // result는 b를 참조한다. 따라서 b 내부의 요소 - 문자가 바뀌면 result도 바뀐다.
    }
}
