package org.rk.javauniverse.webapp.runnerz.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {

    private static final Logger log = LoggerFactory.getLogger(RunRepository.class);
    private final JdbcClient jdbcClient;

    public RunRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

    public List<Run> findAll(){

        return jdbcClient.sql("SELECT * FROM RUN").query(Run.class).list();
    }

    public Optional<Run> findById(Integer id){
        return jdbcClient.sql("SELECT * FROM RUN WHERE ID = :id")
                .param("id", id)
                .query(Run.class)
                .optional();
    }

    public void create(Run run){

        int updated = jdbcClient.sql("INSERT INTO RUN(ID, TITLE, STARTED_ON, COMPLETED_ON, MILES, LOCATION) VALUES(?,?,?,?,?,?)")
                .param(List.of(run.id(), run.title(), run.startedOn(), run.completedOn(), run.miles(), run.location().toString()))
                .update();

        Assert.state(updated == 1, "Failed to create run "+ run.title());
    }











}
