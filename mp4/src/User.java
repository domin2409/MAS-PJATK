import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private static Set<Integer> idSet = new HashSet<>();        //unique

    private int id;
    private String username;
    private String password;
    private Set<Group> groupsMemberships;
    private Set<Group> adminOfThoseGroups;
    private List<Badge> badges;
    private Set<Pet> pets;

    public void addUserPet(Pet pet) throws Exception {

            if (pets.stream().anyMatch(c -> c instanceof Cat) && pet instanceof Cat) {
                pets.add(pet);
            } else if (pets.stream().anyMatch(c -> c instanceof Dog) && pet instanceof Dog){
                pets.add(pet);
            } else if (pets.isEmpty()) {
                pets.add(pet);
            } else {
                throw new Exception("Tried adding incompatible animals");
            }
        System.out.println("User "+username+" got a new pet "+ pet.getName());
    }

    public static Set<Integer> getIdSet() {
        return idSet;
    }



    public User(int id, String username, String password) throws Exception {
        if (idSet.contains(id)) {
            throw new Exception("User ID must be unique");
        }
        this.id = id;
        idSet.add(id);
        this.username = username;
        setPassword(password);
        this.groupsMemberships = new HashSet<>();
        this.adminOfThoseGroups = new HashSet<>();
        this.pets = new HashSet<>();
        // initialize other attributes
    }

    public void setPassword(String password) throws Exception {     //atribute restrain
        if (password.length() < 8) {
            throw new Exception("Password must be at least 8 characters long");
        }
        this.password = password;
    }
//    public Set<String> getSubsetMemberships() {
//        return subsetMemberships;
//    }

//    public boolean isSubsetAdmin(String subsetName) {
//        return subsetMemberships.contains(subsetName) && interests.contains(subsetName + " admin");
//    }
    public void addBadge(Badge badge){
        badge.setTimeOfGetting("21:38");
        badges.add(badge);
        System.out.println(badge);
    }
    public void joinSubset(Group newGroup) throws Exception {
        if (groupsMemberships.contains(newGroup)) throw new Exception("Already a member of this group!");
        groupsMemberships.add(newGroup);
    }
    // getters and setters for other attributes

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

//    public Set<String> getInterests() {
//        return interests;
//    }


    void becomeAdmin(Group group) throws Exception {
        if(!groupsMemberships.contains(group)) throw new Exception("User doesn't belong to the group!");
        adminOfThoseGroups.add(group);
    }
}
