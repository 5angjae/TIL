﻿using AutoMapper;
using EFCore_TEST.Data;
using EFCore_TEST.Dtos;
using EFCore_TEST.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EFCore_TEST.Repositories
{
    public class GradeRepository : IGradeRepository
    {
        private readonly EFContext _context;
        private readonly IMapper _mapper;

        public GradeRepository(EFContext context)
        {
            _context = context;
        }
        public void Add(Grade grade)
        {
            _context.Grades.Add(grade);
            _context.SaveChanges();
        }

        public async Task Delete(int id)
        {
            var gradeToDelete = await _context.Grades.FindAsync(id);
            _context.Grades.Remove(gradeToDelete);
            await _context.SaveChangesAsync();
        }

        public async Task<IEnumerable<Grade>> Get()
        {
            return await _context.Grades.ToListAsync();
        }

        public async Task<IEnumerable<Student>> Get(int id)
        {
            return await _context.Students.Where(b => b.CurrentGradeId == id).ToListAsync();
        }

        public async Task Update(Grade grade)
        {
            _context.Entry(grade).State = EntityState.Modified;
            await _context.SaveChangesAsync();
        }

        public Grade GetSingleGrade(int id)
        {
            return _context.Grades.FirstOrDefault(x => x.GradeId == id);
        }

        public List<Student> GetGradesStudent(int id)
        {
            return _context.Students.Where(x => x.CurrentGradeId == id).ToList();
        }

    }
}
