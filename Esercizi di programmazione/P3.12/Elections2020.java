/*
Esercizio P3.12. Progettate e realizzate una classe VotingMachine che possa essere udlizzata per una semplice elezione,
con i metodi per azzerare inizialmente il conteggio dei voti, per assegnare un voto ai Democratici,
per assegnare un voto ai Repubblicani e per conoscere il numero totale di voti per ciascuno dei due partiti. 
Otterrete una valutazione migliore se il vostro programma, nel caso in cui la situazione sia di parità dopo le ore 20 del primo giovedì di Novembre,
è in grado di assegnare la vittoria al partito che preferite. Suggerimento: usate la classe GregorianCalendar, già vista nel Progetto di programmazione 2.1.
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Elections2020
{

  public static void main(String[] args)
  {

    VotingMachine elezioni = new VotingMachine(0,0);

    GregorianCalendar electionDay = new GregorianCalendar(2020, (Calendar.NOVEMBER), 05, 20, 00);
    GregorianCalendar today = new GregorianCalendar();

    elezioni.democratsVote();
    elezioni.democratsVote();

    elezioni.republicansVote();
    elezioni.republicansVote();

    System.out.println("Repubblicani = " + elezioni.totalVotesRepublicans());

    System.out.println("Democratici = " + elezioni.totalVotesDemocrats());

    if(elezioni.totalVotesRepublicans() == elezioni.totalVotesDemocrats())
    {

      if(today.compareTo(electionDay) == 1)
      {

        System.out.println("Democrats Wins!");

      }

    }

    System.exit(0);

  }

}
