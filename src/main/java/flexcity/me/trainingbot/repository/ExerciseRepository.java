package flexcity.me.trainingbot.repository;

import flexcity.me.trainingbot.domain.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
