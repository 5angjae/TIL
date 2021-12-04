# 동기 vs 비동기

> Web 개발을 하며 Vue 코드를 작성할 때, 동기 비동기에 대한 이해도가 떨어져 코드 오류 수정이 힘들었던 경험이 있다. 여전히 동기 비동기에 대한 개념은 내가 직접 전부 설명하기는 애매한 수준으로 이해하고 있다.

## 동기 방식 (Synchronous)

요청을 보낸 후, 응답을 받아야지만 다음 동작이 이루어지는 방식이다.

어떤 일을 처리하는 동안 다른 프로그램은 정지하고, 실제 CPU가 느려지는 것은 아니라도 시스템의 전체 효율을 저하시킨다.

순차적, 직렬적 태스크 수행. 즉 1개만 할 수 있음

요청을 보낸 후 응답을 받아야만 다음 동작이 이루어짐 (blocking)

## 비동기 방식 (Asynchronous)

요청을 보낸 후, 응답과 상관 없이 다음 동작이 이루어지는 방식이다.

병렬적 태스크 수행

요청을 보낸 후, 응답을 기다리지 않고 다음 동작이 이루어짐 (non-blocking)

즉, 요청을 보내 놓고 다음 태스크로 진행

## 왜 비동기를 사용하는가?

#### 사용자 경험

데이터를 구동하고 실행되는 앱이 있으며, 이 데이터가 굉장히 크다고 가정하자. 이 때 동기식 코드라면 데이터를 모두 로드한 뒤에야 앱이 실행되기 때문에, 로드 되는 동안 우리는 앱을 사용할 수 없는 상태로 얼마나 걸릴지 모르는 로딩 시간을 기다려야 한다.

즉, 앱이 멈춘 것 처럼 보이게 된다. 이처럼 동기식 요청은 코드 실행을 차단하여 화면이 멈추고 응답하지 않는 사용자 경험을 만든다. 따라서 많은 웹 API기능은 현재 비동기 코드를 사용하여 실행된다.

**동기식 예시**

```html
<button>버튼</button>

<script>
	const btn = document.querySelector('button')

	btn.addEventListener('click', function () {
        alert('You clicked me!')
        const pElem = document.createElement('p')
        pElem.innerText = 'sample text'
        document.body.appendChild(pElem)
    })
</script>
```

위의 코드에서 버튼 클릭 후 alert 메세지의 확인버튼을 누를 때까지 문장이 만들어지지 않는다. 즉, alert 이후의 코드는 alert의 처리가 끝날 때까지 실행되지 않는다.

why? JS는 single threaded

**비동기식 예시**

```javascript
const request = new XMLHttpRequest()
const URL = 'https://jsonplaceholder.typicode.com/todos/1/'

request.open('GET', URL)
request.send()

const todo = request.response
console.log(todo)
```

요청을 보내고 응답을 기다리지 않고 다음 코드가 실행된다. 결과적으로 변수 todo에는 응답 데이터가 아직 오지 않은 상태로 빈 문자열이 출력된다.

왜 JS는 기다려주지 않는 방식으로 동작하는가? JS는 single threaded

**Blocking vs Non Blocking**

```python
# Blocking
import requests

response = requests.get('https://jsonplaceholder.typicode.com/todos/1')
todo = response.json()

print(todo)
```

```python
# 출력
{ 'userId':1, ...}
```



```javascript
// Non Blocking
const request = new XMLHttpRequest()
const URL = 'https://jsonplaceholder.typicode.com/todos/1/'

request.open('GET', URL)
request.send()

const todo = request.response
console.log(todo)
```

```javascript
// 출력

```

같은 곳으로 보내고 응답을 받는 코드지만 blocking, non blocking 시점의 코드가 전혀 결과가 다르게 이루어진다.



**Thread**

프로그램이 작업을 완료하는데 사용할 수 있는 단일 프로세스

각 thread는 한번에 하나의 작업만 수행할 수 있도록 설계되어 있다. 따라서 다음 작업을 시작하려면 반드시 앞의 작업이 완료되어야 한다.

컴퓨터 CPU는 여러 코어를 갖고 있기 때문에 한번에 여러가지 일을 처리할 수 있고, JS는 1개의 코어만 가지고 있어서 한번에 1개의 일만 처리 가능하다.



**JavaScript는 single threaded 이다.**

컴퓨터가 여러개의 CPU를 가지고 있어도 main thread라 불리는 단일 스레드에서만 작업을 수행한다. 즉, 이벤트를 처리하는 **Call Stack**이 하나인 언어이다.

이 문제를 해결하기 위해서 JS는 즉시 처리하지 못하는 이벤트들을 **다른 곳 (Web API)**으로 보내서 처리하도록 하고, 처리된 이벤트들은 처리된 순서대로 **대기실 (Task queue)**에 줄을 세워놓고 Call Stack이 비면 **담당자 (Event Loop)**가 대기 줄에서 가장 오래 된 (제일 앞의) 이벤트를 Call Stack으로 보낸다.



**Concurrency model**

Event loop를 기반으로 하는 동시성 모델 (Concurrency model)

1. Call Stack

   요청이 들어올 때마다 해당 요청을 순차적으로 처리하는 Stack 형태의 자료 구조 (LIFO)

2. Web API (Browser API)

   JavaScript 엔진이 아닌 브라우저 영역에서 제공하는 API

   setTimeout(), DOM events 그리고 AJAX로 데이터를 가져오는 시간이 소요되는 일들을 처리

3. Task Queue (Event Queue, Message Queue)

   콜백 함수가 대기하는 Queue 형태의 자료구조 (FIFO)

   main thread가 끝난 후에 실행되어 후속 JavaScript 코드가 차단되는 것을 방지

4. Event Loop

   Call Stack이 비어 있는지 여부를 확인

   비어 있는 경우 Task Queue에서 실행 대기 중인 콜백이 있는지 확인

   Task Queue에 대기 중인 콜백이 있다면 가장 앞에 있는 콜백을 Call Stack으로 pushaaaaaaaa







## JavaScript async function



#### Promise





라운 1515 순서 본캐닉

볼담

반성문을영어로하면뭘까요

창술썽냐