using CadastroAlunoV1.Models;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;

namespace CadastroAlunoV1.DAO
{
    public class AlunoDAO : PadraoDAO<AlunoViewModel>
    {
        protected override SqlParameter[] CriaParametros(AlunoViewModel model)
        {
            SqlParameter[] parametros = new SqlParameter[5];
            parametros[0] = new SqlParameter("id", model.Id);
            parametros[1] = new SqlParameter("nome", model.Nome);
            parametros[2] = new SqlParameter("mensalidade", model.Mensalidade);
            parametros[3] = new SqlParameter("cidadeId", model.CidadeId);
            parametros[4] = new SqlParameter("dataNascimento", model.DataNascimento);

            return parametros;
        }

        protected override AlunoViewModel MontaModel(DataRow registro)
        {
            AlunoViewModel a = new AlunoViewModel();
            a.Id = Convert.ToInt32(registro["id"]);
            a.Nome = registro["nome"].ToString();
            a.CidadeId = Convert.ToInt32(registro["cidadeId"]);
            a.DataNascimento = Convert.ToDateTime(registro["dataNascimento"]);
            a.Mensalidade = Convert.ToDouble(registro["mensalidade"]);
            return a;
        }

        protected override void SetTabela()
        {
            Tabela = "Alunos";
        }
    }
}


