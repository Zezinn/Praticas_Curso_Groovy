
public class Cliente2 {
    private String nome
    private Date data

        public Cliente2(String p1) {
            nome = p1;
        }
        public Cliente2(Date p1) {
            data = p1
        }
        public Cliente2(String p1, Date p2) {
        data = p2
            nome = p1
        }
        public Integer somar(Integer v1, Integer v2) {
            return v1 + v2
        }
        public String getNome() {
            return nome
        }

        public void setNome(String nome) {
            this.nome = nome
        }

        public Date getData() {
            return data
        }

        public void setData(Date data) {
            this.data = data
        }
    }
