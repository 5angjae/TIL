P460

Crud에 더 활용도를 높이기 위해서 제공하는 api

Collection Framework ( p462 )

 

Collection 데이터를 배열로 바꿔서 사용할 수 있고 서로 호환이 가능하다.

List

순서가 유지가 되는 데이터. 순서가 보장되고, 값 중복 허용

ArrayList : 배열하고 비슷. Index 있음

Vector : Index 있음

LinkedList : 각 요소에 다음 요소의 주소값을 저장하는 노드를 활용

 

Set 

순서가 의미가 없다.

인덱스가 존재하지 않는다.

각 element의 값을 가지고 key 값을 만듬

따라서 값의 중복이 안된다. (같은 값은 같은 key를 가지기 때문에)

HashSet : 

TreeSet : 

 

Map

순서가 의미가 없다.

웹앱에서 많이 사용 (Key / Value로) - python에선 dictionary

 

P463

Iterable 인터페이스의 메서드

Iterator<T> iterator() 메서드 : T 타입의 iterator 생성

 

Java.util 패키지에 enumeration / iterator 기억할 것. 많이 씀

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

ArrayList

1_ 생성자

ArrayList()

ArrayList(int initialCapacity)

ArrayList(Collection<? Extends E> c)

들어가는 요소는 Object로 들어간다. 따라서

Object arr[] = new Object[10];

ArrayList list = new ArrayList();

두 코드는 동일하게 동작한다. ( 기본 default 세팅은 10개 만듬 )

 

466 467페이지. 요소가 object로 들어가서 생기는 문제. 타입 캐스팅 한 후, length() 함수 사용해야 한다.

 

제네릭(Generic) 컬렉션 객체를 타입 캐스팅해야 하는 문제를 해결하기 위한 것.??

클래스<데이터타입> 변수 = new 클래스<데이터타입>();

​      Collection에 저장되는 타입

ArrayList<String> list = new ArrayList<String>();

 

 

 

 

 

 

 

 

 

500페이지 이후 map

 

Map은 여러 개의 Entry로 구성된 객체

Entry는 key / value를 갖추고 있다.

 

HashMap

 

containsKey : 키값이 있는지 여부

containsValue : 밸류값이 있는지 여부

 

 

510페이지 hashtable

Hasmap 과 거의 똑같은데 다른점은 : 

Hashmap은 키밸류에 null 값을 넣을수 있으나

Hashtable은 키밸류에 null을 넣으면 오류가 난다.

 

505 페이지 TEST06

508 페이지 TEST07

510 페이지 TEST08

 