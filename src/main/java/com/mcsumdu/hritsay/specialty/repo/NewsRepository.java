package com.mcsumdu.hritsay.specialty.repo;

import com.mcsumdu.hritsay.specialty.models.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository  extends CrudRepository<News, Long> {
}
