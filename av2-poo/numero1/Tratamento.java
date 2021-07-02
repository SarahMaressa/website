import java.util.Date;
import java.util.Calendar;

public class Tratamento{
    public static void TratarUsuario(Usuario usuario) throws IdadeException, AnoException, MesException, NomeException{
        if(usuario.getIdade() < 18 || usuario.getIdade() > 100){
            throw new IdadeException();
        }

        Date dt = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int anoAtual = cal.get(Calendar.YEAR);
        if(usuario.getAno() < 1980 || usuario.getAno() > anoAtual) {
            throw new AnoException();
        }

        if(usuario.getMes() < 1 || usuario.getMes() > 12){
            throw new MesException();
        }
        replaceAll(" ", "");
        if(usuario.getNome().equals("") || usuario.getNome() == null){
            throw new NomeException();
        }
    }

    private static void replaceAll(String string, String string2) {
    }
}
       