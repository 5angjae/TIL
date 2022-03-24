using EFCore_TEST.Dtos;
using EFCore_TEST.Models;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EFCore_TEST.Repositories
{
    public interface IGradeRepository
    {
        Task<IEnumerable<Grade>> Get();
        Task<IEnumerable<Student>> Get(int id);
        void Add(Grade grade);
        Task Update(Grade grade);
        Task Delete(int id);
        Grade GetSingleGrade(int id);
        List<Student> GetGradesStudent(int id);


    }
}
