# 2주차 강의자료 정리

## 자료구조
### 배열

> 메모리 상에 원소를 연속하게 배치한 자료구조

자바 상에서는 배열의 길이를 변경하는게 불가능 하지만 자료구조로써는 배열의 길이를 늘리거나 줄일 수 있다고 생각할께요!

**성질**

1. O(1)에 k번쨰 원소를 확인/변경 가능
2. 추가적으로 소모되는 메모리의 양(오버헤드)가 거의 없음
3. 메모리 상에 연속한 구간을 잡아야 해서 할당에 제약이 걸림

**설명**

맨 끝에 자료를 추가/제거하는 구조일 때는 O(1)의 시간 복잡도를 갖음

But. 임의에 위치에 원소 추가시 O(N)

---

### 연결리스트
연결리스트의 성질

1. K번째 원소를 확인/ 변경하기 위해 O(k)가 필요함
2. 임의의 위치에 원소를 추가/임의 위치의 원소제거는 O(1)
3. 원소들이 메모리 상에 연속해 있지 않아 Cache hit rate가 낮다
4. 새로 할당이 쉬운 편

연결 리스트의 종류
**단일 연결 리스트**
이중 **연결 리스트**
원형 **연결 리스트**


연결리스트의 대표 예시로는 메모장이 있습니다.

배열 vs 연결 리스트(LinkedList)

|                            | 배열 | 연결리스트 |
|----------------------------| --- | --- |
| N번째 원소의 접근                 | O(1) | O(N) |
| 임의 위치에 원소 추가/제거            | O(N) | O(1) |
| 메모리 상의 배치                  | 연속 | 불연속 |
| 추가적으로 필요한 공간<br>(overhead) | - | O(N) |

LinkedList vs ArrayList

|  | ArrayList                        | 연결리스트 |
| --- |----------------------------------| --- |
| 읽기(접근시간) | 빠르다                              | 느리다 |
| 추가/삭제 | 느리다                              | 빠르다 |
| 비 고 | 순차적인 추가삭제는 더 빠름.<br>비효율적인 메모리 사용 | 데이터가 많을 수록 접근성이 떨어짐 |
| 시간복잡도 |                                  |  |
| 마지막위치에 원소 추가 | O(1)                             | O(1) |
| 임의 위치에 원소 추가/제거 | O(N)                             | O(1) |
| 임의 위치 접근(색인) | O(1)                             | O(N) |
___

### 스택

> stack의 특징
1. LIFO(Last In First Out) 구조로 먼저 들어간 자료가 나중에 나오는 것을 의미
2. 그래프의 깊이 우선 탐색(DFS)에서 사용
3. 재귀적(Recursion) 함수를 호출 할 때 사용
4. 시스템 해킹에서 버퍼오버플로우 취약점을 이용한 공격을 할 때 스택 메모리의 영역에서 시도 되어짐
5. 인터럽트처리, 수식의 계산, 서브루틴의 복귀 번지 저장 등에 쓰임

> stack의 활용
```java
import java.util.Stack; //import

Stack<Integer> stack = new Stack<>(); // int형 스택 선언부
stack.push(0);    // stack에 값 0 추가
stack.push(1);    // stack에 값 1 추가
stack.push(2);    // stack에 값 2 추가
stack.push(3);    // stack에 값 3 추가
stack.size();     // stack의 크기 출력 : 4
stack.pop();      // stack에 값 없애기 단일  -> 3 제거
stack.peek();     // stack의 가장 상단의 값 출력 -> 2
stack.empty();    // stack이 비어있는제 check (false) 0,1;
stack.contains(1) // stack에 1이 있는지 check (있다면 true)
stack.clear();    // stack의 전체 값 제거 (초기화)
stack.empty();    //true
```

**시간복잡도**

|        | 스텍   |
|--------|------|
| push() | O(1) |
| pop()  | O(1) |
| peek() | O(1) | 
| search | O(N) |

- 단점
  - Stack 클래스는 synchronized 키워드가 붙어있기 때문에 Thread-safe 하다는 특징을 가지고 있습니다. 즉, 멀티스레드 환경이 아닐 때 사용하면 lock을 거는 작업 때문에 많은 오버헤드가 발생하게 됩니다.
  - Stack 클래스는 Vector 클래스를 잘못 확장한 자바의 큰 실수입니다. 왜냐하면 Stack은 LIFO 구조를 이용해야 하기 때문에 Vector 클래스를 확장하면 중간에서 데이터를 삽입, 삭제를 할 수 있게 됩니다.

stack과 관련된 구현을 할 때는 **ArrayDeque**를 고려하자
> ArrayDeque 공식문서에 보면 스택구조로 사용하면 Stack 클래스보다 빠르고, 큐 구조로 사용하면 Queue 클래스보다 빠르다고 합니다.(ArraDeque는 Thread-Safe 하지 않기 때문입니다.)

### 큐

> 큐의 특징
1. FIFO(First In First Out) 구조로 먼저 들어간 자료가 먼저 나옴
2. 그래프의 넓이 우선 탐색(BFS)에서 활용
3. 자료를 집어넣을 수 있는 선형 자료형
4. Enqueue / Dequeue
5. 순서대로 처리해야 하는 작업을 임시로 저장해두는 버퍼(buffer)로서 많이 사용


```java
// 자바에서 큐를 구현할시 LinkedList로 구현 가능하다.
import java.util.LinkedList;
import java.util.Queue;

// Queue<Element> queue = new LinkedList<>()와 같이 선언해주면 된다
Queue<Integer> queue = new LinkedList<>();

queue.add(0);        // 값 추가 0
queue.add(1);        // 값 추가 1
queue.offer(2);      // 값 추가 2
queue.peek();        // 값 추출 0
queue.poll();        // 첫번째 값을 반환하고 제거, 비어있다면 null
queue.remove();      // 첫번째 값 제거
queue.clear();       // queue 초기화
```

**시간복잡도**

|                   | 큐       |
|-------------------|---------|
| add()             | O(1)    |
| remove()          | O(1)    |
| get()             | O(N)    |
| Contains()        | O(N)    | 
| iterator.remove() | O(1)    |

- 장점
  - 데이터 추가/삭제시 빠름 -> 데이터를 저장하는 각 노드가 이전 노드와 다음 노드의 상태만 알고 있기 때문
- 단점
  - thread-safe 보장 안함
  - 데이터 검색시 처음부터 노드를 순화해야 되기 때문에 느림


### 우선순위 큐

- 큐의 성질은 가졌으나, 각 데이터가 우선순위를 갖고 있어 우선순위가 높은 순서대로 출력
- (우선순위가 동일할 경우는 큐의 순서대로)
- 내부 요소는 힙으로 구성되어 이진트리의 구조. 시간복잡도는 O(NLogN)
- Min Heap으로 데이터를 정렬 후 데이터를 출력
- 값 추가, 삭제 등은 연결 리스트 (LinkedList)와 동일


**시간복잡도**

|          | 우선순위 큐    |
|----------|-----------|
| offer()  | O(log n)  |
| peek()   | O(1)      |
| poll()   | O(log n)  |
| size()   | O(1)      |

- 특징
  - Null 비허용

### 덱 (Dobulel-ended queue)

- 단 방향으로 삽입 삭제가 이루어 진 "큐"와 달리 양 쪽 방향으로 삽입 삭제가 이루어 질 수 있도록 구현 한 것
- 메서드는 12가지로 다음과 같습니다.

|            | HEAD(front)   |                  | Tail(rear)    |                  |
|------------|---------------|------------------|---------------|------------------|
|            | special value | Throws Exception | special value | Throws Exception |
|  | -----------   | -------          | ---------     | ---------        |
| 삽입         | offerFirst    | addFirst         | offer         | add              |
|      |               |                  | offerLast     | addLast          |
| 삭제         | poll          | remove           | pollLast      | removeLast       |
|      | pollFirst     | removeFirst      |               |                  |
| 조사         | peek          | element          | peekLast      | getLast          |
|      | peekFirst     | getFirst         |               |                  |

- addFirst() : 덱의 앞쪽에 엘리먼트를 삽입한다. 용량 제한이 있는 덱의 경우, 용량을 초과하면 예외(Exception)가 발생한다 
- offerFirst() : 덱의 앞쪽에 엘리먼트를 삽입한다. 정상적으로 엘리먼트가 삽입된 경우 true가 리턴되며, 용량 제한에 걸리는 경우 false를 리턴한다.
- addLast() : 덱의 마지막 쪽에 엘리먼트를 삽입한다. 용량 제한이 있는 덱의 경우, 용량 초과시 예외가 발생한다
- add() : addLast()와 동일
- offerLast() : 덱의 마지막 쪽에 엘리먼트를 삽입한다. 정상적으로 엘리먼트가 삽입된 경우 true가 리턴되며, 용량 제한에 걸리는 경우 false를 리턴한다.
- removeFirst() : 덱의 앞쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 예외가 발생한다.
- pollFirst() : 덱의 앞쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 null 이 리턴된다.
- removeLast() : 덱의 마지막 쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 예외가 발생한다.
- pollLast() : 덱의 마지막 쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 null 이 리턴된다.
- remove() : removeFirst()와 동일
- poll() : pollFirst()와 동일
- getFirst() : 덱의 앞쪽 엘리먼트 하나를 제거하지 않은채 리턴한다. 덱이 비어있으면 예외가 발생한다
- peekFirst() : 덱의 앞쪽 엘리먼트 하나를 제거하지 않은채 리턴한다. 덱이 비어있으면 null이 리턴된다.
- getLast() : 덱의 마지막쪽 엘리먼트 하나를 제거하지 않은채 리턴한다. 덱이 비어있으면 예외가 발생한다.
- peekLast() : 덱의 마지막 엘리먼트 하나를 제거하지 않은 채 리턴한다. 덱이 비어있으면 null이 리턴된다.
- peek() : peekFirst()와 동일
- removeFirstOccurrence(Object o) : 덱의 앞쪽에서부터 탐색하여 입력한 Object o와 동일한 첫 엘리먼트를 제거한다. Object o 와 같은 엘리먼트가 없으면 덱에 변경이 발생하지 않는다.
- removeLastOccurrence(Object o) : 덱의 뒤쪽에서부터 탐색하여 입력한 Object o와 동일한 첫 엘리먼트를 제거한다. Object o 와 같은 엘리먼트가 없으면 덱에 변경이 발생하지 않는다.
- element() : removeFirst()와 동일

> 하단 부터 Collection
- addAll(Collection <? extends E c) : 입력 받은 Collection의 모든 데이터를 덱의 뒤쪽에 삽입한다. 
- push() : addFirst()와 동일. 덱을 스택으로 사용할 때 쓰임
- pop() : removeFirst()와 동일. 덱을 스택으로 사용할 때 쓰임
- remove(Object o) : removeFirstOccurrence(Object o)와 동일
- contain(Object o) : 덱에 Object o와 동일한 엘리먼트가 포함되어 있는지 확인
- size() : 덱의 크기
- iterator() : 덱의 앞쪽부터 순차적으로 실행되는 이터레이터(iterator)를 얻어옴
- descendingIterator() : 덱의 뒤쪽부터 순차적으로 실행되는 이터레이터(iterator)를 얻어옴

### 해시

- 해시는 내부적으로 배열을 사용하여 데이터를 저장. 빠른 검색 속도를 가짐
- 데이터 삽입, 삭제시 밀어내거나 채우는 작업이 없이 고유 인덱스로 데이터를 저장함.

**key를** **hash function을 통해 hash값으로 바꾼뒤**이 **hash값을 index로 사용해 key - value 형식으로** 저장하는 자료구조.

hash table은 **순서없이 key - value로만 값을 저장하기 때문에 순서가 필요한 데이터에는 비적합.**

순차적인 저장을 하는 배열 인덱스와 달리 전 영역에 분포되어 저장.

장점
- key - value 1대1 구조로 삽입,검색, 삭제, 모두 평균 O(1)의 복잡도를 가짐.

단점
- 공간효율성 떨어짐. ( 데이터 저장 전 공간 생성.)
- 순서 보장 x ( hash function이 index를 정함.)
- hashFunction 의존도가 높다.( 함수가 복잡하다면 hash 생산 소요시간이 길어짐. )
- 최악의 케이스는 O(n)의 시간 복잡도를 가짐.


- 참고자료
  - [시간복잡도](https://gist.github.com/FedericoPonzi/8d5094dbae33cbb94536a73f62d1c1a0)