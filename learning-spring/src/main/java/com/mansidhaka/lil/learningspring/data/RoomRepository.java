package com.mansidhaka.lil.learningspring.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //just to tell this is data repository
public interface RoomRepository extends CrudRepository<Room,Long> {
}
