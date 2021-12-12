# REST API

## **REST의 구성**

자원 : URI (Uniform Resource Identifier) 

행위 : HTTP Method

표현 : Representations



## 자원

URI : 인터넷의 자원을 나타내는 유일한 주소

​	자원을 식별하거나 이름을 지정하는데 사용되는 간단한 문자열.

​	하위개념 URL / URN

URL : 자원을 찾는 방법 제공

URN : 자원의 ID를 정의

​	URL과 URN은 상호 보완적

**URI 구조**

`http` `://` `localhost` `:` `3000` `/` `posts/3` `?` `q=http`

`Scheme / Protocol` `://` `Host` `:` `Port`  `/` `Path` `?` `Query`

URI 설계 주의사항

1. 밑줄 (_) 아닌 하이픈 (-) 을 사용
2. 소문자 사용 - 대소문자에 따라 다른 자원으로 인식
3. 파일 확장자는 포함시키지 않는다.



## 행위

HTTP Method



GET

POST

PUT

DELETE



## 표현

Representations



json



