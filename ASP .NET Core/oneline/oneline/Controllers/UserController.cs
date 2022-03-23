using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using oneline.Models;
using oneline.Repositories;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace oneline.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class UserController : ControllerBase
    {
        private readonly IUserRepository _userRepository;
        public UserController(IUserRepository userRepository)
        {
            _userRepository = userRepository;
        }

        [HttpPost]
        public async Task Signup([FromBody] User user)
        {
            if (user == null)
            {
            }
            _userRepository.Join(user);
            
        }
    }
}
