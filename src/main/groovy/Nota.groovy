
class Nota {
    Integer itens
    Double valor

    Nota plus(Nota nota) {
        Nota novo = new Nota()
        novo.itens = + this.itens + nota.itens
        novo.valor = + this.valor + nota.valor
        novo
    }
    Nota next() {
        this.itens += 1
        this.valor *=2
        this
    }
}
