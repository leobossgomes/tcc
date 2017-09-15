package modelo;

public class UsuarioDTO {

    String email;
    String senha;
    String usuario;
    int codigo;

    public UsuarioDTO() {
        }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public UsuarioDTO(String email,String senha, String usuario) {
        this.email = email;
        this.senha = senha;
        this.usuario = usuario;
       
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
