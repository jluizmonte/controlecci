package com.controlecci.util;

public class TemplateAlerts {

    /**
     * mensagem de sucesso ao excluir um dado
     *
     * @param nometela
     * @return
     */
    public String mensagemExclusao(String nometela) {
        return nometela + " excluído com sucesso!";
    }

    /**
     * mensagem padrão de sucesso ao cadastrar um dado
     *
     * @param nomeTela
     * @return
     */
    public String mensagemCadastro(String nomeTela) {
        return nomeTela + " cadastrado com sucesso!";
    }

    /**
     * mensagem de erro ao cadastrar algum dado
     *
     * @param nomeTela
     * @return
     */
    public String erroCadastro(String nomeTela) {
        return "Erro ao cadastrar o " + nomeTela;
    }

    /**
     * mensagem de pergunta padrão para exclusão de algum dado
     *
     * @param nomeTela
     * @return
     */
    public String perguntaExclusao(String nomeTela) {
        return "Deseja excluir o " + nomeTela + " ?";
    }

    /**
     * mensagem padrão de erro ao excluir algum dado
     *
     * @param nomeTela
     * @return
     */
    public String erroGeralExclusao(String nomeTela) {
        return "Erro ao excluir o " + nomeTela;
    }

    /**
     * mensagem padrão para erro ao buscar dados
     *
     * @param nomeTela
     * @return
     */
    public String erroBuscarDados(String nomeTela) {
        return "Erro ao buscar " + nomeTela;
    }

    /**
     * retorna mensagem de erro padrão para alteração de dados
     *
     * @param nomeTela
     * @return
     */
    public String erroAlterar(String nomeTela) {
        return "Erro ao alterar o " + nomeTela;
    }

    /**
     * mensagem padrão de sucesso para alteração de algum dado
     *
     * @param nomeTela
     * @return
     */
    public String mensagemAlterar(String nomeTela) {
        return nomeTela + " alterado com sucesso!";
    }

    /**
     * retorna mensagem de erro padrão para o dev ser informado
     *
     * @return
     */
    public String erroGeral() {
        return "Informe o ocorrido ao desenvolvedor";
    }

    /**
     * retorna pergunta se o usuário quer salvar outro dado
     *
     * @param nomeTela
     * @return
     */
    public String perguntaSalvar(String nomeTela) {
        return "Deseja salvar outro " + nomeTela;
    }

    /**
     * retorna mensagem padrão para perguntar se o usuário quer encerrar o
     * sistema
     *
     * @return
     */
    public String mensagemSair() {
        return "O sistema será encerrado!";
    }

    /**
     * retorna mensagem padrão para encerrar o sistema (pergunta)
     *
     * @return
     */
    public String perguntaSair() {
        return "Deseja sair do sistema?";
    }

    /**
     * retorna mensagem padrão para erros de login
     *
     * @return
     */
    public String erroLogin() {
        return "Usuário ou senha inválidos!";
    }

    /**
     * mensagem de erro, pedindo para revisar os dados
     *
     * @return
     */
    public String mensagemPadraoErro() {
        return "Revise e tente novamente";
    }

    /**
     * retorna mensagem de erro para os campos estarem em branco numa consulta
     *
     * @return
     */
    public String erroCamposEmBranco() {
        return "Há campos em branco";
    }
}
