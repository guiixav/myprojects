using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using CadastroAlunoV1.DAO;
using CadastroAlunoV1.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;

namespace CadastroAlunoV1.Controllers
{
    public class AlunoController : PadraoController<AlunoViewModel>
    {
        public AlunoController()
        {
            GeraProximoId = true;
            DAO = new AlunoDAO();
        }

        protected override void PreencheDadosParaView(string Operacao, AlunoViewModel model)
        {
            if (Operacao == "I")
                model.DataNascimento = DateTime.Now;
            PreparaListaCidadesParaCombo();
            base.PreencheDadosParaView(Operacao, model);
        }
        private void PreparaListaCidadesParaCombo()
        {
            CidadeDAO cidadeDao = new CidadeDAO();
            var cidades = cidadeDao.Listagem();
            List<SelectListItem> listaCidades = new List<SelectListItem>();
            listaCidades.Add(new SelectListItem("Selecione uma cidade...", "0"));
            foreach (var cidade in cidades)
            {
                SelectListItem item = new SelectListItem(cidade.Nome, cidade.Id.ToString());
                listaCidades.Add(item);
            }
            ViewBag.Cidades = listaCidades;
        }

        protected override void ValidaDados(AlunoViewModel model, string operacao)
        {
            base.ValidaDados(model, operacao);
            if (string.IsNullOrEmpty(model.Nome))
                ModelState.AddModelError("Nome", "Preencha o nome.");
            if (model.Mensalidade < 0)
                ModelState.AddModelError("Mensalidade", "Campo obrigatório.");
            if (model.CidadeId <= 0)
                ModelState.AddModelError("CidadeId", "Informe o código da cidade.");
            if (model.DataNascimento > DateTime.Now)
                ModelState.AddModelError("DataNascimento", "Data inválida!");
        }
    }
}