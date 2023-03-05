# 1주차 강의자료 정리

## 기본수학

### 소수 구하기
**소수**

> 정의 : 1보다 큰 자연수 중 1과 자신을 제외한 나머지 자연수로 나누어 떨어지지 않는 수.

이와 다른 수는 합성수라고 표현된다.

### 소수가 쓰이는 곳

암호
일상생활에서 소수라는 개념을 잘 사용해보셨을까요? 아마 거의 없다고 느끼 실 겁니다.
하지만 생각 보다 많은 부분에서 소수가 적용되어 우리가 사용하고 있었습니다.
예시로 암호랑 관련 되어있는데요

대표적으로 RSA 암호화 방식이 있습니다.

> 일반적으로 곱을 통해서 수를 만들어 내긴 쉬우나 소인수 분해를 하는 것은 어렵다.

ex) RSA 암호화 방식

---

### JAVA 수학(Math)관련 메서드

**Math클래스** 메서드

java.lang에 포함된 클래스로 전부 static하게 구현되어 객체생성없이 사용 가능합니다.

| 반환자료형                             | 메서드와 설명                                                                                                                  |
|-----------------------------------|--------------------------------------------------------------------------------------------------------------------------|
| double                            | random() <br> 0.0~1.0 사이의 임의의 double형 데이터를 생성하여 반환                                                                       |
| int<br/>long<br/>double<br/>float | max(int a, int b) <br> max(long a, long b) <br> max(double a, double b) <br> max(float a, float b) <br> 인자들 중 더 큰 수를 반환  |
| int<br/>long<br/>double<br/>float | min(int a, int b) <br> min(long a, long b) <br> min(double a, double b) <br> min(float a, float b) <br> 인자들 중 더 작은 수를 반환 |
| long / int                        | round(double a) <br> 반올림, 인자보다 작은 정수 중 가장 큰 정수를 반환                                                                       |
| double                            | floor(double a) <br>  올림, 인자보다 작은 정수 중 가장 큰 정수를 반환                                                                       |
| double                            | ceil(double a) <br>   내림, 인자보다 작은 정수 중 가장 큰 정수를 반환                                                                       |
| double                            | pow(double a, double b) <br>   a와 b에 대해서 제곱연산 수행 a^b                                                                     |
| double                            | abs(double a) <br>    인자로 넘긴 데이터의 절댓값을 반환                                                                                |
| double                            | sqrt(double a) <br>   인자의 제곱근에 해당하는 값 반환                                                                                 |
| double                            | sin(double a) <br> cos(double a) <br> tan(double a) <br>  인자에 해당하는 삼각함수값을 반환                                             |
| int<br/>long                      | subtractExact(int a, int b) <br> subtractExact(long a, long b) <br>   전달 된 인자들의 차이를 반환. b-a                              |
