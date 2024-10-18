package kr.kh.petvely.model.user;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import kr.kh.petvely.model.vo.MemberVO;
import lombok.Data;

@Data
public class CustomUser extends User {
	
	private MemberVO member;
	
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}
	public CustomUser(MemberVO vo) {
		super(	vo.getMe_id(),
				vo.getMe_pw(), 
				Arrays.asList(new SimpleGrantedAuthority(vo.getMe_authority())));
		System.out.println(vo.getMe_id());
		this.member = vo;
	}
	public int getMe_num() {
		// TODO Auto-generated method stub
		return 0;
	}


}
