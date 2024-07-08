import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Datas {

    public int quantosAnosAPessoaViveu(int anoQueAPessoaNasceu){


        LocalDate dataAtual = LocalDate.now();


        long anos = ChronoUnit.YEARS.between(LocalDate.of(anoQueAPessoaNasceu, 1, 1), dataAtual);
        long meses = ChronoUnit.MONTHS.between(LocalDate.of(anoQueAPessoaNasceu, 1, 1).plusYears(anos), dataAtual);
        long dias = ChronoUnit.DAYS.between(LocalDate.of(anoQueAPessoaNasceu, 1, 1).plusYears(anos).plusMonths(meses), dataAtual);

        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de vida.");


        return anoQueAPessoaNasceu;
    }

}
