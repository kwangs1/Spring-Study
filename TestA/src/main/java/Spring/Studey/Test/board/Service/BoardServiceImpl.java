package Spring.Studey.Test.board.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.Studey.Test.board.DAO.BoardDAO;
import Spring.Studey.Test.board.VO.BoardVO;
import Spring.Studey.Test.common.Like.VO.LikeVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<Map<String,Object>> list()throws Exception{
		return boardDAO.list();
	}
	
	@Override
	public BoardVO detail(int bno)throws Exception{
		BoardVO vo = boardDAO.detail(bno);
		return vo;
	}
	
	@Override
	public void UpdateReplyCount(int bno) throws Exception {
		boardDAO.UpdateReplyCount(bno);
	}
	
}
