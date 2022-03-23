﻿using oneline.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace oneline.Repositories
{
    public interface IUserRepository
    {
        Task Login(User user);
        Task Join(User user);
        Boolean DupCheck(string userid); // 유저 아이디 중복검사
        User GetUserInfo(string userid); // 유저 정보 가져오기

    }
}
