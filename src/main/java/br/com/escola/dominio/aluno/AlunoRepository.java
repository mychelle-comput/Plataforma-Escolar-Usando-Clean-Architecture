package br.com.escola.dominio.aluno;

import java.util.List;

public interface AlunoRepository  {

    void matricular (Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);
    List<Aluno> listarTodosAlunosMatriculados();

}
