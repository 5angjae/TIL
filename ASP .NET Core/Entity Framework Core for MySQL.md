# Entity Framework Core for MySQL

> https://www.tektutorialshub.com/entity-framework-core/using-mysql-mariadb-in-entity-framework-core/

이번 튜토리얼에서 우리는 "어떻게 EF Core에 MySQL을 설치하고 사용하는지"에 대해서 실습할 예정.

.NET Core 콘솔 어플리케이션을 만들고, MySQL을 위한 EF Core를 설치

간단한 모델을 만들고 마이그레이션을 사용해서 데이터베이스를 만들 것이다.



 

## Console Project 만들기



## MySQL을 위한 EF Core 설치

두가지 provider가 있다.

> 1. Pomelo.EntityFrameworkCore.MySql
> 2. MySql.Data.EntityFrameworkCore

### Pomelo.EntityFrameworkCore.MySql

Pomelo Foundation에 의해 유지되는 오픈소스. 자주 업데이트 되고 버그가 적으며 MariaDB도 지원한다.

### MySql.Data.EntityFrameworkCore

MySQL 스스로 제공하는 드라이버. 업데이트가 느리고, 이슈가 많다.



Pomelo.EntityFrameworkCore.MySql

Microsoft.EntityFrameworkCore.Tools

설치





중간 과정을 다시 정리할 필요가 있음.

DB에 연결하는 것 까지는 성공







## 쿼리문 API 참조

> EF Core 로 API는 어떻게 달라지나 확인해볼 것

```c#
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Threading.Tasks;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class DepartmentController : ControllerBase
    {
        private readonly IConfiguration _configuration;
        public DepartmentController(IConfiguration configuration)
        {
            _configuration = configuration;
        }

        [HttpGet]
        public JsonResult Get()
        {
            string query = @"
                        select DepartmentId,DepartmentName from mytestdb.Department
            ";

            DataTable table = new DataTable();
            string sqlDataSource=_configuration.GetConnectionString("EmployeeAppCon");
            MySqlDataReader myReader;
            using(MySqlConnection mycon=new MySqlConnection(sqlDataSource))
            {
                mycon.Open();
                using (MySqlCommand myCommand = new MySqlCommand(query, mycon))
                {
                    myReader = myCommand.ExecuteReader();
                    table.Load(myReader);

                    myReader.Close();
                    mycon.Close();
                }
            }

            return new JsonResult(table);
        }

        [HttpPost]
        public JsonResult Post(Department dep)
        {
            string query = @"
                        insert into mytestdb.Department (DepartmentName) values (@DepartmentName);
            ";

            DataTable table = new DataTable();
            string sqlDataSource = _configuration.GetConnectionString("EmployeeAppCon");
            MySqlDataReader myReader;
            using (MySqlConnection mycon = new MySqlConnection(sqlDataSource))
            {
                mycon.Open();
                using (MySqlCommand myCommand = new MySqlCommand(query, mycon))
                {
                    myCommand.Parameters.AddWithValue("@DepartmentName", dep.DepartmentName);
                    myReader = myCommand.ExecuteReader();
                    table.Load(myReader);

                    myReader.Close();
                    mycon.Close();
                }
            }

            return new JsonResult("Added Successfully");
        }

        [HttpPut]
        public JsonResult Put(Department dep)
        {
            string query = @"
                        update mytestdb.Department set
                        DepartmentName = @DepartmentName
                        where DepartmentId = @DepartmentId;
            ";

            DataTable table = new DataTable();
            string sqlDataSource = _configuration.GetConnectionString("EmployeeAppCon");
            MySqlDataReader myReader;
            using (MySqlConnection mycon = new MySqlConnection(sqlDataSource))
            {
                mycon.Open();
                using (MySqlCommand myCommand = new MySqlCommand(query, mycon))
                {
                    myCommand.Parameters.AddWithValue("@DepartmentId", dep.DepartmentId);
                    myCommand.Parameters.AddWithValue("@DepartmentName", dep.DepartmentName);
                    myReader = myCommand.ExecuteReader();
                    table.Load(myReader);

                    myReader.Close();
                    mycon.Close();
                }
            }

            return new JsonResult("Updated Successfully");
        }

        [HttpDelete("{id}")]
        public JsonResult Delete(int id)
        {
            string query = @"
                        delete from mytestdb.Department
                        where DepartmentId = @DepartmentId;
            ";

            DataTable table = new DataTable();
            string sqlDataSource = _configuration.GetConnectionString("EmployeeAppCon");
            MySqlDataReader myReader;
            using (MySqlConnection mycon = new MySqlConnection(sqlDataSource))
            {
                mycon.Open();
                using (MySqlCommand myCommand = new MySqlCommand(query, mycon))
                {
                    myCommand.Parameters.AddWithValue("@DepartmentId", id);
                    myReader = myCommand.ExecuteReader();
                    table.Load(myReader);

                    myReader.Close();
                    mycon.Close();
                }
            }

            return new JsonResult("Deleted Successfully");
        }
    }
}

```

