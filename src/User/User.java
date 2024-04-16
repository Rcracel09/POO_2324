package POO_2324.src.User;


public class User {
    
    private int code;
    private String name;
    private String residence;
    private String email;
    private int ahr;
    public enum TypeOfUser {
        AMETEUR,
        PROFESSIONAL,
        OCCASIONAL
    }
    private TypeOfUser typeofuser;
}
