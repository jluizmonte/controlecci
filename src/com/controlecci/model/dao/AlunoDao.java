package com.controlecci.model.dao;

import com.controlecci.connection.ConnectionMySQL;
import com.controlecci.model.AlunoModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class AlunoDao extends ConnectionMySQL {

    /**
     * retorna os dados do aluno da tabela aluno_cadastro
     *
     * @param pAluno
     * @return
     */
    public AlunoModel getAluno(String pAluno) {
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT id_cadastro,matricula,nome,endereco,numero,complemento,cidade,cep,uf,bairro,celular,telefone,email,rg,cpf,DATE_FORMAT(data_nascimento, '%d-%m-%Y'),(select nome_curso where id_curso=curso_fk_cadastro),(select carga_horaria  where id_curso=curso_fk_cadastro),situacao,pendencia,data_matricula, situacao_certificado from aluno_cadastro join curso on id_curso = curso_fk_cadastro where nome ='" + pAluno + "';");

            while (this.getResultSet().next()) {
                alunoModel.setIdAluno(this.getResultSet().getInt(1));
                alunoModel.setMatricula(this.getResultSet().getInt(2));
                alunoModel.setNome(this.getResultSet().getString(3));
                alunoModel.setEndereco(this.getResultSet().getString(4));
                alunoModel.setNumero(this.getResultSet().getInt(5));
                alunoModel.setComplemento(this.getResultSet().getString(6));
                alunoModel.setCidade(this.getResultSet().getString(7));
                alunoModel.setCep(this.getResultSet().getString(8));
                alunoModel.setUf(this.getResultSet().getString(9));
                alunoModel.setBairro(this.getResultSet().getString(10));
                alunoModel.setCelular(this.getResultSet().getString(11));
                alunoModel.setTelefone(this.getResultSet().getString(12));
                alunoModel.setEmail(this.getResultSet().getString(13));
                alunoModel.setRg(this.getResultSet().getString(14));
                alunoModel.setCpf(this.getResultSet().getString(15));
                alunoModel.setDataNascimento(this.getResultSet().getString(16));
                alunoModel.setCurso(this.getResultSet().getString(17));
                alunoModel.setCargaHoraria(this.getResultSet().getString(18));
                alunoModel.setSituacao(this.getResultSet().getString(19));
                alunoModel.setPendencia(this.getResultSet().getString(20));
                alunoModel.setDataMatricula(this.getResultSet().getString(21));
                alunoModel.setSituacaoCertificado(this.getResultSet().getString(22));
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        } finally {
            this.fecharConexao();
        }
        return alunoModel;
    }

    public AlunoModel getAlunoCurso(String pAluno, int pMatricula) {
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT id_cadastro,matricula,nome,endereco,numero,complemento,cidade,cep,uf,bairro,celular,telefone,email,rg,cpf,DATE_FORMAT(data_nascimento, '%d-%m-%Y'),(select nome_curso where id_curso=curso_fk_cadastro),(select carga_horaria  where id_curso=curso_fk_cadastro),situacao,pendencia,data_matricula, situacao_certificado from aluno_cadastro join curso on id_curso = curso_fk_cadastro where nome ='" + pAluno + "' and matricula='" + pMatricula + "';");

            while (this.getResultSet().next()) {
                alunoModel.setIdAluno(this.getResultSet().getInt(1));
                alunoModel.setMatricula(this.getResultSet().getInt(2));
                alunoModel.setNome(this.getResultSet().getString(3));
                alunoModel.setEndereco(this.getResultSet().getString(4));
                alunoModel.setNumero(this.getResultSet().getInt(5));
                alunoModel.setComplemento(this.getResultSet().getString(6));
                alunoModel.setCidade(this.getResultSet().getString(7));
                alunoModel.setCep(this.getResultSet().getString(8));
                alunoModel.setUf(this.getResultSet().getString(9));
                alunoModel.setBairro(this.getResultSet().getString(10));
                alunoModel.setCelular(this.getResultSet().getString(11));
                alunoModel.setTelefone(this.getResultSet().getString(12));
                alunoModel.setEmail(this.getResultSet().getString(13));
                alunoModel.setRg(this.getResultSet().getString(14));
                alunoModel.setCpf(this.getResultSet().getString(15));
                alunoModel.setDataNascimento(this.getResultSet().getString(16));
                alunoModel.setCurso(this.getResultSet().getString(17));
                alunoModel.setCargaHoraria(this.getResultSet().getString(18));
                alunoModel.setSituacao(this.getResultSet().getString(19));
                alunoModel.setPendencia(this.getResultSet().getString(20));
                alunoModel.setDataMatricula(this.getResultSet().getString(21));
                alunoModel.setSituacaoCertificado(this.getResultSet().getString(22));
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        } finally {
            this.fecharConexao();
        }
        return alunoModel;
    }

    /**
     *
     * @return
     */
    public ArrayList retornaAlunos() {
        ArrayList lista = new ArrayList();

        try {
            this.conectar();
            this.executarSQL("SELECT nome FROM aluno_cadastro;");
            while (this.getResultSet().next()) {
                lista.add(this.getResultSet().getString(1));
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return lista;
    }

    /**
     *
     * @return
     */
    public ArrayList retornaAlunoCadastro() {
        ArrayList lista = new ArrayList();
        try {
            this.conectar();
            this.executarSQL("SELECT nome FROM aluno_cadastro;");
            while (this.getResultSet().next()) {
                lista.add(this.getResultSet().getString(1));
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return lista;
    }

    /**
     *
     * @return
     */
    public ArrayList<AlunoModel> getListaAlunoDao() {
        ArrayList<AlunoModel> listaAlunoModel = new ArrayList<>();
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM aluno_cadastro order by nome asc;");
            while (this.getResultSet().next()) {
                alunoModel = new AlunoModel();
                alunoModel.setIdAluno(this.getResultSet().getInt(1));
                alunoModel.setNome(this.getResultSet().getString(2));
                listaAlunoModel.add(alunoModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaAlunoModel;
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public ArrayList<AlunoModel> getListaPorAluno(String pAluno) {
        ArrayList<AlunoModel> listaAlunoModels = new ArrayList<>();
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT matricula,nome,nome_curso, situacao, carga_horaria from aluno_cadastro JOIN curso ON id_curso=curso_fk_cadastro WHERE nome='" + pAluno + "';");
            while (this.getResultSet().next()) {
                alunoModel = new AlunoModel();
                alunoModel.setMatricula(this.getResultSet().getInt(1));
                alunoModel.setNome(this.getResultSet().getString(2));
                alunoModel.setCurso(this.getResultSet().getString(3));
                alunoModel.setSituacao(this.getResultSet().getString(4));
                alunoModel.setCargaHoraria(this.getResultSet().getString(5));
                listaAlunoModels.add(alunoModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaAlunoModels;
    }

    /**
     * retorna nome curso e status
     *
     * @return
     */
    public ArrayList<AlunoModel> getListaAlunoCursoDao() {
        ArrayList<AlunoModel> listaModel = new ArrayList<>();
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT nome,nome_curso,situacao from aluno_cadastro join curso on curso_fk_cadastro=id_curso order by nome asc;");
            while (this.getResultSet().next()) {
                alunoModel = new AlunoModel();
                alunoModel.setNome(this.getResultSet().getString(1));
                alunoModel.setCurso(this.getResultSet().getString(2));
                alunoModel.setSituacao(this.getResultSet().getString(3));
                listaModel.add(alunoModel);
            }
        } catch (NumberFormatException | SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaModel;
    }

    /**
     *
     * @return
     */
    public ArrayList<AlunoModel> getListaStatusCertificado() {
        ArrayList<AlunoModel> listaModel = new ArrayList<>();
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT nome,(select nome_curso where id_curso=curso_fk_cadastro),situacao_certificado FROM aluno_cadastro JOIN curso ON id_curso=curso_fk_cadastro WHERE  situacao_certificado='N??O ENTREGUE' ORDER BY nome ASC;");
            while (this.getResultSet().next()) {
                alunoModel = new AlunoModel();
                alunoModel.setNome(this.getResultSet().getString(1));
                alunoModel.setCurso(this.getResultSet().getString(2));
                alunoModel.setSituacaoCertificado(this.getResultSet().getString(3));
                listaModel.add(alunoModel);
            }
        } catch (NumberFormatException | SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaModel;
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornarCursoPeloAluno(String pAluno) {
        try {
            this.conectar();
            this.executarSQL("select nome_curso from curso join aluno_cadastro on curso_fk_cadastro = id_curso where nome= '" + pAluno + "';");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornaStatusCertificado(String pAluno) {
        String status = "";
        try {
            this.conectar();
            this.executarSQL("SELECT situacao_certificado FROM aluno_cadastro WHERE nome='" + pAluno + "';");
            while (this.getResultSet().next()) {
                status = this.getResultSet().getString(1);
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return status;
    }

    /**
     * retorna status do certificado pelo nome e curso do aluno
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaStatusCertificadoAlunoCurso(String pAluno, String pCurso) {
        String status = "";
        try {
            this.conectar();
            this.executarSQL("SELECT situacao_certificado FROM aluno_cadastro join curso on id_curso=curso_fk_cadastro WHERE nome='" + pAluno + "' and nome_curso='" + pCurso + "';");
            while (this.getResultSet().next()) {
                status = this.getResultSet().getString(1);
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return status;
    }

    /**
     *
     * @return
     */
    public String retornaQtdeAluno() {
        String pQuantidade = "";
        try {
            this.conectar();
            this.executarSQL("select count(nome) from aluno_cadastro;");

            while (this.getResultSet().next()) {
                pQuantidade = this.getResultSet().getString(1);
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return pQuantidade;
    }

    /**
     *
     * @param alunoModel
     * @return
     */
    public boolean inserirAluno(AlunoModel alunoModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("INSERT INTO controle.aluno_cadastro (matricula, nome, endereco, numero, complemento, cidade, cep, uf, bairro, celular, telefone, email, rg, cpf, data_nascimento, curso_fk_cadastro, situacao, pendencia, data_matricula) VALUES(" + alunoModel.getMatricula() + ", '" + alunoModel.getNome() + "', '" + alunoModel.getEndereco() + "', " + alunoModel.getNumero() + ", '" + alunoModel.getComplemento() + "', '" + alunoModel.getCidade() + "', '" + alunoModel.getCep() + "', '" + alunoModel.getUf() + "', '" + alunoModel.getBairro() + "', '" + alunoModel.getCelular() + "', '" + alunoModel.getTelefone() + "', '" + alunoModel.getEmail() + "', '" + alunoModel.getRg() + "', '" + alunoModel.getCpf() + "', STR_TO_DATE('" + alunoModel.getDataNascimento() + "','%d-%m-%Y'), (select id_curso from curso where nome_curso='" + alunoModel.getCurso() + "'), '" + alunoModel.getSituacao() + "', '" + alunoModel.getPendencia() + "', '" + alunoModel.getDataMatricula() + "');");
        } catch (Exception e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     *
     * @param alunoModel
     * @param pAlunoPesquisa
     * @param pCurso
     * @return
     */
    public boolean atualizarAluno(AlunoModel alunoModel, String pAluno, String pCurso) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("UPDATE aluno_cadastro SET "
                    + "matricula=" + alunoModel.getMatricula()
                    + ",nome='" + alunoModel.getNome()
                    + "',endereco='" + alunoModel.getEndereco()
                    + "',numero=" + alunoModel.getNumero()
                    + ",complemento='" + alunoModel.getComplemento()
                    + "',cidade='" + alunoModel.getCidade()
                    + "',cep='" + alunoModel.getCep()
                    + "',uf='" + alunoModel.getUf()
                    + "',bairro='" + alunoModel.getBairro()
                    + "',celular='" + alunoModel.getCelular()
                    + "',telefone='" + alunoModel.getTelefone()
                    + "',email='" + alunoModel.getEmail()
                    + "',rg='" + alunoModel.getRg()
                    + "',cpf='" + alunoModel.getCpf()
                    + "',data_nascimento=STR_TO_DATE('" + alunoModel.getDataNascimento() + "','%d-%m-%Y')"
                    + ",curso_fk_cadastro=(select id_curso from curso where nome_curso='" + alunoModel.getCurso() + "')"
                    + ",situacao='" + alunoModel.getSituacao()
                    + "',pendencia='" + alunoModel.getPendencia()
                    + "',data_matricula='" + alunoModel.getDataMatricula()
                    + "' WHERE nome='" + pAluno + "' and curso_fk_cadastro=(select id_curso from curso where nome_curso='" + pCurso + "');");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public int retornaQtdePorAluno(String pAluno) {
        int qtde = 0;
        try {
            this.conectar();
            this.executarSQL("select count(nome) from aluno_cadastro where nome='" + pAluno + "' group by nome");
            while (this.getResultSet().next()) {
                qtde = this.getResultSet().getInt(1);
            }
        } catch (Exception e) {
            e.toString();
            return 0;
        } finally {
            this.fecharConexao();
        }
        return qtde;
    }

    /**
     *
     * @return
     */
    public ArrayList<AlunoModel> getListaAlunoCadastro() {
        ArrayList<AlunoModel> listaModel = new ArrayList<>();
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("select matricula,nome,endereco,numero,complemento,cidade,cep,uf,bairro,celular,telefone,email,rg,cpf,data_nascimento,nome_curso,situacao,pendencia,data_matricula from aluno_cadastro join curso on curso_fk_cadastro=id_curso order by nome asc;");
            while (this.getResultSet().next()) {
                alunoModel = new AlunoModel();
                alunoModel.setMatricula(this.getResultSet().getInt(1));
                alunoModel.setNome(this.getResultSet().getString(2));
                alunoModel.setEndereco(this.getResultSet().getString(3));
                alunoModel.setNumero(this.getResultSet().getInt(4));
                alunoModel.setComplemento(this.getResultSet().getString(5));
                alunoModel.setCidade(this.getResultSet().getString(6));
                alunoModel.setCep(this.getResultSet().getString(7));
                alunoModel.setUf(this.getResultSet().getString(8));
                alunoModel.setBairro(this.getResultSet().getString(9));
                alunoModel.setCelular(this.getResultSet().getString(10));
                alunoModel.setTelefone(this.getResultSet().getString(11));
                alunoModel.setEmail(this.getResultSet().getString(12));
                alunoModel.setRg(this.getResultSet().getString(13));
                alunoModel.setCpf(this.getResultSet().getString(14));
                alunoModel.setDataNascimento(this.getResultSet().getString(15));
                alunoModel.setCurso(this.getResultSet().getString(16));
                alunoModel.setSituacao(this.getResultSet().getString(17));
                alunoModel.setPendencia(this.getResultSet().getString(18));
                alunoModel.setDataMatricula(this.getResultSet().getString(19));
                listaModel.add(alunoModel);
            }
        } catch (NumberFormatException | SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaModel;
    }
}
