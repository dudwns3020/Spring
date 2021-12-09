package com.exam.demo.service;

import org.springframework.stereotype.Service;

import com.exam.demo.repository.ReactionPointRepository;

@Service
public class ReactionPointService {
	private ReactionPointRepository reactionPointRepository;

	public ReactionPointService(ReactionPointRepository reactionPointRepository) {
		this.reactionPointRepository = reactionPointRepository;
	}

	public boolean actorCanMakeReactionPoint(int actorId, String relTypeCode, int relId) {
		
		
		
		return reactionPointRepository.getSumReactionPoinByMemberId(relTypeCode, relId, actorId) == 0;
	}
}
