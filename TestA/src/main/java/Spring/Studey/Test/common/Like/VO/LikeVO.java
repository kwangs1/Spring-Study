package Spring.Studey.Test.common.Like.VO;

import org.springframework.stereotype.Component;

@Component("likeVO")
public class LikeVO {
	private int lno;
	private int bno;
	private String id;
	private int like_type;
	
	
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLike_type() {
		return like_type;
	}
	public void setLike_type(int like_type) {
		this.like_type = like_type;
	}
	
	
}
