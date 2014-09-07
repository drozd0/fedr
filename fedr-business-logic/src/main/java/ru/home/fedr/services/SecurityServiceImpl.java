package ru.home.fedr.services;

import ru.home.fedr.db.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service("securityService")
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails getCurrectUser() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userCredentials = userService.loadUserByUsername(username);
        return new UserDetails() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                GrantedAuthority grantedAuthority = new GrantedAuthority() {
                    @Override
                    public String getAuthority() {
                        return userCredentials.getRole().getRoleName();
                    }
                };
                ArrayList<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add(grantedAuthority);
                return authorities;
            }

            @Override
            public String getPassword() {
                return userCredentials.getPassword();
            }

            @Override
            public String getUsername() {
                return userCredentials.getEmail();
            }

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isEnabled() {
                return true;
            }
        };

    }
}
