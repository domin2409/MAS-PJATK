import java.util.*;

public class Group {
    private String name;
    private List<User> users = new ArrayList<>();

    private int timeSinceGroupNameChange;



    public String getUsers() {
        StringBuilder sb = new StringBuilder();
        for (User user : users) {
            sb.append(user.getUsername()).append("\n");
        }
        return sb.toString();
    }

    private List<User> admins = new ArrayList<>();
//    private Map<String, Set<User>> subsets = new HashMap<>();

    public Group(String name) {
        this.name = name;
        this.users = new ArrayList<>();
    }
//    public void addUser(User user) throws Exception {
//        if (users.stream().anyMatch(u -> u.getId() == user.getId())) {
//            throw new Exception("User ID must be unique");
//        }
//        users.add(user);
//    }

    public void addGroupMember(User user) throws Exception {
        if (users.contains(user)) {
            throw new Exception("User already is a member");
        }
        users.add(user);
        user.joinSubset(this);
        System.out.println("New member was added: "+ user.getUsername());

    }

//    public void createSubset(String subsetName) throws Exception {
//        if (subsets.containsKey(subsetName)) {
//            throw new Exception("Subset already exists");
//        }
//        subsets.put(subsetName, new HashSet<>());
//    }

    public void setGroupName(String newGroupName) throws Exception {
        if (this.users.size() == 0) throw new Exception("Group already has members!");
        System.out.println("Group changing name from: "+this.name+" to: " + newGroupName);
        this.name = newGroupName;
        this.timeSinceGroupNameChange = 0;
    }

    public void setSubsetAdmin(User user) throws Exception {
        if (!users.contains(user)) {
            throw new Exception("User is not a member");
        }

        if (admins.contains(user)) {
            throw new Exception("User already has admin privileges for this group");
        }
        admins.add(user);
        user.becomeAdmin(this);
        System.out.println("New admin was set: "+ user.getUsername());
    }

    // other methods for managing subsets and subset memberships
}