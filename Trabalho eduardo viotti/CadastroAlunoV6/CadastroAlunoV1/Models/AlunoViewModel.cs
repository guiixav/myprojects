using System;
using System.ComponentModel.DataAnnotations;

namespace CadastroAlunoV1.Models
{
    public class AlunoViewModel : PadraoViewModel
    {
        public string Nome { get; set; }
        public double Mensalidade { get; set; }
        public int CidadeId { get; set; }        
        public DateTime DataNascimento { get; set; }
    }       
}
