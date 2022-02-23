# example

> 유튜브 예제를 통한 연습
>
> https://youtu.be/Br8H-TuSSO8

## MySQL DB 생성

> Department table / Employee table
>
> 1 : n 관계



## Startup.cs 파일 수정

### Enable CORS

이번 프로젝트에서는 배포를 안할 거라 CORS는 필요 없을 것으로 보임. 하지만 만약을 위해서 코드는 적어둘 것.

```c#
public void ConfigureServices(IServiceCollection services)
{
    // Enable CORS
    services.AddCors(c =>
                     {
                         c.AddPolicy("AllowOrigin", options => options.AllowAnyOrigin().AllowAnyMethod().AllowAnyHeader());
                     });
}
```

### JSON Serializer

**직렬화**

객체를 저장하거나 메모리, 데이터베이스 혹은 파일로 옮기기 위해 필요한 것.

객체를 바이트 스트림으로 바꾸는 것, 즉 객체에 저장된 데이터를 스트림에 쓰기 위해 연속적인 serial 데이터로 변환하는 것.



```c#
// Microsoft.AspNetCore.Mvc.NewtonsoftJson : NuGet 패키지 설치 (버전 체크 해야할 듯)
using Newtonsoft.Json.Serialization;

...
    
	public void ConfigureServices(IServiceCollection services)
	{
    	// JSON Serializer
    	services.AddControllersWithViews().AddNewtonsoftJson(options =>
        options.SerializerSettings.ReferenceLoopHandling = Newtonsoft.Json.ReferenceLoopHandling.Ignore)
        	.AddNewtonsoftJson(options => options.SerializerSettings.ContractResolver
                               = new DefaultContractResolver());
	}
```

3.1 버전에서만 사용하는가 했는데, 검색해보니 5.0에서도 json serializer를 적용하려면 해당 NuGet 패키지를 사용하라는 글이 있었음.

> https://qawithexperts.com/questions/499/how-can-i-set-json-serializer-in-aspnet-core-net-5



## Models 폴더 만들고 각 cs 파일(추가 - 클래스 - model) 생성

### Department

```c#
using System;

namespace WebApplication1.Models
{
	public class Department
    {
        public int DepartmentId { get; set; }
        public string DepartmentName { get; set; }
    }
}
```

### Employee

```c#
namespace WebApplication1.Models
{
	public class Employee
    {
        public int EmployeeId { get; set; }
        public string EmployeeName { get; set; }
        public string Department { get; set; }
        public string DateOfJoining { get; set; }
        public string PhotoFileName { get; set; }
    }
}
```

왜 따로 연결 안하지????



http://daplus.net/c-%EB%A7%8E%EC%9D%80-%EC%9D%BC%EB%8C%80-%EB%8B%A4-%EA%B4%80%EA%B3%84%EC%97%90%EC%84%9C-ienumerable-%EB%98%90%EB%8A%94-list-t%EA%B0%80-%EC%95%84%EB%8B%8C-icollection%EC%9D%84-%EC%82%AC/



https://www.entityframeworktutorial.net/code-first/configure-one-to-many-relationship-in-code-first.aspx

 

 https://dev.mysql.com/doc/connector-net/en/connector-net-entityframework-core-example.html

1ine







## 참고자료

GET POST 차이

https://prinha.tistory.com/entry/HTMLWEB-HTTP-Method-GET-POST%EC%9D%98-%EC%B0%A8%EC%9D%B4

