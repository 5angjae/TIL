using AutoMapper;
using EFCore_TEST.Dtos;
using EFCore_TEST.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EFCore_TEST.Mappers
{
    public class Mapper : Profile
    {
        public Mapper() {
            CreateMap<Grade, GradeDto>();
            CreateMap<Student, StudentBaseDto>();
        }

        
    }
}
