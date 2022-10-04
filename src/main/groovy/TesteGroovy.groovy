import org.junit.Test
import org.junit.experimental.theories.suppliers.TestedOn

class TesteGroovy {

    @Test
    void exercicio1() {
        int a = 10
        println a.class
        println a.toString()
        println 12l.class.name

        println 11g.class.name

        BigDecimal value = 200.50
        println value
    }

    @Test
    void exercicio2() {
        Cliente c = new Cliente()
        c.setNome "Jos"
        c.setData new Date()
        println c.somar(10, 10)
        println c.getNome() + " - " + c.getData()
    }

    @Test
    void exercicio3() {
        Cliente c = new Cliente()
        println c.getNome() + " - " + c.getData()

        c = new Cliente(nome: "Jose Ricardo")
        println c.getNome() + " - " + c.getData()

        c = new Cliente(data: new Date())
        println c.getNome() + " - " + c.getData()

        c = new Cliente(nome: "Jose Ricardo", data: new Date())
        println c.getNome() + " - " + c.getNome()
    }

    @Test
    void exercicio4() {
        Cliente c = new Cliente(nome: "Jose Ricardo", data: new Date())
        println c.getNome()
        println c.getData()
        println c["nome"]
        println c["data"]

        c["nome"] = "Jubinelson"
        println c["nome"]
    }

    @Test
    void exercicio5() {
        Produto p = new Produto("CD", 8.00)
        println p.nome
        println p.nome = "Calypso"
        p.valor = 16.00
        println p.nome + " - " + p.valor
    }

    @Test
    void exercicio6() {
        Venda v = new Venda()
        println v.vender(100)
        println v.vender(100, 15)
    }

    @Test
    void exercicio7() {
        Somar soma = new Somar()
        println soma.somar(10)
        println soma.somar(10, 10)
        println soma.somar(10, 10, 10)
    }

    @Test
    void exercicio8() {
        Cliente c = null
        c?.nome = "Jose Ricardo"
        println c?.getNome()

        Cliente c2 = new Cliente()
        c2?.nome = "Jose Ricardo"
        println c2?.getNome()
        println c2?.nome
    }

    @Test
    void exercicio9() {
        List<String> colecao = new ArrayList()
        colecao.add("jose ricardo")
        colecao.add(null)
        colecao.add("maria")
        colecao.add("otavio")
        println colecao

        colecao = colecao*.toUpperCase()
        println colecao

        colecao = colecao*.replace("A", "@")
        println colecao
    }

    @Test
    void exercicio10() {
        URL url = new URL("https://www.google.com.br/")
        println url
    }

    @Test
    void exercicio11() {
        Nota n1 = new Nota(itens: 2, valor: 20)
        Nota n2 = new Nota(itens: 2, valor: 20)
        Nota n3 = n1 + n2
        println n3.valor + " - " + n3.itens
        n1++
        println n1.valor + " - " + n1.itens
    }

    @Test
    void exercicio12() {
        BigDecimal v1 = 10
        println v1

        v1 = v1 + 1
        println v1
        v1++
        println v1
        println v1 - 5

        Date data = new Date()
        println data
        data++
        println data
        data--
        println data
    }

    @Test
    void exercicio13() {
        Funcionario f = new Funcionario(nome: "Jose", idade: 19, salario: 1621.00)
        println f
    }
    @Test
    void exercicio14() {
        Conexao.instance.valor = 10
        println Conexao.instance.valor
        Conexao con = Conexao.instance
        con.valor = 11
        println Conexao.instance.valor

        Conexao x = new Conexao()
    }
    @Test
    void exercicio15() {
        Comida comida = Comida.builder().fruta("marca").bebida("coca cola").doce("casadinho").build()
        println comida.fruta
        println comida.doce
        println comida.bebida
    }
    @Test
    void exercicio16() {
        def objeto = "texto"
        print objeto.getClass()

        objeto = 10
        println objeto.getClass()

        objeto = 10.00
        prinln objeto.getClass()
    }
    @Test
    void exercicio17() {
        def colecao = new ArrayList<String>()
        colecao.add("jos")
        colecao.add("mari")
        for (item in colecao) {
            println item
        }

    }

}
