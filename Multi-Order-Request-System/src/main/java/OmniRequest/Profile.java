public class Profile(){
    private int name;
        private String email;
        private password;

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Profile profile = (Profile) object;
        return name == profile.name && age == profile.age && java.util.Objects.equals(email, profile.email);
    }

    public Profile() {
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), name, email, age);
    }

    private int age;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    }



