public class Planeta 
{
    //DOCUMENTAR hola
    String nom;
    int diametre;
    int pes;    

    //DOCUMENTAR
    //Contructor amb tots els parametres    
    public Planeta(String nom, int diametre, int pes)
    {
        this.nom = nom;
        this.diametre = diametre;
        this.pes = pes;
    }

    //DOCUMENTAR
    //Contructor buit
    public Planeta(){}

    //DOCUMENTAR
    public int planetaEnano()
    {
        if(this.diametre < 1300)
        {
            return 1;
        }
        else
        {
            return 0;
        }        
    }

    //DOCUMENTAR
    public void expansio()
    {        
        //ACABAR
    }

    //DOCUMENTAR
    public int colisio(int meteorito)
    {
        //ACABAR
        return -1;
       
    }

    //Getters i setters
    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getDiametre()
    {
        return this.diametre;
    }

    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }
    
    public int getPes()
    {
        return this.pes;
    }

    public void setPes(int pes)
    {
        this.pes = pes;
    }    
}
