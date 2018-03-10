package com.jha.abhishek.hackernews.repositories;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;
import com.jha.abhishek.hackernews.entities.HackernewsStories;

public interface HackernewsRepository extends Repository<HackernewsStories, Long> {

	Optional<HackernewsStories> findById(Long id);

	Optional<List<HackernewsStories>> findByScoreGreaterThan(Long score);

	Optional<List<HackernewsStories>> findByTitleContaining(String matchingText);

	Optional<List<HackernewsStories>> findByTitleContainingAndScoreGreaterThan(String matchingText, Long score);

	Optional<List<HackernewsStories>> findByBy(String by);

	Optional<List<HackernewsStories>> findByTimeBetween(Timestamp start, Timestamp end);

	Optional<List<HackernewsStories>> findByTimeBetweenAndScoreGreaterThan(Timestamp start, Timestamp end, Long score);

	Optional<List<HackernewsStories>> findByTitleContainingAndScoreGreaterThanAndTimeBetween(String matchingText,
			Long score, Timestamp start, Timestamp end);
}
