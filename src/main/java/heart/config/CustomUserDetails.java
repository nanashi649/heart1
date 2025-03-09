package heart.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUserDetails extends User {
    private final String groupName; // グループ名を保持

    public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, String groupName) {
        super(username, password, authorities);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
