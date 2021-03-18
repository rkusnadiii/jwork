
public class Job
{

    /**
 * @author : Ricky
 * @version : 18/03/2021
*/
    private int id;
    private String name;
    private int fee;
    private String category;
    private Recruiter recruiter;

    public Job(int id, String name, Recruiter recruiter, int fee, String category) {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;

    }

    public int getId() { return id; }
    
    public String getName() { return name; }
    
    public int getFee() { return fee; }
    
    public String getCategory() { return category; }

    public Recruiter getRecruiter() { return recruiter; }

    public void setRecruiter(Recruiter recruiter) { this.recruiter = recruiter; }
    
    public void setId(int id) { this.id = id; }
    
    public void setName(String name) { this.name = name; }
    
    public void setFee(int fee) { this.fee = fee; }
    
    public void setCategory(String category) { this.category = category; }

    public void printData(){}

    

}