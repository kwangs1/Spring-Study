package Spring.Studey.Test.common.Reply.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Spring.Studey.Test.board.DAO.BoardDAO;
import Spring.Studey.Test.board.VO.BoardVO;
import Spring.Studey.Test.common.Reply.DAO.ReplyDAO;
import Spring.Studey.Test.common.Reply.VO.ReplyVO;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private ReplyDAO replyDAO;
	@Autowired
	private BoardDAO boardDAO;

	
	//��۸���Ʈ
	@Override
	public List<ReplyVO> getReplyList(int bno)throws Exception{
		return replyDAO.getReplyList(bno);
	}
	
	//����ۼ�
	@Override
	public int addReply(ReplyVO replyVO)throws Exception{
		return replyDAO.addReply(replyVO);
	}
	
	//��ۼ���
	@Override
	public int updateReply(ReplyVO replyVO)throws Exception{	
		return replyDAO.updateReply(replyVO);
	}
	
	//��ۻ���
	@Override
	public int deleteReply(int rno)throws Exception{
		
		ReplyVO reply = new ReplyVO();
		reply.setBno(reply.getBno());
		reply.setRating(reply.getRating());
		replyDAO.updateRating(reply);

		return replyDAO.deleteReply(rno);
	}
	
//----------------------------------
	
	//��� ���
	@Override
	public int WriteReReply(ReplyVO replyVO)throws Exception{
		return replyDAO.WriteReReply(replyVO);
	}
	
	//��� ����
	@Override
	public int UpdateReReply(ReplyVO replyVO)throws Exception{
		return replyDAO.updateReply(replyVO);
	}
	
	@Override
	public double ratingAvg(int bno) {
		Double ratingAvg = replyDAO.ratingAvg(bno);
		if(ratingAvg == null) {
			ratingAvg = 0.0;
		}
		
		ratingAvg = (double)(Math.round(ratingAvg*10));
		ratingAvg = ratingAvg/10;
		return ratingAvg;
	}
	
}
