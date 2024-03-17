// package backtracking;

public class findSubset {
    public static void subset(String str, String ne ,int i)
    {
  if(i==str.length())
  {
    if(ne.length()==0)
    {
      System.out.println("NULL");
    }
    else{
        System.out.println(ne);
    }
    return ;
  }

  //yes
  subset(str, ne+str.charAt(i), i+1);

  //noo
  subset(str, ne, i+1);
    }
public static void main(String[] args) {
    String str ="abc";
    subset(str, "", 0);
}
}
