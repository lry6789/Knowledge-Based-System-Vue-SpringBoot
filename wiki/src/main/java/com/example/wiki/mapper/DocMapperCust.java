package com.example.wiki.mapper;

import com.example.wiki.domain.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocMapperCust {

    public void increaseViewCount(@Param("id") Long id);

    public void increaseVoteCount(@Param("id") Long id);
}
