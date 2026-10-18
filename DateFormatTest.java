import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
  public static void main(String[] args) {
    Date now = new Date();

    // 1. Date -> String (format)
    SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat f3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분", Locale.KOREA);
    SimpleDateFormat f4 = new SimpleDateFormat("yy/M/d (EEE) hh:mm a", Locale.US);

    System.out.println("기본 toString : " + now);
    System.out.println("yyyy-MM-dd    : " + f1.format(now));
    System.out.println("시:분:초 포함  : " + f2.format(now));
    System.out.println("한글 형식      : " + f3.format(now));
    System.out.println("영문 형식      : " + f4.format(now));

    // 2. String -> Date (parse)
    try {
      Date birthday = f1.parse("2000-05-15");
      System.out.println("parse 결과     : " + f3.format(birthday));
    } catch (ParseException e) {
      System.out.println("날짜 형식 오류: " + e.getMessage());
    }

    // 3. 형식이 맞지 않는 문자열
    try {
      f1.parse("2000/05/15");
    } catch (ParseException e) {
      System.out.println("날짜 형식 오류: " + e.getMessage());
    }
  }
}
