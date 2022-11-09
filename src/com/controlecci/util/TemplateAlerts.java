package com.controlecci.util;

public class TemplateAlerts {

    public String mensagemExclusao(String nometela) {
        return nometela + " excluído(a) com sucesso!";
    }

    public String mensagemCadastro(String nomeTela) {
        return nomeTela + " cadastrado(a) com sucesso!";
    }

    public String erroCadastro(String nomeTela) {
        return "Erro ao cadastrar o(a) " + nomeTela;
    }

    public String perguntaExclusao(String nomeTela) {
        return "Deseja excluir o(a) " + nomeTela + " ?";
    }

    public String erroExclusao(String nomeTela) {
        return "O(A) " + nomeTela + " não foi excluído(a)";
    }

    public String erroGeralExclusao(String nomeTela) {
        return "Erro ao excluir o(a) " + nomeTela;
    }

    public String erroBuscarDados(String nomeTela) {
        return "Erro ao buscar " + nomeTela;
    }

    public String erroAlterar(String nomeTela) {
        return "Erro ao alterar o(a) " + nomeTela;
    }

    public String erroLogar() {
        return "ERRO AO EFETURAR O LOGIN, USUÁRIO OU SENHA INCORRETA!";
    }

    public String erroCamposEmBranco() {
        return "UM OU MAIS CAMPOS ESTÃO EM BRANCO, REVISE E TENTE NOVAMENTE";
    }

    /**
     * mensagem para o log quando o usuário não estiver logado no sistema
     *
     * @return
     */
    public String erroUsuarioLogado() {
        return "USUÁRIO NÃO LOGADO";
    }

    public String mensagemAlterar(String nomeTela) {
        return nomeTela + " alterado(a) com sucesso!";
    }

    public String mensagemGeral() {
        return "Informe o ocorrido ao desenvolvedor";
    }

    public String erroCodigoInvalido() {
        return "Código inválido";
    }

    public String erroItemSelecionado(String nomeTela) {
        return "Ou nenhum(a) " + nomeTela + " selecionado(a)";
    }

    public String mensagemQuantidadeItem() {
        return "Insira a quantidade";
    }

    public String perguntaSalvar(String nomeTela) {
        return "Deseja salvar outro(a) " + nomeTela;
    }

    public String mensagemSair() {
        return "O sistema será encerrado!";
    }

    public String perguntaSair() {
        return "Deseja sair?";
    }

    public String mensagemRegistroComum() {
        return "REGISTRO COMUM";
    }

    public String mensagemRegsitroErro() {
        return "REGISTRO DE ERRO";
    }
}
