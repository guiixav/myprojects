using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using CadastroAlunoV1.DAO;
using CadastroAlunoV1.Models;
using Microsoft.AspNetCore.Mvc;


namespace CadastroAlunoV1.Controllers
{
    public class CidadeController : PadraoController<CidadeViewModel>
    {
        public CidadeController()
        {
            DAO = new CidadeDAO();
            GeraProximoId = true;
        }
        protected override void ValidaDados(CidadeViewModel model, string operacao)
        {
            base.ValidaDados(model, operacao);
            if (string.IsNullOrEmpty(model.Nome))
                ModelState.AddModelError("Nome", "Preencha o nome.");
        }
    }
}