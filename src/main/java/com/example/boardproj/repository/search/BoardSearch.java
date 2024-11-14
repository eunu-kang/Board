package com.example.boardproj.repository.search;

import com.example.boardproj.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardSearch {
    //동적 검색기능을 추가한다.

    Page<Board> searchAll(String[] types, String keyword, Pageable pageable);

//    Page<Board> searchAll(String[] types, String keyword, LocalDate localDate, Pageable pageable);

}
