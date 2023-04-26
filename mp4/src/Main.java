public class Main {
    public static void main(String[] args) throws Exception {

        // Creating some users with unique IDs
        User user1 = new User(1, "John Doe", "12345678");
        User user2 = new User(2, "Jane Smith", "password2");
        User user3 = new User(3, "Bob Johnson", "password3");
//        User user4 = new User(3, "Bob Johnson", "password3");

        Dog celinka = new Dog("celisia");
        Cat maja = new Cat("Maja");

        user1.addUserPet(celinka);
//        user1.addUserPet(maja);


// Trying to create another user with the same ID as user1
//        User user4 = new User(user1.getId(),"Mary Brown", "password4");

//// Creating some interest groups
//        Set<String> musicInterests = new HashSet<>(Arrays.asList("Rock", "Pop", "Jazz"));
//        Set<String> sportsInterests = new HashSet<>(Arrays.asList("Football", "Basketball", "Tennis"));

// Adding some users to the groups
        Group musicGroup = new Group("Music Lovers");
        musicGroup.addGroupMember(user1);
        musicGroup.addGroupMember(user2);

        Group sportsGroup = new Group("Sports Fans");
        sportsGroup.addGroupMember(user2);
        sportsGroup.addGroupMember(user3);

// Trying to add a user as admin of a group they are not a member of
        sportsGroup.setSubsetAdmin(user2);
        musicGroup.setSubsetAdmin(user1);
        System.out.print(sportsGroup.getUsers());
// Trying to add a user to a group they don't share any interests with
//        musicGroup.addGroupMember(user3);

    }
}