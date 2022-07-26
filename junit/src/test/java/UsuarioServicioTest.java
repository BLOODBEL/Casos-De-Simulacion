import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsuarioServicioTest {

    private UsuarioServicio usuarioServicio;

    @BeforeEach
    public void setUp(){
        usuarioServicio = new UsuarioServicio();

        usuarioServicio.crearUsuario(043L,"Primer usuario");
        usuarioServicio.crearUsuario(221L,"Segundo usuario");
    }

    @DisplayName("Dado un usuario que queremos crear" +
            "Cuando llamamos a ´crearUsuario´" +
             "Esperamos que el usuario este creado" +
            "")
    @Test
    public void test1(){
        UsuarioDto esperado = new UsuarioDto(112L, "Esteban");

     final UsuarioDto resultado = usuarioServicio.crearUsuario(112L,"Esteban");
     Assertions.assertEquals(esperado.id, resultado.id);
     Assertions.assertEquals(esperado.nombre, resultado.nombre, "Los nombres son distintos");
     Assertions.assertEquals(esperado,resultado);

    }

    @Test
    public void test2() {
        UsuarioDto esperado = new UsuarioDto(112L, "Ramiro");

        final UsuarioDto resultado = usuarioServicio.crearUsuario(112L, "Esteban");

        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertNotEquals(esperado.nombre, resultado.nombre, "Los nombres no son diferentes");
        Assertions.assertNotEquals(esperado, resultado);
    }
    @Test
    public void test3() {

        final UsuarioDto resultado = usuarioServicio.obtenerUsuario(112L);

        Assertions.assertEquals(null, resultado);
       }

    @Test
    public void test4() {
        UsuarioDto esperado = new UsuarioDto(043L, "Primer usuario");

        final UsuarioDto resultado = usuarioServicio.obtenerUsuario(043L);

         Assertions.assertEquals(esperado, resultado);
    }
    }
