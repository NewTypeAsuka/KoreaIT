package day12.io;

import java.io.*;

/*
 * BufferedInputStream / BufferedOutputStream
 * 	버퍼 보조스트림
 * 	성능도 더 향상된다.
 * 	병목현상 방지
 *  (유튜브 등에서 버퍼링되는 사전 영상을 버퍼 input/output이라 생각)
 */
public class MainClass03 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		
		try {
			fis = new FileInputStream("./upload/hello.txt");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("./upload/hello2.txt");
			bos = new BufferedOutputStream(fos);
			
			// println 같은 메소드를 파일에 사용할 수 있다.
			ps = new PrintStream(bos, true);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush(); // 남은 버퍼 데이터 쏟아내라
			
			ps.println();
			ps.print("===========================================");
			
		} catch (Exception e) {
			System.out.println("에러 발생!");
		} finally {
			if(ps != null)ps.close();
			if(bos != null)bos.close();
			if(bis != null)bis.close();
			if(fos != null)fos.close();
			if(fis != null)fis.close();
		}
		
		System.out.println("실행 완료!");
	}
}
