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
     *
     * @param pNome
     * @return
     */
    public AlunoModel getAluno(String pNome) {
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM aluno WHERE nome = '" + pNome + "'" + ";");

            while (this.getResultSet().next()) {
                alunoModel.setIdAluno(this.getResultSet().getInt(1));
                alunoModel.setNome(this.getResultSet().getString(2));
                alunoModel.setIdCursoFk(this.getResultSet().getInt(3));

            }
        } catch (SQLException e) {
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
            this.executarSQL("SELECT nome FROM aluno where status_aluno='ATIVO';");
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
            this.executarSQL("SELECT * FROM aluno order by nome asc;");
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
     * retorna nome curso e status
     *
     * @return
     */
    public ArrayList<AlunoModel> getListaAlunoCursoDao() {
        ArrayList<AlunoModel> listaModel = new ArrayList<>();
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT nome,nome_curso,status_aluno from aluno join curso on id_curso_fk=id_curso order by nome asc;");
            while (this.getResultSet().next()) {
                alunoModel = new AlunoModel();
                alunoModel.setNome(this.getResultSet().getString(1));
                alunoModel.setCurso(this.getResultSet().getString(2));
                alunoModel.setStatus(this.getResultSet().getString(3));
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
            this.executarSQL("select nome_curso from curso join aluno on id_curso_fk = id_curso where nome= '" + pAluno + "'" + ";");

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
     * @param pCurso
     * @param pStatus
     * @return
     */
    public boolean salvarAluno(String pAluno, String pCurso, String pStatus) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("insert into aluno(nome, id_curso_fk,status_aluno) values ('" + pAluno + "',(select id_curso from curso where nome_curso='" + pCurso + "'),'" + pStatus + "');");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    /**
     *
     * @param alunoModel
     * @return
     */
    public boolean inserirAluno(AlunoModel alunoModel) {
        try {
            this.conectar();
            //  return this.executarInsertUpdateSQL("insert into aluno_cadastro(matricula,nome,endereco,numero,complemento,cidade,cep,uf,bairro,celular,telefone,email,rg,cpf,data_nascimento,curso_fk_cadastro,situacao,pendencia) values();");
            //"matricula,nome,endereco,numero,complemento,cidade,cep,uf,bairro,celular,telefone,email,rg,cpf,data_nascimento,curso,situacao,pendencia"
            return this.executarInsertUpdateSQL("insert into aluno_cadastro(matricula,nome,endereco,numero,complemento,cidade,cep,uf,bairro,celular,telefone,email,rg,cpf,data_nascimento,curso_fk_cadastro,situacao,pendencia) values(" + alunoModel.getMatricula() + ",'" + alunoModel.getNome() + "','" + alunoModel.getEndereco() + "','" + alunoModel.getNumero() + "','" + alunoModel.getComplemento() + "','" + alunoModel.getCidade() + "','" + alunoModel.getCep() + "','" + alunoModel.getUf() + "','" + alunoModel.getBairro() + "','" + alunoModel.getCelular() + "','" + alunoModel.getTelefone() + "','" + alunoModel.getEmail() + "','" + alunoModel.getRg() + "','" + alunoModel.getCpf() + "','" + alunoModel.getDataNascimento() + "',(select id_curso from curso where nome_curso='" + alunoModel.getCurso() + "'),'" + alunoModel.getSituacao() + "','" + alunoModel.getPendencia() + "');");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
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
            this.executarSQL("select matricula,nome,endereco,numero,complemento,cidade,cep,uf,bairro,celular,telefone,email,rg,cpf,data_nascimento,nome_curso,situacao,pendencia from aluno_cadastro join curso on curso_fk_cadastro=id_curso where id_curso=34 order by nome asc;");
            while (this.getResultSet().next()) {
                alunoModel = new AlunoModel();
                
                alunoModel.setMatricula(this.getResultSet().getInt(1));
                alunoModel.setNome(this.getResultSet().getString(2));
                
                
                alunoModel.setMatricula(this.getResultSet().getInt(2));
                alunoModel.setBairro(this.getResultSet().getString(10));
                alunoModel.setCelular(this.getResultSet().getString(11));
                alunoModel.setCep(this.getResultSet().getString(8));
                alunoModel.setCidade(this.getResultSet().getString(7));
                alunoModel.setCpf(this.getResultSet().getString(15));
                alunoModel.setCurso(this.getResultSet().getString(17));
                alunoModel.setDataNascimento(this.getResultSet().getString(16));
                alunoModel.setEmail(this.getResultSet().getString(13));
                alunoModel.setEndereco(this.getResultSet().getString(4));
                alunoModel.setNome(this.getResultSet().getString(3));
                alunoModel.setRg(this.getResultSet().getString(14));
                alunoModel.setStatus(this.getResultSet().getString(18));
                alunoModel.setUf(this.getResultSet().getString(9));
                alunoModel.setTelefone(this.getResultSet().getString(12));
                alunoModel.setNumero(this.getResultSet().getInt(5));
                alunoModel.setComplemento(this.getResultSet().getString(6));
                alunoModel.setPendencia(this.getResultSet().getString(19));

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
