# Gestão de Lançamentos - Compose

Esta é uma aplicação Android desenvolvida com **Jetpack Compose** e **Kotlin**, desenhada para a gestão e registo de lançamentos. O projeto foi desenvolvido como trabalho prático final no âmbito da Especialização em Programação de Dispositivos Móveis (UTFPR).

## 📱 Funcionalidades

* **Listagem de Lançamentos**: Visualização organizada de todos os registos numa interface limpa e responsiva.
* **Formulário de Registo**: Criação de novos lançamentos com validação de dados, integrando componentes interativos nativos do Compose (campos de texto, seletores de data, botões de rádio e caixas de verificação).
* **Feedback Visual**: Tratamento de estados da aplicação com ecrãs dedicados para carregamento (`Carregando.kt`) e indicação de erros (`ErroCarregar.kt`).
* **Arquitetura Robusta**: Separação clara entre a lógica de apresentação e a gestão de dados.

## 🛠️ Tecnologias e Arquitetura

* **Linguagem**: Kotlin
* **Interface de Utilizador (UI)**: Jetpack Compose
* **Arquitetura**: MVVM (Model-View-ViewModel), garantindo um fluxo de dados unidirecional e a reatividade da interface através de _States_ e _ViewModels_.
* **Padrões de Conceção**: Utilização de _Observers_ para a monitorização de alterações nos dados.
* **Ferramentas**: Android Studio e Gradle.

## 📂 Estrutura do Projeto

O código-fonte está estruturado de forma modular para facilitar a escalabilidade e a manutenção:

* `data/`: Contém as classes de modelo (`Lancamento.kt`), enumerações (`TipoLancamentoEnum.kt`) e a lógica de acesso e observação dos dados (`LancamentoDatasource.kt`, `LancamentoObserver.kt`).
* `ui/`: Engloba toda a camada de apresentação visual.
  * `lancamento/form/`: Contém o ecrã de formulário (`FormularioLancamentoScreen.kt`), o respetivo estado, ViewModel e componentes reutilizáveis específicos de formulário (`FormDatePicker`, `FormTextField`, etc.).
  * `lancamento/lista/`: Contém o ecrã de listagem (`ListaLancamentosScreen.kt`), com o seu próprio estado e ViewModel.
  * `shared/composables/`: Componentes partilhados por toda a aplicação.
  * `theme/`: Configurações globais de design do Jetpack Compose (cores, tipografia e temas).

## 🚀 Como Executar

1. Clone o repositório para a sua máquina local.
2. Abra o projeto utilizando o **Android Studio** (recomenda-se a versão mais recente com suporte atualizado ao Compose).
3. Aguarde que o _Gradle_ sincronize as dependências.
4. Execute o projeto num emulador ou num dispositivo físico com Android.

## 👨‍💻 Autor

**Marcelo Zanguettin Pereira**
