# Bônus: Ampliação do Desafio POO

> ⚠️ **Eu avisei que não era pra abrir.**
> Mas já que a curiosidade falou mais alto — bem-vindo ao bônus.

Esta pasta é uma extensão **voluntária e não solicitada** da entrega principal.
Após cumprir todos os requisitos obrigatórios, explorei dois conceitos
adicionais que aprofundam a aplicação dos pilares da POO.

![conteúdo](https://img.shields.io/badge/conte%C3%BAdo-B%C3%B4nus-FFD700?labelColor=555555) ![Java](https://img.shields.io/badge/Java-abstract%20%2B%20ArrayList-orange?logo=openjdk&logoColor=white) ![nível](https://img.shields.io/badge/n%C3%ADvel-Avan%C3%A7ado-red)

---

## O que foi adicionado

### 1. Classe Abstrata (`abstract`)

Na entrega principal, `MembroONG` é uma classe concreta — ela pode ser
instanciada diretamente com `new MembroONG()`. Porém, isso não faz sentido
semanticamente: **toda pessoa da ONG é ou voluntária ou doadora**, nunca um
"membro genérico".

Nesta versão, `MembroONG` foi declarada como `abstract`, e o método
`exibirResumo()` também. Isso traz dois benefícios concretos:

- O compilador **impede** a criação de instâncias diretas de `MembroONG`.
- Cada subclasse é **obrigada** a implementar `exibirResumo()` — o contrato
  é garantido em tempo de compilação, não de execução.

```java
// Antes (entrega principal)
public class MembroONG { ... }

// Agora (bônus)
public abstract class MembroONG {
    public abstract void exibirResumo(); // contrato obrigatório
}
```

---

### 2. Polimorfismo dinâmico com `ArrayList<MembroONG>`

Na entrega principal, `exibirResumo()` é chamado individualmente em cada
objeto. O bônus demonstra o **verdadeiro poder do polimorfismo**: uma única
lista do tipo `ArrayList<MembroONG>` pode conter tanto `Voluntario` quanto
`Doador`, e ao iterar sobre ela, o Java decide **em tempo de execução** qual
versão do método chamar — sem nenhum `if` ou `instanceof`.

```java
ArrayList<MembroONG> membros = new ArrayList<>();
membros.add(voluntario); // Voluntario
membros.add(doador);     // Doador

for (MembroONG membro : membros) {
    membro.exibirResumo(); // cada um responde do seu jeito
}
```

Esse padrão é chamado de **late binding** (ligação tardia) e é o mecanismo
central do polimorfismo em Java.

---

## 📂 Estrutura desta pasta

```
Bonus Opcional/
├── MembroONG.java       → Superclasse abstrata
├── Voluntario.java      → Herança + @Override (igual à entrega principal)
├── Doador.java          → Herança + @Override (igual à entrega principal)
├── ProjetoSocial.java   → Composição (igual à entrega principal)
└── SistemaMain.java     → Demonstração do ArrayList + polimorfismo dinâmico
```

---

## ▶️ Como executar

```bash
cd "Bonus Opcional"
javac *.java
java SistemaMain
```
