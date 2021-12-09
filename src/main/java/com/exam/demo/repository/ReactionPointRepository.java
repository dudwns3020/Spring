package com.exam.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ReactionPointRepository {
	@Select("""
			<script>
			SELECT IFNULL(SUM(RP.point),0) AS s
			FROM reactionPoint AS RP
			WHERE RP.relTypeCode = 'article'
			AND RP.relId = #{id}
			AND RP.memberId = #{memberId}
			</script>
			""")
	public int getSumReactionPoinByMemberId(String relTypeCode, int id, int memberId);

}
