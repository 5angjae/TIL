using EFCore_TEST.Data;
using EFCore_TEST.Models;
using EFCore_TEST.Repositories;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using MySqlConnector;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Dynamic;
using System.Linq;
using System.Threading.Tasks;

namespace EFCore_TEST.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class GradeController : ControllerBase
    {
        private readonly IGradeRepository _gradeRepository;

        public GradeController(IGradeRepository gradeRepository)
        {
            _gradeRepository = gradeRepository;
        }
        
        [HttpGet]
        public async Task<IEnumerable<Grade>> GetGrades()
        {
            return await _gradeRepository.Get();
        }
       
        
        /*
        public async Task<IEnumerable<Student>> GetGrades(int id)
        {
            return await _gradeRepository.Get(id);
        }
        */

        [HttpGet("{id}")]
        public ActionResult GetStudents(int id)
        {
            Grade grade = _gradeRepository.GetSingleGrade(id);

            if (grade == null)
            {
                return NotFound();
            }
            return Ok(SampleFunction(grade, id));
        }

        private dynamic SampleFunction(Grade grade, int id)
        {
            var students = _gradeRepository.GetGradesStudent(id);
            IDictionary<string, object> student_temp = new ExpandoObject();
            List<IDictionary<string, object>> students_list = new List<IDictionary<string, object>>();
            foreach(var student in students)
            {
                student_temp.Add("id", student.Id);
                student_temp.Add("name", student.Name);
                students_list.Add(student_temp);
                student_temp = new ExpandoObject();
            }


            IDictionary<string, object> expando = new ExpandoObject();

            foreach (PropertyDescriptor property in TypeDescriptor.GetProperties(grade.GetType()))
            {
                if(property.Name != "Students")
                {
                    expando.Add(property.Name, property.GetValue(grade));
                }
                
            }

            var returnToDict = expando;

            returnToDict.Add("students", students_list);

            return returnToDict;

        }
        /*
        private readonly EFContext _context;

        public GradeController(EFContext context)
        {
            _context = context;
        }
       

       
        [HttpGet]
        public IEnumerable<Grade> GetAll()
        {
            return _context.Grades.ToList();
        }

        [HttpPost]
        public IActionResult AddGrade([FromBody] Grade grade)
        {
            if (grade == null)
            {
                return BadRequest();
            }

            _context.Grades.Add(grade);
            _context.SaveChanges();
            Console.WriteLine(CreatedAtRoute("GetGrade", new { id = grade.GradeId }, grade));
            return CreatedAtRoute("GetGrade", new { id = grade.GradeId }, grade);
        }

        [HttpGet("{id}", Name = "GetGrade")]
        public IActionResult GetById(long id)
        {
            var item = _context.Grades.FirstOrDefault(t => t.GradeId == id);
            if (item == null)
            {
                return NotFound();
            }
            return new ObjectResult(item);
        }

        [HttpPut("{id}")]
        public IActionResult Update(long id, [FromBody] Grade grade)
        {
            if (grade == null || grade.GradeName != _context.Grades.FirstOrDefault(t => t.GradeId == id).GradeName)
            {
                return BadRequest();
            }

            var item = _context.Grades.FirstOrDefault(t => t.GradeId == id);
            if (item == null)
            {
                return NotFound();
            }

            item.GradeName = grade.GradeName;
            item.Section = grade.Section;
            

            _context.Grades.Update(item);
            _context.SaveChanges();
            return new NoContentResult();
        }
        */




        /*
        private readonly IConfiguration _configuration;
        public GradeController(IConfiguration configuration)
        {
            _configuration = configuration;
        }
        [HttpGet]
        public ActionResult<IEnumerable<Grades>>


        [HttpGet]
        public JsonResult Get()
        {
            string query = @"
                        select GradeId, GradeName, Section from efcoremysql.grades
            ";

            DataTable table = new DataTable();
            string sqlDataSource = _configuration.GetConnectionString("Default");
            MySqlDataReader myReader;
            using (MySqlConnection mycon = new MySqlConnection(sqlDataSource))
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
        public JsonResult Post(Grade grade)
        {
            string query = @"
                        insert into efcoremysql.grades (GradeId, GradeName, Section) values (@GradeId, @GradeName, @Section);
            ";

            DataTable table = new DataTable();
            string sqlDataSource = _configuration.GetConnectionString("Default");
            MySqlDataReader myReader;
            using (MySqlConnection mycon = new MySqlConnection(sqlDataSource))
            {
                mycon.Open();
                using (MySqlCommand myCommand = new MySqlCommand(query, mycon))
                {
                    myCommand.Parameters.AddWithValue("@GradeId", grade.GradeId);
                    myCommand.Parameters.AddWithValue("@GradeName", grade.GradeName);
                    myCommand.Parameters.AddWithValue("@Section", grade.Section);
                    myReader = myCommand.ExecuteReader();
                    table.Load(myReader);

                    myReader.Close();
                    mycon.Close();
                }
            }

            return new JsonResult("Added Successfully");
        }
        */
    }
}
