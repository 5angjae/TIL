using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace efcore_test.Models
{
    public class TodoContext:DbContext
    {
        public DbSet<Todo> Todo { get; set; }
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySql(@"Server=localhost;Database=ef;Port:3306;User=root;Password=Tkdwo1229!mrp");
        }
    }

    public class Todo
    {
        public int id { get; set; }
        public string status { get; set; }
        public string context { get; set; }
        public string DoneAt { get; set; }
    }
}
