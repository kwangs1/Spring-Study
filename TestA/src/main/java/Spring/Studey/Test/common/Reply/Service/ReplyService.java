package Spring.Studey.Test.common.Reply.Service;

import java.util.List;

import Spring.Studey.Test.board.VO.BoardVO;
import Spring.Studey.Test.common.Reply.VO.ReplyVO;

public interface ReplyService {

	List<ReplyVO> getReplyList(int bno) throws Exception;

	int addReply(ReplyVO replyVO) throws Exception;

	int updateReply(ReplyVO replyVO) throws Exception;

	int deleteReply(int rno) throws Exception;

	int WriteReReply(ReplyVO replyVO) throws Exception;

	int UpdateReReply(ReplyVO replyVO) throws Exception;

	double ratingAvg(int bno);
}
