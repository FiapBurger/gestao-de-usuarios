package com.fiap.gestaoUsuarios.core.usecase;

import com.fiap.gestaoUsuarios.core.ports.out.DeletarPacienteOutputPort;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class DeletarClienteUseCaseTest {

    @Mock
    DeletarPacienteOutputPort deletarPacienteOutputPort;
    AutoCloseable mock;

    @BeforeEach
    void setUp() {
        mock = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        mock.close();
    }

    @Test
    public void deveTestardeletarClienteUsecase() {

        DeletarPacienteUseCase deletarClienteUseCase = new DeletarPacienteUseCase(deletarPacienteOutputPort);
        var cpf = "545.464.180-43";
        doNothing().when(deletarPacienteOutputPort).deletar(any(String.class));
        deletarClienteUseCase.deletar(cpf);

        verify(deletarPacienteOutputPort, times(1)).deletar(any(String.class));
    }
}