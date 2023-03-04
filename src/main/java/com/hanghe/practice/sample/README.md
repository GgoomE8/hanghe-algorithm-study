# JAVA Input / Output in Algorithm

## System.in
| 데이터를 입력 받음
- System.in

## System.out

| 데이터를 출력함
- System.out.println();
- System.out.printf("%d", n)

*****

## Scanner
| 다양한 데이터를 읽을 수 있습니다. 정수, 부동소수점, 숫자 및 문자열 모두를 읽을 수 있습니다.   또한 입력 토큰화를 수행할 수도 있으며 잘못된 데이터 타입을 지정하려고 할 시에는 InputMismatchException을 발생 시킵니다.
- next[자료형]
  - 해당 하는 데이터를 순서대로 출력 가능
  
- hasNext[자료형]
  - 해당 자료형으로 입력 받을 수 있는 지에 대한 판단 여부
  

### 줄바꿈 형태가 존재할 때 : '\n'
이럴 때 다음 인풋을 받기 전 줄바꿈을 진행한다.
- nextLine


```java
public class Main {
    /// 입력값 형태가 15423 일 경우
  public static void main(String[] args) {
    Scanner sc = new Scanner(system.in);
    int sum = 0;
    while (sc.hasNextInt()) {
      sum += sc.nextInt();
    }
    System.out.println(sum);
  }
  /*  입력값 형태가 다음과 같은 경우
          1
          2
          5
          4
          3
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(system.in);
    int sum = 0;
    while (sc.hasNextInt()) {
      sum += sc.nextInt();
      scanner.nextLine();
    }
    System.out.println(sum);
  }
}
```

*****

## BufferedReader
- 문자열 입력 부분에서 데이터를 읽고 버퍼에 저장해둡니다.
- 한 번에 한문자를 읽는 대신 한 문자 청크를 읽을 수 있어 대량의 텍스트를 효율적으로 읽습니다.
- 즉 대용량 파일이나 스트림을 스캐너보다 빨리 읽을 수 있는 장점을 가집니다.
- 오류가 발생 했을때 I/O Exception을 출력합니다.
- 입력 받은 데이터가 많은 경우에는 BufferedReader를 지향합시다.


## StringTokenizer
- 문자열을 토큰 단위로 구분해서 만들어주는 클래스입니다.
- 이 메서드는 식별자, 숫자, 인용문자열을 구분하지 않습니다.
- StringTokenizer을 사용하여 문자열 파싱시 일반적인 [String].split메서드 사용보다 훨씬 간편하게 사용가능합니다.
- <code class="hljs"><span class="hljs-keyword">import</span> java.util.StringTokenizer;

```java
  public class sample {
    public static void main(String args[]) {
      StringTokenizer st = new StringTokenizer("hello hanghe spring Group 14");
      while(st.hasMoreTokens()) { /// scanner hasNext와 동일하게 다음 글자 여부의 유/무를 판단
          System.out.println(st.nextTokne()); // 다음 문자열을 반환
      }
    }
}

/* ** 출력값 **
hello 
hanghe 
  spring 
Group 
14
*/
```
| 자료형     | 메서드                                                                                 |
|---------|-------------------------------------------------------------------------------------|
| int     | countTokens() <br>예외를 발생하기 전 까지 해당 Tokenizer의 호출 가능 횟수를 카운팅 한다.                     |
| boolean | hasMoreElements() <br>hasMoreTokens() 메소드와 동일한 값을 반환한다.                             |
| boolean | hasMoreTokens() <br>  해당 Tokenizer에서 추가적으로 사용할 수 있는 토큰이 있는지 테스트한다.                  |
| Object  | nextElement() <br> 기본적으로 nextToken() 메소드와 동일하지만 반환값이 String이 아니라 Object라는 차이점을 가진다. |
| String  | nextToken() <br>  해당 StringTokenizer에서 다음 토큰을 반환하는 메소드                              |
| String  | nextToken(String delim) <br>      구분기호를 포함한 nextToken() 메소드다.                       |