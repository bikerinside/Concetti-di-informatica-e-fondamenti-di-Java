public class VotingMachine
{
  /*costruttore che azzera tutti i voti*/
  public VotingMachine(int setZeroVoteD, int setZeroVoteR)
  {

    democrats = 0;

    republicans = 0;

  }
  // assegna un voto ai a favore dei democratici
  public void democratsVote()
  {

    democrats += 1;

  }
  // assegna un voto a favore dei repubblicani
  public void republicansVote()
  {

    republicans += 1;

  }

  public int totalVotesDemocrats()
  {

    return democrats;

  }

  public int totalVotesRepublicans()
  {

    return republicans;

  }

  private int democrats;

  private int republicans;

}
