# ASP.NET Core 정리



## NuGet 패키지

솔루션 탐색기에서 프로젝트 우클릭해서 NuGet 패키지 관리를 들어가면 패키지를 찾을 수 있다.

![NuGet패키지관리](./asset/NuGet패키지관리.PNG)

찾아보기 탭에서 필요한 패키지를 설치하면 "프로젝트 - 종속성 - 패키지" 내에 설치가 된 것을 확인할 수 있다.

![NuGet패키지](./asset/NuGet패키지.PNG)

이제 이 패키지를 가져와서 사용하게 될텐데 using 문을 사용해서 필요한 파일에서 사용하면 된다.



### MySql





## Properties / launchSettings.json

실행 시, 세팅에 대한 내용

어떤 프로필을 사용할지, 어떤 스키마를 가져올지?



## Controllers



## Models



## appsettings.json



## Program.cs

프로그램 시작 파일로서 Main() 메서드가 있다.



## Startup.cs

Web 서버의 다양한 옵션이나 Web Application에서 사용할 서비스 등을 옵션으로 지정하는 파일. 특히 Dependancy Injection을 위해 인터페이스와 클래스를 등록할 때 여기서 정의한다.