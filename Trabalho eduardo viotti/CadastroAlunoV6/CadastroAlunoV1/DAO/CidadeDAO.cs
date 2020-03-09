using CadastroAlunoV1.Models;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Threading.Tasks;

namespace CadastroAlunoV1.DAO
{
    public class CidadeDAO : PadraoDAO<CidadeViewModel>
    {
        protected override SqlParameter[] CriaParametros(CidadeViewModel model)
        {
            SqlParameter[] parametros =
            {
              new SqlParameter("id", model.Id),
              new SqlParameter("nome", model.Nome)
            };
            return parametros;
        }
        protected override CidadeViewModel MontaModel(DataRow registro)
        {
            CidadeViewModel c = new CidadeViewModel()
            {
                Id = Convert.ToInt32(registro["id"]),
                Nome = registro["nome"].ToString()
            };
            return c;
        }
        protected override void SetTabela()
        {
            Tabela = "Cidades";
        }
    }
}
