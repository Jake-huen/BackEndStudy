package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id)  {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return this.id.equals(user.id); // 고객 id가 같으면 같은 것이다.
//    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

}
