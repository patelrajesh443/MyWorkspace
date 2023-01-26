package com.example.service.imp;

import com.example.repo.AccountRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {
    private final AccountRepo accountRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return accountRepo.findAccountByUsername(username)
                .map(account -> new User(account.getUsername(), account.getPassword(), account.isActive(), account.isActive(), account.isActive(), account.isActive(), AuthorityUtils.createAuthorityList("ROLE_ADMIN", "ROLE_USER"))).orElseThrow(() -> new UsernameNotFoundException(username + " username not found"));
    }
}
