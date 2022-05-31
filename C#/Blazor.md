# Blazor



## 주요 구성 요소

Model : validation logic (검증 로직) 과 함께 데이터 모델을 포함하는 애플리케이션 도메인 모델의 구현. 모델은 애플리케이션의 데이터를 처리하는 역할을 한다.

View : The view matches with the user interface and its code-behind. 블레이저에서는 Razor 컴포넌트에 해당

ViewModel : 뷰가 쉽게 사용할 수 있는 방식으로 모델의 데이터를 제공한다.

Binder : 바인더를 사용하면 viewmodel과 view가 지속적으로 동기화 된다. 즉, view를 통해 사용자가 변경한 데이터는 개발자가 걱정할 필요 없이 자동으로 모델에 반영된다. 마찬가지로 뷰모델의 데이터에 대한 모든 변경 사항은 view에서 자동으로 표시된다.





Blazor 페이지 및 컴포넌트의 view는 injection and binding을 통해 viewmodel에 연결되어야 한다. model에서 ui의 값을 업데이트 하려면 viewmodel에서 something을 구현해야하는데, 이 something이 `INotifyPropertyChanged` 인터페이스이다.





POCO - Plain Old CLR Objects



