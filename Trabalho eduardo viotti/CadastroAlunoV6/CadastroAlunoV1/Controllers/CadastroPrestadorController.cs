﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace CadastroAlunoV1.Controllers
{
    public class CadastroPrestadorController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}