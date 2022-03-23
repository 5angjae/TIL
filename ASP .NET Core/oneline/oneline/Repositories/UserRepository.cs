using oneline.Data;
using oneline.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace oneline.Repositories
{
    public class UserRepository : IUserRepository
    {
        private readonly OneLineContext _context;
        public UserRepository(OneLineContext context)
        {
            _context = context;
        }
        public bool DupCheck(string userid)
        {
            throw new NotImplementedException();
        }

        public User GetUserInfo(string userid)
        {
            throw new NotImplementedException();
        }

        public async Task Join(User user)
        {
            _context.Users.Add(user);
            await _context.SaveChangesAsync();
        }

        public Task Login(User user)
        {
            throw new NotImplementedException();
        }
    }
}
