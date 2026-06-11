<div align="center">

<img src="assets/eng-cia-logo.png" alt="Brasão Engenharia da Computação com IA — UNI-CET" width="180"/>

<img src="assets/unicet_color.png" alt="Logo UNI-CET" width="120"/>

**CENTRO UNIVERSITÁRIO TECNOLÓGICO DE TERESINA — UNI-CET**

**Curso de Bacharelado em Engenharia de Computação com IA**

| | |
|---|---|
| **Disciplina** | Programação Orientada a Objetos — POO |
| **Ministrante** | Prof. Eng. Esp. Lucas Mateus de Lima Neris |
| **Aluno** | Rafael Sampaio Oliveira |
| **Matrícula** | 241560003 |

</div>

---

# Sistema de Gestão de ONG — Desafio POO Java

Projeto desenvolvido como atividade prática da disciplina de **Programação Orientada a Objetos** em Java, simulando o sistema de gestão de membros de uma ONG.

O projeto demonstra os conceitos de **Herança**, **Polimorfismo** (sobrescrita de método), **Encapsulamento** (com regra de negócio no setter) e **Composição** (relação TEM-UM).

![versão](https://img.shields.io/badge/vers%C3%A3o-1.0.0-blue) ![status](https://img.shields.io/badge/status-Conclu%C3%ADdo-brightgreen) ![linguagem](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white) ![disciplina](https://img.shields.io/badge/disciplina-POO-9b59b6) ![tipo](https://img.shields.io/badge/tipo-Atividade%20Acad%C3%AAmica-lightgrey)

## 📂 Estrutura do Projeto

```
poo-desafio-ong/
├── MembroONG.java       → Superclasse com encapsulamento
├── Voluntario.java      → Herança + @Override
├── Doador.java          → Herança + @Override
├── ProjetoSocial.java   → Composição (TEM-UM Voluntario)
└── SistemaMain.java     → Classe de teste principal
```

## 🧱 Pilares da POO aplicados

| Pilar | Onde foi aplicado |
|---|---|
| **Encapsulamento** | Atributos `private` com getters/setters em `MembroONG`; o setter `setDiasAtuacao` rejeita valores negativos (regra de negócio) |
| **Herança** | `Voluntario` e `Doador` estendem `MembroONG` |
| **Polimorfismo** | `exibirResumo()` sobrescrito com `@Override` em `Voluntario` e `Doador` |
| **Composição** | `ProjetoSocial` possui um atributo `lider` do tipo `Voluntario` (relação TEM-UM) |

## ✅ Checklist de Especificações

### 1. MembroONG — Superclasse

| Requisito | Status |
|---|---|
| Atributos `private`: `nome`, `cpf`, `diasAtuacao` | ✅ |
| Getters e Setters para todos os atributos | ✅ |
| `setDiasAtuacao` rejeita valores negativos | ✅ |
| Método `exibirResumo()` com nome e dias | ✅ |

### 2. Voluntario e Doador — Herança

| Requisito | Status |
|---|---|
| `Voluntario extends MembroONG` | ✅ |
| Atributo `setor` (String) com getter/setter | ✅ |
| `@Override exibirResumo()` incluindo setor | ✅ |
| `Doador extends MembroONG` | ✅ |
| Atributo `valorDoadoMensal` (double) com getter/setter | ✅ |
| `@Override exibirResumo()` com "Doador Ativo" e valor formatado | ✅ |

### 3. ProjetoSocial — Composição

| Requisito | Status |
|---|---|
| Atributos `nomeDoProjeto` (String) e `metaImpacto` (int) | ✅ |
| Atributo `lider` do tipo `Voluntario` (TEM-UM) | ✅ |
| `iniciarProjeto()` imprimindo projeto, líder e setor | ✅ |

### 4. SistemaMain — Classe de teste

| Requisito | Status |
|---|---|
| Instancia `Voluntario` e preenche via setters | ✅ |
| Instancia `Doador` e preenche via setters | ✅ |
| Instancia `ProjetoSocial` e atribui voluntário como líder | ✅ |
| Chama `exibirResumo()` de ambos e `iniciarProjeto()` | ✅ |

## ▶️ Como executar

1. Clone o repositório
2. Abra a pasta no VS Code (com a extensão Java instalada)
3. Execute a classe `SistemaMain.java`

Ou via terminal:

```bash
cd poo-desafio-ong
javac *.java
java SistemaMain
```
